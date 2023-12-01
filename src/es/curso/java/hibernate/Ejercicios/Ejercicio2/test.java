package es.curso.java.hibernate.Ejercicios.Ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Recursos.ArchivoServicio;
import es.curso.java.hibernate.Ejercicios.Ejercicio1.dao.UserDAO;
import es.curso.java.hibernate.Ejercicios.Ejercicio1.entity.UserEntity;
import es.curso.java.hibernate.basics.entities.Alumno;
import es.curso.java.hibernate.basics.entities.Producto;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class test {

	public static void main(String[] args) throws ParseException {
		test ejer1 = new test();
		EntityManager em = JpaUtil.getEM("Oracle");
		UserDAO userDao = new UserDAO();
		UserEntity userE = new UserEntity(1, "N1", "A1", "1A", new Date());
		userDao.insertarUsuario(userE, em);
		ejer1.crearArchivo("pruebaOracle", userE);
		String rutaArchivo = "D:\\Workspace\\PrimerProyecto\\src\\es\\curso\\java\\hibernate\\Ejercicios\\Ejercicio2\\fichero_carga_ejercicio2.txt";
		ejer1.cargarProductosDesdeArchivo(rutaArchivo, em);
		ejer1.mostrarProductos(em);
		System.out.println("Introduce la fecha a buscar en formato yyyy-MM-dd: ");
		Scanner scanner = new Scanner(System.in);
		String sFecha = scanner.next();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = sdf.parse(sFecha );
		
		//LocalDate fecha1 = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		scanner.close();
		ejer1.mostrarProductosPorFecha(em, fecha);
		ejer1.mostrarMediaPrecioYTotalPorTipo(em);
	}

	public void crearArchivo(String nombre, UserEntity user) {
		File archivo = new File(nombre + ".txt");
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))) {
			SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyyMMdd");

			buffer.append(user.getId() + ";").append(user.getNombre() + ";").append(user.getApellidos() + ";")
					.append(formatoFecha.format(user.getFechaAlta()) + ";");
			// buffer.close();
			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void cargarProductosDesdeArchivo(String rutaArchivo, EntityManager em) {
		EntityTransaction transaction = em.getTransaction();

		try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
			System.out.println("Begin Load");
			String linea;
			br.readLine();
			transaction.begin();
			while ((linea = br.readLine()) != null) {
				String[] datos = linea.split(";");
				String nombre = datos[0];
				String tipo = datos[1];
				SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
				Date fechaAlta =formatoFecha.parse(datos[2]);
				Double precio = new Double(datos[3]);
				int unidades = Integer.parseInt(datos[4]);

				Producto producto = new Producto();
				producto.setNombre(nombre);
				producto.setTipo(tipo);
				producto.setFechaAlta(fechaAlta);
				producto.setPrecio(precio);
				producto.setUnidades(unidades);

				em.persist(producto);
			}
			transaction.commit();
			System.out.println("Transacción confirmada correctamente.");
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
				System.out.println("Transacción rollback debido a un error.");
			}
		}
	}

	public static void mostrarProductos(EntityManager em) {
		try {
			em.getTransaction().begin();
			String sql = "SELECT * FROM TB_PRODUCTO";
			Query consulta = em.createNativeQuery(sql, Producto.class);
			List<Producto> productos = consulta.getResultList();

			for (Producto producto : productos) {
				System.out.println(producto);
			}

			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
				System.out.println("Transacción rollback debido a un error.");
			}
		}
	}

	public static void mostrarProductosPorFecha(EntityManager em, Date fechaABuscar) {
		try {
			em.getTransaction().begin();
			System.out.println(fechaABuscar);
			//String sql = "SELECT * FROM TB_PRODUCTO WHERE FECHA_ALTA = TO_DATE(:fechaABuscar, 'dd-MM-yy')";
			Query consulta = em.createQuery("from Producto p where p.fechaAlta = :fechaABuscar", Producto.class);
			consulta.setParameter("fechaABuscar", fechaABuscar);

			List<Producto> productos = consulta.getResultList();

			System.out.println("Productos dados de alta en la fecha " + fechaABuscar + ":");
			for (Producto producto : productos) {
				System.out.println(producto);
			}

			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
				System.out.println("Transacción rollback debido a un error.");
			}
		}

	}
	public static void mostrarMediaPrecioYTotalPorTipo(EntityManager em) {
	    try {
	        em.getTransaction().begin();

	        String hql = "SELECT p.tipo, AVG(p.precio), COUNT(p) FROM Producto p GROUP BY p.tipo";
	        Query consulta = em.createQuery(hql);

	        List<Object[]> resultados = consulta.getResultList();

	        System.out.println("Media de precio y total de productos por tipo:");
	        for (Object[] resultado : resultados) {
	            String tipo = (String) resultado[0];
	            Double mediaPrecio = (Double) resultado[1];
	            Long totalProductos = (Long) resultado[2];

	            System.out.println("Tipo: " + tipo + ", Media de Precio: " + mediaPrecio + ", Total de Productos: " + totalProductos);
	        }

	        em.getTransaction().commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (em.getTransaction().isActive()) {
	            em.getTransaction().rollback();
	            System.out.println("Transacción rollback debido a un error.");
	        }
	    }
	}

}

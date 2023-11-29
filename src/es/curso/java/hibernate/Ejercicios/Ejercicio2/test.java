package es.curso.java.hibernate.Ejercicios.Ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Recursos.ArchivoServicio;
import es.curso.java.hibernate.Ejercicios.Ejercicio1.dao.UserDAO;
import es.curso.java.hibernate.Ejercicios.Ejercicio1.entity.UserEntity;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class test {

	public static void main(String[] args) {
//Consultar la tabla TB_USUARIO y guardar en fichero
		test ejer1 = new test();
		EntityManager em = JpaUtil.getEM("Oracle");
		UserDAO userDao = new UserDAO();
		UserEntity userE = new UserEntity(1, "N1", "A1", "1A", new Date());
		userDao.insertarUsuario(userE, em);
		ejer1.crearArchivo("pruebaOracle", userE);

	}

	// El fichero tendrá la cabecera con los nombres de las columnas de esta forma:
	// "ID;NOMBRE;APELLIDOS;FECHA"-----"1;N1;A1;yyyyMMdd"
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

}

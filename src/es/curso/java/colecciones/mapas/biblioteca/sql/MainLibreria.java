package es.curso.java.colecciones.mapas.biblioteca.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import es.curso.java.bbdd.UtilidadesBasesDatos;
import es.curso.java.introduccion.utils.Utilidades;

public class MainLibreria {

	public static void main(String[] args) {
		MainLibreria mainLibreria = new MainLibreria();
		mainLibreria.iniciaLibreria();

	}

	private void iniciaLibreria () {

       Connection connection=UtilidadesBasesDatos.conectaBasesDatos();

		Biblioteca biblioteca = new Biblioteca("Biblioteca1");
		int opcion=0;
		int opcion2= 0;
		do {
			//Mostrar los libros disponibles
			//biblioteca.mostrarLibrosDisponibles();
			
			//Pinta Menu
			String[] preguntas = {"1. Biblioteca1","2. Biblioteca2 ","3. Biblioteca3","4. Salir"};
			opcion = Utilidades.pintarMenu(preguntas,"Seleccione una biblioteca:" );
			
			switch (opcion) {
			case 1:  String[] menu2 = {"1. Mostrar Info biblioteca","2. Mostrar Libros de la biblioteca", 
					"3. Buscar Libro" ,"4. Insertar Libro" ,"5. Modificar.", "6. Borrar.","7. Volver"};
			     opcion = Utilidades.pintarMenu(menu2,"Seleccione una opcion:" );
			switch (opcion2) {
			case 1: 	try {
		        Statement stmt = connection.createStatement();
		        String bibliotecaSeleccionada = "Tomas y valiente";
		        String consultaSQL = "SELECT * FROM TB_BIBLIOTECA WHERE nombre = '" + bibliotecaSeleccionada + "'";
		        ResultSet rs = stmt.executeQuery(consultaSQL);

		        if (rs.next()) {
		            String nombreBiblioteca = rs.getString("nombre");
		            String direccionBiblioteca = rs.getString("direccion_id");
		            System.out.println("Nombre de la biblioteca: " + nombreBiblioteca);
		            System.out.println("Dirección de la biblioteca: " + direccionBiblioteca);
		        } else {
		            System.out.println("Biblioteca no encontrada.");
		        }

		        rs.close();
		        stmt.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }    
				
				
				
				break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:break;
			case 6: break;
			case 7: break;
			}
			
			
			
			case 2:
			    try {
			        Statement stmt = connection.createStatement();
			        String bibliotecaSeleccionada = "Julio Caro Baroja";

			        // Crear y ejecutar la consulta SQL con INNER JOIN
			        String consultaSQL = "SELECT l.titulo AS TituloLibro, d.Calle AS CalleDireccion, d.Localidad AS LocalidadDireccion " +
			                            "FROM TB_LIBRO AS l " +
			                            "INNER JOIN TB_BIBLIOTECA AS b ON l.biblioteca_id = b.id " +
			                            "INNER JOIN TB_DIRECCION AS d ON b.direccion_id = d.id " +
			                            "WHERE b.nombre = '" + bibliotecaSeleccionada + "'";
			        ResultSet rs = stmt.executeQuery(consultaSQL);

			        // Recuperar y mostrar los datos
			        while (rs.next()) {
			            String tituloLibro = rs.getString("TituloLibro");
			            String direccionCalle = rs.getString("CalleDireccion");
			            String direccionLocalidad = rs.getString("LocalidadDireccion");
			            System.out.println("Título del libro: " + tituloLibro);
			            System.out.println("Calle de la dirección: " + direccionCalle);
			            System.out.println("Localidad de la dirección: " + direccionLocalidad);
			        }

			        rs.close();
			        stmt.close();
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
			    break;
			case 3: //biblioteca3 ; break;
			case 4: System.out.println("Adios");break;
			default: System.out.println("Opción incorrecta");
			}
			
			
			
		}while(opcion!=4);
		
	}
	
	public void agregarLibro(Biblioteca biblioteca) {
		
		String titulo = Utilidades.pideDatoTexto("Introduce Titulo");
		String autor = Utilidades.pideDatoTexto("Introduce Autor");
		int copias = Utilidades.pideDatoNumerico("Introduce numero de copias");
		
		biblioteca.aniadirLibro(titulo,autor,copias);
		
	}
	
	
	public void prestarLibro(Biblioteca biblioteca) {
		String titulo = Utilidades.pideDatoTexto("Introduce Titulo del libro");
		if(biblioteca.existeLibro(titulo) && biblioteca.estaDisponible(titulo)) {
			biblioteca.prestarLibro(titulo);
		}else {
			System.out.println("El libro "+ titulo + " no está en el catálogo");
		}
	
	}
	
	public void devolverLibro(Biblioteca biblioteca) {
		String titulo = Utilidades.pideDatoTexto("Introduce Titulo del libro");
		if(biblioteca.existeLibro(titulo)) {
			biblioteca.devolverLibro(titulo);
		}else {
			System.out.println("El libro "+ titulo + " no está en el catálogo");
		}
	
	}
	
}

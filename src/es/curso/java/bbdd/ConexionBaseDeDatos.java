package es.curso.java.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBaseDeDatos {
	
	
	/*public static void main(String[] args) {
		ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
		conexion.conecta();
		
	}*/
	
	private void conecta() {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
	    String username = "root";
	    String password = "password";
	    
	    Connection connection = null;
	    Statement stmt = null;
	    ResultSet rs = null;
	    
		try {
			System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
			stmt = connection.createStatement();
			
		} catch (SQLException e) {
			System.err.println("Ha habido un error "+e.getMessage());
//			e.printStackTrace();
		}finally {
			try {
				connection.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

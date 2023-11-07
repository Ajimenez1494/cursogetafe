package es.curso.java.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilidadesBasesDatos {

	public static Connection conectaBasesDatos() {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";
		Connection connection=null;

		try {
			 connection = DriverManager.getConnection(url, username, password);
		
		}

		catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
			e.printStackTrace();

		}
		return connection;
	}
	
	public void desconectaBasesDatos( Connection connection) {
		try {
			if (connection != null)
			connection.close();}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		
		
	}
	


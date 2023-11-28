package es.curso.java.bbdd;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class ConexionBaseDeDatosOracle {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:curso/password@localhost:1521:XE";
				OracleDataSource ods = new OracleDataSource(); 

				ods.setURL(url);
				ods.setUser("curso");
				ods.setPassword("password");
				Connection conn = ods.getConnection();
				System.out.println("Estableciendo conexión");

				
	}

}

package es.curso.java.bbdd.ejercicios.bibliotecabbdd.dao;

import java.sql.Connection;
import java.sql.SQLException;

import es.curso.java.bbdd.UtilidadesBasesDatos;


public abstract class ConexionDAO {
	private Connection conexion;

	public ConexionDAO() throws SQLException {
		super();
		this.conexion = UtilidadesBasesDatos.conectaBasesDatos();
	}

	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}
	
	
	
}

package es.curso.java.bbdd.ejercicios.bibliotecabbdd.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.bbdd.ejercicios.bibliotecabbdd.entities.Biblioteca;
import es.curso.java.bbdd.ejercicios.bibliotecabbdd.entities.Direccion;



	public class BibliotecaDAO extends ConexionDAO {


		public BibliotecaDAO() throws SQLException {
			super();
			// TODO Auto-generated constructor stub
		}

		public List<Biblioteca> getBibliotecas () throws SQLException {
			List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();

			Statement stmt = this.getConexion().createStatement();
			String query = "SELECT biblio.id, biblio.nombre, dir.numero, dir.localidad, dir.id, dir.cod_postal, dir.Calle AS direccion_nombre FROM TB_BIBLIOTECA as biblio JOIN TB_DIRECCION as dir ON biblio.direccion_id = dir.id";
			
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				int idDire= rs.getInt("dir.id");
				int idBiblioteca = rs.getInt("biblio.id");
				String nombreBiblioteca = rs.getString("biblio.nombre");

				int codPostal = rs.getInt("dir.cod_postal");
				String nombre = rs.getString("direccion_nombre");
				int numero=rs.getInt("numero");
				String localidad=rs.getString("dir.localidad");

				Direccion dire = new Direccion(idDire, nombre, numero, codPostal, localidad);
			//	Biblioteca biblio = new Biblioteca(idBiblioteca, nombreBiblioteca, dire);
				
			//	bibliotecas.add(biblio);
			}
			
			return bibliotecas;
		}
		
		public List<Biblioteca> getBibliotecas (String ciudad) {
			
			List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
			
			return bibliotecas;
		}
		
		
		public Biblioteca getBiblioteca (long id) {
			
			
			return null;
		}
		
		
	}

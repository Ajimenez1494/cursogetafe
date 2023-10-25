package es.curso.java.bbdd.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class Facilities {
	private long id;
	private int guid;
	private String name;
	private String description;
	private String category;
	
	
	
	
//	Set<Facilities> lista = new HashSet<Facilities>();
//    
//	
//	for (Facilities recorreLista: lista) {
//		
//		
//	}
//		
//	String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
//	String username = "root";
//	String password = "password";

	
//	try (
//			Connection connection = DriverManager.getConnection(url, username, password);
//			Statement stmt = connection.createStatement();
//			ResultSet rs = stmt.executeQuery("SELECT * FROM TB_FACILITIES");
//		) {
//
//		
//		while (rs.next()) {
//			rs.getLong("id");  Facilities id= new Facilities();
//	
//			rs.getInt("guid"); Facilities guid= new Facilities();
//
//			rs.getString("name"); Facilities name= new Facilities();
//
//			rs.getString("description"); Facilities description= new Facilities();
//
//			rs.getString("category"); Facilities category= new Facilities();
//
//			System.out.println("===============================");
//		}
//
//	} catch (SQLException e) {
//		System.err.println("Ha habido un error " + e.getMessage());
////		e.printStackTrace();
//	}

	@Override
	public String toString() {
		return "Facilities [id=" + id + ", guid=" + guid + ", name=" + name + ", description=" + description
				+ ", category=" + category + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getGuid() {
		return guid;
	}

	public void setGuid(int guid) {
		this.guid = guid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

public void setCategory(String category) {
	this.category = category;
}


	public Facilities(long id, int guid, String name, String description, String category) {
		super();
		this.id = id;
		this.guid = guid;
		this.name = name;
		this.description = description;
		this.category = category;
	}

}

package es.curso.java.colecciones.mapas.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca extends Libro {
    private String nombreBiblioteca;
    private Libro libro;
    
    
    
    //Libro libro1= new Libro(getTitulo(), getAutor(), getCopiasDis());
    
    Map<String,Libro> librosMap = new HashMap<String,Libro>();
    
    
    public void añadirLibro(Libro libro) {
    	
    	
    };
    
    
    
    public Libro prestarLibro() {
    	
    	return libro;
    };
    
    public void devolverLibro(Libro libro) {};
    
    
    
    
    
   
	public String getNombreBiblioteca() {
		return nombreBiblioteca;
	}


	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public Biblioteca(String titulo, String autor, int copiasDis) {
		super(titulo, autor, copiasDis);
		// TODO Auto-generated constructor stub
	}

}

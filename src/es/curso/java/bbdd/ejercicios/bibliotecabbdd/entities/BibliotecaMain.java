package es.curso.java.bbdd.ejercicios.bibliotecabbdd.entities;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.curso.java.bbdd.ejercicios.bibliotecabbdd.dao.BibliotecaDAO;
import es.curso.java.introduccion.utils.Utilidades;

public class BibliotecaMain {
	private Map<Long,Biblioteca> mapBibliotecas;
	
	public BibliotecaMain() {
		super();
		this.mapBibliotecas = new HashMap();
	}

	public static void main(String[] args) {
		BibliotecaMain bibliotecaMain = new BibliotecaMain();
		bibliotecaMain.inicio();
	
	}

	public void inicio () {
		
		cargarDatosBiblioteca();
		int opcion = crearMenuPrincipal();
		if (opcion==(mapBibliotecas.size()+1)) {
			System.out.println("Adios");
		}else {
			Biblioteca biblioElegida= mapBibliotecas.get(opcion);
			cargarSubmenu(biblioElegida);
		}
		
	}
	
	public void cargarSubmenu(Biblioteca biblioElegida) {   boolean salir = false;

    while (!salir) {
        int opcion = mostrarSubmenu(biblioElegida);
        switch (opcion) {
            case 1:
                // Lógica para mostrar los libros de la biblioteca
                mostrarLibrosDeBiblioteca(biblioElegida);
                break;
            case 2:
                // Lógica para realizar otras operaciones relacionadas con la biblioteca
                break;
            case 3:
                salir = true; // Salir del submenú
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción válida.");
        }}
    }
    
    public int mostrarSubmenu(Biblioteca biblioElegida) {
        System.out.println("Menú de opciones para la biblioteca " + biblioElegida.getNombre() + ":");
        System.out.println("1. Mostrar libros de la biblioteca");
        System.out.println("2. Realizar otras operaciones relacionadas con la biblioteca");
        System.out.println("3. Salir");
        
        return Utilidades.pintarMenu("3"); // Utiliza la clase Utilidades para obtener la selección del usuario.
    
		
	}
    public void mostrarLibrosDeBiblioteca(Biblioteca biblioElegida) {
        List<Libro> libros = biblioElegida.getLibros(); // Supongo que hay un método en la clase 'Biblioteca' para obtener los libros.

        if (libros.isEmpty()) {
            System.out.println("No hay libros disponibles en esta biblioteca.");
        } else {
            System.out.println("Libros disponibles en la biblioteca " + biblioElegida.getNombre() + ":");
            for (Libro libro : libros) {
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("ISBN: " + libro.getISBN());
                System.out.println("Número de copias: " + libro.getNum_copias());
                System.out.println("-----------------------------");
            }
        }
    }
    
    
	
	public void cargarDatosBiblioteca () {
		BibliotecaDAO bibliotecaDao = null;
		try {
             bibliotecaDao = new BibliotecaDAO();			
			for (Biblioteca biblioteca :  bibliotecaDao.getBibliotecas()) {
				mapBibliotecas.put(biblioteca.getId(), biblioteca);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int crearMenuPrincipal() {
		
		Set<Entry<Long,Biblioteca> > entryBiblioteca  =  mapBibliotecas.entrySet();
		
		for (Entry<Long, Biblioteca> entry : entryBiblioteca) {
			System.out.println(entry.getKey() + ". " + entry.getValue().getNombre());
		}
		int opcion = Utilidades.pintarMenu((entryBiblioteca.size()+1) + ". Salir");
		
		return opcion;
	}
	
	
	
}

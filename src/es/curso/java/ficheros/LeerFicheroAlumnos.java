package es.curso.java.ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import es.curso.java.bbdd.ejercicios.bibliotecabbdd.entities.Biblioteca;
import poo.ejercicios.Alumno;
import poo.ejercicios.Direccion;


public class LeerFicheroAlumnos {

	public static void main(String[] args) {
		LeerFicheroAlumnos leer = new LeerFicheroAlumnos();
		try {
			System.out.println(leer.leerFicheroBiblioteca(
					"./directorios2/bibliotecas.txt").size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public List<Biblioteca> leerFicheroBiblioteca(String rutaFichero) 
			throws IOException{
		
		return leerFicheroBiblioteca(rutaFichero,0);
		
	}
	
	
	public List<Biblioteca> leerFicheroBiblioteca(String rutaFichero, 
			int skipLines) throws IOException{
		Path path = Paths.get(rutaFichero);
		List<Biblioteca> bibliotecas = new ArrayList();

		List<String> lines = Files.readAllLines(path);
		int numLinea = 1;
		for (String linea : lines) {
			if (numLinea>skipLines) {
				String[] datos = linea.split("\\|");
				
				String Tipo = datos[0];
				String nombre = datos[1];
				String ciudad = datos[2];
				String provincia = datos[3];
				int codPostal = Integer.parseInt(datos[4]);
				String nomBiblio= datos[5];

				Direccion direccion= new Direccion(codPostal, linea, linea, linea, linea, codPostal);
				Biblioteca biblioteca= new Biblioteca(codPostal, provincia, direccion);
				bibliotecas.add(biblioteca);
			}
			numLinea++;
		}

		return bibliotecas;
	}
	
	

}

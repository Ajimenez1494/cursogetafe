package es.curso.java.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class EjercicioFichero1 {
	//leer fichero
	//meter cada linea en un objeto
	//hacer una lista
	//mostrar el tamaño de la lista
	public static void main(String[] args) throws IOException {
	    String directorio = "./directorios2/";
		EjercicioFichero1 recurso = new EjercicioFichero1();
		recurso.mostrarContenido(directorio);
	}


   public void mostrarContenido(String directorio) throws IOException {
	File dir = new File(directorio);
	String[] ficheros = dir.list();
	for (String nombreFichero : ficheros) {
		String newFile = directorio +"/"+ nombreFichero;
		File file = new File(newFile);
		if (file.isDirectory()) {
			System.out.println("Directorio: "+ newFile);
			mostrarContenido(newFile);
		}else {
			System.out.println("Fichero: "+ newFile);
			if (file.getName().endsWith(".txt")) {
				System.out.println(newFile);
				String contenido = leerArchivo2(newFile);
				System.out.println("Contenido del fichero "+ newFile + "\n" +contenido);
			}
		}
	}
	
   }
   public String leerArchivo2(String nombre) {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		try (Scanner s = new Scanner(archivo)) {

			s.useDelimiter("\n");
			while (s.hasNext()) {
				sb.append(s.next()).append("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
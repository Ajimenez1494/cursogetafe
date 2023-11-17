package es.curso.java.ficheros;

import java.io.File;
import java.util.Calendar;

public class EjercicioDirectorios {

	public static void main(String[] args) {

		String directorio = "./directorios2";
		EjercicioDirectorios recurso = new EjercicioDirectorios();
		// 1. En todas las carpetas cuantos ficheros jpg hay.
		recurso.mostrarContenidoJPG(directorio);
		// 2.Mostrar el nombre de todos los ficheros en cuyo nombre tengamos el año
		// actual. Intentad obtener el año mediante programación
		recurso.mostrarContenidoAnio(directorio);
		// 3.Vais a renombrar (asdasd.txt.done) el fichero que tenga en el nombre el año
		// siguiente pero en el mes actual en el que estamos

		// 4.Ese fichero renombrado lo vais a mover a un directorio que no existe con el
		// nombre que querais

	}

	public void mostrarContenidoJPG(String directorio) {
		File dir = new File(directorio);
		if (dir.isDirectory()) {
			String[] ficheros = dir.list();
			for (String nombreFichero : ficheros) {
				File file = new File(nombreFichero);

				if (file.getName().endsWith(".jpg")) {
					System.out.println(nombreFichero + " Es un fichero jpg");
				}
			}
		}
	}

	public void mostrarContenidoAnio(String directorio) {
		File dir = new File(directorio);
		if (dir.isDirectory()) {
			String[] ficheros = dir.list();
			for (String nombreFichero : ficheros) {
				File file = new File(nombreFichero);
				int year;
				if (file.getName().contains(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)))) {
					System.out.println("Este fichero contiene en el nombre el año actual");
				}
			}

		}

	}

	public void renombrar(String directorio, File archivo) {
		File dir = new File(directorio);
		if (dir.isDirectory()) {
			String[] ficheros = dir.list();
			for (String nombreFichero : ficheros) {
				File file = new File(nombreFichero);
				int year;
				if (file.getName().contains(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)))) {
					System.out.println("Este fichero contiene en el nombre el año actual");
				}
			}

		}

	}
	
}

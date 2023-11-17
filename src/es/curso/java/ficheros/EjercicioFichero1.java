package es.curso.java.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioFichero1 {
	//leer fichero
	//meter cada linea en un objeto
	//hacer una lista
	//mostrar el tamaño de la lista
	public static void main(String[] args) throws IOException {
    String directorio = "./directorios2";
	EjercicioFichero1 recurso = new EjercicioFichero1();
	recurso.mostrarContenido(directorio);}


   public void mostrarContenido(String directorio) throws IOException {
	File dir = new File(directorio);
	if (dir.isDirectory()) {
		String[] ficheros = dir.list();
		for (String nombreFichero : ficheros) {
			File file = new File(nombreFichero);
             if(nombreFichero.endsWith(".txt"))
			
				System.out.println(nombreFichero);
				
		     leerArchivo(nombreFichero);
			}
		}
	
   }
   public String leerArchivo(String nombre) throws IOException {
					StringBuilder sb = new StringBuilder();
					File archivo = new File(nombre);
					FileReader fileReader = new FileReader(archivo);
				BufferedReader reader = new BufferedReader(fileReader);
			//
//					String linea;
//					while ((linea = reader.readLine()) != null) {
//						sb.append(linea).append("\n");
//					}

			        try (BufferedReader reader1 = new BufferedReader(new FileReader(archivo))){

			            String linea;
			            while ( (linea = reader1.readLine()) != null){
			                sb.append(linea).append("\n");
			            }
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
					return sb.toString();
				}
	}
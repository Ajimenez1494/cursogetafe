package es.curso.java.introduccion.Arrays;

import java.util.Scanner;

public class ArraysBidimensionales {
	public static void main (String[] arg) {
	String [][] animales= new String [3][5];
	animales[0][0]= "Gato";
	//metemos informacion en el array
	for (int i=0; i<animales.length; i++ ) {
		System.out.println("Fila"+i);
		for(int j=0; j<animales[i].length ;j++) {
	System.out.println("columna"+j);
	animales [i][j]="*";}}
		//mostramos informacion
	for (int i=0; i<animales.length; i++ ) {
		for(int j=0; j<animales[i].length ;j++) {
	System.out.print(animales[i][j]);}
	System.out.println();
	
	System.out.println(animales[0][2]);
	

	//al hacer un foreach sobre un array bidireccional nos devuelve un array unidireccional
	for (String [] fila : animales) {
		for (String dato:fila) {
			System.out.print(dato);}
		System.out.print("\n");
		}
		
	}
	
		}
//	Scanner scan = new Scanner(System.in);
//	String valor = scan.nextLine();
//	animales[0][i]=valor;
	// System.out.println(animales[0][i]);

}
//	System.out.println(animales.length); //numero de filas
//	System.out.println(animales[0].length); //numero de columnas de la fila 0

// System.out.println(animales.length);

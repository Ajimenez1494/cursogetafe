package es.curso.java.introduccion.ejercicios.arrays;

import java.util.Scanner;

public class Notas {
	public static void main(String[] Args) {
		System.out.println("Introduce el número de notas:");
		Scanner scan= new Scanner(System.in);
		int numero=scan.nextInt();
		System.out.println("El número de notas es: " + numero);
		
		int  veces= numero;
		int [] notas= new int [numero];
		double registro = 0 ;
	//	for  ( notas.lenght<=0  ; i=0  ; i--  ) {
		
			System.out.println("Introduce tu nota: "  );
			 scan= new Scanner(System.in);
	         registro= registro + scan.nextDouble(); 
			
		
		}
		
		//System.out.println("La nota media seria:"+ registro/veces  );
		
		
		}

	

//#Preguntar nombre del alumno y la nota
//
//Indicar numero de notas a almacenar
//preguntar y guardar las notas
//- Sacar la media de todas las notas
//- La nota máxima
//- La nota mínima
//
//Un nuevo array con las notas ordenadas de mayor a menor
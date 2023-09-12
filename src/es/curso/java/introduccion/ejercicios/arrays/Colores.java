package es.curso.java.introduccion.ejercicios.arrays;

import java.util.Scanner;

public class Colores {
	public static void main(String[] args) {
		System.out.println("¿Cuántos colores quieres guardar?");
		Scanner scan = new Scanner(System.in);
		int respuesta = scan.nextInt();
		String [] colores = new String [respuesta];
		String nombre = "";
		for (int i=0 ; i < colores.length; i++){
		System.out.println("Introduce el nombres del color:" + (i+1));
		 scan = new Scanner(System.in);
		 nombre=scan.nextLine().trim();
		}
		
		for(String color: colores) {System.out.println(color);}
		{System.out.println("Los colores son:" + nombre); 
	}
	    for(String color:colores) {
	    	if(color.contains("o")&& color.toLowerCase().charAt(0)=='a') {System.out.println(color);}
	    }
}}

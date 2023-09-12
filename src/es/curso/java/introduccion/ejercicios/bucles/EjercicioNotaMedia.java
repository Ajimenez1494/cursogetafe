package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class EjercicioNotaMedia {
	public static void main(String[] Args) {
	System.out.println("Introduce el número de alumnos:");
	Scanner scan= new Scanner(System.in);
	int numero=scan.nextInt();
	System.out.println("El número de alumnos es: " + numero);
	
	int veces=numero;
	double registro=0;
	for  (   ; numero>0  ; numero--  ) {
	
		System.out.println("Introduce tu nota: "  );
		 scan= new Scanner(System.in);
         registro= registro + scan.nextDouble(); 
		
	
	}
	
	System.out.println("La nota media seria:"+ registro/veces  );
	
	
	}

}

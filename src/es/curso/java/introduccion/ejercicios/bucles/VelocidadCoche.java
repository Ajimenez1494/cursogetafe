package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class VelocidadCoche {
	public static void main(String[] Args) {
		System.out.println("Introduce el numero de coches que hay en la carrera: ");
		Scanner scan = new Scanner(System.in);
		int numCoches = scan.nextInt();
		int velocidad = 1000;
		for (; numCoches > 0; numCoches--) {

			System.out.println("¿Cual es la velocidad a la que va?");
			scan = new Scanner(System.in);
			int aux = velocidad;
			velocidad = scan.nextInt();

			if (velocidad >= aux) {
				velocidad = aux;
			}

		}
		System.out.println("La velocidad minima es: " + velocidad);
	}
}

/*
 * pedir numero de coches pedir velocidad de cada uno determinar cual es la
 * velocidad mas baja
 */
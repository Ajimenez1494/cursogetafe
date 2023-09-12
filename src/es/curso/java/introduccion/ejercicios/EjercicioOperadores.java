package es.curso.java.introduccion.ejercicios;

public class EjercicioOperadores {
	public static void main(String[] args) {
		String nombre = "Alicia";
		String apellido = "Jimenez";
		int year = 1994;
		int edad = 2023 - year;
		boolean esPar = year % 2 == 0;
		
		
	if (esPar == true) {
		System.out.println("El año de nacimiento es par: " + esPar);}
	else {
	System.out.println("El año de nacimiento es impar");}
	
		System.out.println("El nombre será:" + nombre + " y el apellido será:" + apellido);
		System.out.println("La edad será:" + edad);

	}

	// declarar dos variables de tipo string que van a ser nombre y apellidos y otra
	// de tipo entero que va a ser año de nacimiento
	// a partir de ahi vamos a indicar nombre, apellidos, edad del usuario y si
	// nacio en un año par o no (que ponga true o false)

}

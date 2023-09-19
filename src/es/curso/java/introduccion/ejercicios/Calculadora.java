package es.curso.java.introduccion.ejercicios;

import es.curso.java.introduccion.utils.Utilidades;

public class Calculadora {
	final static String OPCIONES_MENU = "1. Suma" + "2. Resta" + "3. Multiplicación" + "4. División" + "5. Apagar";
	static int num = 0;

	public static void main(String[] args) {
		System.out.println("¿Que operación quieres realizar?");
		int opcion = 0;
		do {
			opcion = Utilidades.pintarMenu(OPCIONES_MENU);
			;

			switch (opcion) {
			case 1:
				suma(OPCIONES_MENU);
				break;
			case 2:
				resta(OPCIONES_MENU);
				break;
			case 3:
				multiplicacion(OPCIONES_MENU);
				break;
			case 4:
				dividir(OPCIONES_MENU);
				break;
			case 5: // apagar;

				System.out.println("Adios");
				break;
			default:
				System.out.println("Opción incorrecta");
			}

		} while (opcion != 5);
	}

	public static int suma(String opcionesMenu) {
		String texto = "¿Que número quieres sumar?";
		int numIn = Utilidades.pideDatoNumerico(texto);
		num = num + numIn;

		System.out.println("El resultado de la suma es: " + num);
		return num;

	}

	public static int resta(String opcionesMenu) {
		String texto = "¿Que número quieres restar?";
		int numIn = Utilidades.pideDatoNumerico(texto);
		num = num - numIn;

		System.out.println("El resultado de la suma es: " + num);
		return num;

	}

	public static int multiplicacion(String opcionesMenu) {
		String texto = "¿Que número quieres multiplicar?";
		int numIn = Utilidades.pideDatoNumerico(texto);
		num = num * numIn;

		System.out.println("El resultado de la multiplicación es: " + num);
		return num;

	}

	public static int dividir(String opcionesMenu) {
		String texto = "¿Entre que número quieres dividir?";
		int numIn = Utilidades.pideDatoNumerico(texto);
		num = num / numIn;

		System.out.println("El resultado de la división es: " + num);
		return num;

	}

}

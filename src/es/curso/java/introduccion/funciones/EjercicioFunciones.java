package es.curso.java.introduccion.funciones;

public class EjercicioFunciones {

	public static void main(String[] args) {
      velVehiculo(9,7);
	pintaTablaMultiplicar(1);
		{System.out.println("");}
		
		String año= "1994";
				
		EjercicioFunciones.calculaEdad(año); {System.out.println();}
		
		
	}

	// int calculaEdad (String anioNacimiento)
	public static int calculaEdad(String anioNacimiento) {
		int edad= 0;
		int anio = Integer.parseInt(anioNacimiento);
		edad = 2023 - anio;
		return edad;
	}

	 // void pintaTablaMultiplicar (int numero)

	public static void pintaTablaMultiplicar(int numero) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + "*" + i + "=" + (numero * i));
		}

	}

	// String [] juntaDatos (String texto, int numRepeticiones)
	public static String[] juntaDatos(String texto, int numRepeticiones) {
		 String [] datos = new String[numRepeticiones];
		for (int i = 0; i < numRepeticiones; i++) {
			datos[i] = texto;
		}
		return datos;

		// #Facil, devolver el texto tantas veces como indique el numRepeticiones
	}
	//método que le pasamos el espacio en km recorrido por un vehiculo y el tiempo en minutos en que ha recorrido ese espacio y nos dice la velocidad que lleva el vehiculo
	public static void velVehiculo(double distancia, int tiempo) {System.out.println("velocidad:"+distancia/tiempo);}  
	
	
}

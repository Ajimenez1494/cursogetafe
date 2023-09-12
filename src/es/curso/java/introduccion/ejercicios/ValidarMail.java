package es.curso.java.introduccion.ejercicios;

import java.util.Scanner;

public class ValidarMail {
	public static void main(String[] args) {
		System.out.println("Introduce un email");
		Scanner scan = new Scanner(System.in);
		String email = scan.nextLine().trim();
		String mensajeError="";
		// si es incorrecto porque no tiene arroba, imprimir un mensaje de que falta eso y volver a pedir el mail
		if (email.indexOf("@")!=email.lastIndexOf("@") || email.indexOf("@")==-1) { mensajeError="Debe tener una @";
			}
			else{ 
				int posicionArroba=email.indexOf("@")+1;
				String subcadenaDespuesDelArroba= email.substring(posicionArroba);
				if (!subcadenaDespuesDelArroba.contains(".")) { mensajeError="Debe contener un punto después del arroba";}
				else  if (subcadenaDespuesDelArroba.indexOf(".")<2) {mensajeError+="La distancia entre la arroba y el punto debe ser superior a dos caracteres";}
				if (email.length()-email.lastIndexOf(".")<2) {mensajeError="El subdominio tiene que ser igual o mayor";}
				}
			
				
					
		// si es incorrecto porque No contiene espacios en blanco despues de quitar los espacios en blanco a izqda y dcha
		//System.out.println(email.trim());

		if (email.contains(" ")) {
			//emailCorrecto=false;
			mensajeError+=" No puede tener espacios en blanco";	
		}
				
		
		if (mensajeError.isEmpty()) {
			System.out.println("El email "+email+ " es correcto");
		}else {
			System.out.println("El email "+email+ " es incorrecto,");
			System.out.println(mensajeError);
		}
		
		//System.out.println(mensajeError);
	}
		
		//si es incorrecto porque Después de la @ tiene que haber al menos un punto
		 //si es incorrecto porque El espacio entre la @ y el primer punto después de esta tiene que ser al menos de 2
		// si es incorrecto Después del último punto tiene que haber entre 2 y 6 caracteres
}
//Validar un email.
//Solicitar un email.
//"        asdasd@asdas.es      "
//Indicamos si el email es correcto si cumple las siguientes validaciones. Si no es correcto indicar los fallos que tiene.
//
//- Tiene una @
//- No contiene espacios en blanco despues de quitar los espacios en blanco a izqda y dcha.
//- Después de la @ tiene que haber almenos un punto
//- El espacio entre la @ y el primer punto después de esta tiene que ser al menos de 2
//- Después del último punto tiene que haber entre 2 y 6 caracteres
//
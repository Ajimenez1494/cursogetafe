package es.curso.java.introduccion.ejercicios.condicionales;

import java.util.Scanner;

public class EjercicioCondicionalesAdivinanza {
       public static void main(String [] Args) {
       System.out.println("¿Cual seria la respuesta a la siguiente adivinanza: Oro parece, plata no es? ");
       Scanner scan= new Scanner (System.in);
       String respuesta=scan.nextLine();
       
       if (respuesta.equals("plátano")) {
    	   
    	   
       System.out.println("Enhorabuena, has acertado");
         
       }
       
       else { System.out.println("Lo siento, tu respuesta es erronea");
          
}}}

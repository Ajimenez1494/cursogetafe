package es.curso.java.introduccion.ejercicios.condicionales;

import java.util.Scanner;

public class EjercicioCondicionalesSwitch {
       public static void main(String[] Args) {
    	   System.out.println("Introduce un mes");
    	   Scanner scan= new Scanner(System.in);
           String mes=scan.nextLine();
           switch (mes) {
        	 case "Enero" :
        	 case "febrero":  
        	 case "marzo" :System.out.println("Estas en invierno"); break;
        	 case "abril" :
        	 case "mayo":  
        	 case "junio" :System.out.println("Estas en primavera"); break;
        	 case "julio" :
        	 case "agosto":  
        	 case "septiembre" :System.out.println("Estas en verano"); break;
        	 case "octubre" :
        	 case "noviembre":  
        	 case "diciembre" :System.out.println("Estas en otoño"); break;
        	 default: System.out.println("");
        	 
         }
       }

		
	}


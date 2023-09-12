package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class EjercicioCollatz {
       public static void main(String [] Args) {
    	   System.out.println("Introduce un numero:");
    	   Scanner scan = new Scanner(System.in);
    	    int respuesta= scan.nextInt();
    	    
    	    for (  ;  respuesta!=1  ;   ) {
    	   // int Par=respuesta%2==0 ;
    	    if (respuesta%2==0) { 
    	    	respuesta/=2;}
    	    	
    	    else {respuesta= respuesta*3+1 ;}
    	    
    	    
    	    System.out.println("Los numeros son: " + respuesta ) ;
    	   
    	    
    	    //hacer un for (   ;  <0  ;
    	    	
    	    }
       }
       
       
}

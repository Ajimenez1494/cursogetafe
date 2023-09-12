package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class SerieFibonacci {
       public static void main(String [] Args) {
    	  System.out.println("¿Que número de la serie quieres?");
    	      Scanner scan=new Scanner(System.in);
    	      int numero= scan.nextInt();
    	      int suma;
          for(    ;  numero!=0 ||numero<25   ; numero++    )
        	  
          {  suma=numero+numero;
        	  
        	  System.out.println("La serie es:" + suma);
        	  
          suma=numero+numero;
          }
    	     
    	    	  
    	    	  
    	    	  
    	    	  // 1,1,2,3,5,8,13,21... se suma el numero introducido con el anterior
    	      
    	  
    	   
       }
}

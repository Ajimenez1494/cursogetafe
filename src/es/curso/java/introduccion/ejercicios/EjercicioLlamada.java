package es.curso.java.introduccion.ejercicios;

import java.util.Scanner;

public class EjercicioLlamada {
       public static void main(String[] Args) {
       System.out.println("Introduce el tiempo de llamada:");
       Scanner scan= new Scanner(System.in);
       int tiempo = scan.nextInt();
       
       double costeLlamada=0; 
      
       System.out.println("¿Que día de la semana ha sido?");
       String dia= scan.nextLine();
       
       
       System.out.println("Introduce la hora:");
       int hora= scan.nextInt(); 
       
       if(tiempo>0) { costeLlamada=1;   	 
       if(tiempo>5) { costeLlamada +=0.8; }
       if(tiempo>8) { costeLlamada +=0.7; }
     //  if(tiempo>10){ ((tiempo-10) * 0.5); }

      // if(dia.equals("Domingo")) { costellamada*=1.03 )}
       System.out.println("El coste de la llamada ha sido de: " + costeLlamada); 
       }
       else {    	 System.out.println("El tiempo no puede ser negativo");  
}
       
       
       
       //if(hora <=14:00) { System.out.println("Estas en turno de mañana");
       //else System.out.println("Estas en turno de tarde"); }
    	   
    	   
    	   
    	 System.out.println("El coste de la llamada ha sido de: " + costeLlamada);  
    	   
       }
}

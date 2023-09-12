package es.curso.java.introduccion.Arrays;

import java.util.Scanner;

public class ArraysColegios {
       public static void main(String[] arg) {
    	   System.out.println("Introduce el número de aulas del colegio: ");
    	   Scanner scan= new Scanner(System.in);
    	   int aulas= scan.nextInt() ;   	
    	   int[] numAulas= new int [aulas];
    	   
    	   for (int i = 0; i < numAulas.length; i++) {
    	   System.out.println("Introduce el número de alumnos del aula: "); 
    	   int numAlumnos=scan.nextInt();
    	   numAulas[i]=numAlumnos;
    	   String[] alumnos= new String[numAlumnos];
           String[] dni= new String[numAlumnos];
           double[] notas= new double[numAlumnos];
    	   System.out.println("El aula tiene: " + numAlumnos + " alumnos");
    	    for (int j=0;j<numAlumnos;j++)  {
        	   System.out.println("Introduce el nombre del alumno") ;
        	   Scanner scan1= new Scanner(System.in);
        	   String nombre=scan1.nextLine();
        	    alumnos[j]=nombre; 	          }
    	    
    	    for (int l=0; l<numAlumnos; l++) {
    	    	 System.out.println("Introduce el DNI del alumno: "+ alumnos[l]) ;
          	   Scanner scan1= new Scanner(System.in);
          	   String DNI=scan1.nextLine();
          	   dni[l]=DNI;
          	       	   	
    	    }
    	    for (int p=0; p<numAlumnos; p++) {
   	    	 System.out.println("Introduce la nota del alumno: "+ alumnos[p]) ;
         	   Scanner scan1= new Scanner(System.in);
         	   Double nota=scan1.nextDouble();
         	   notas[p]=nota;
         	   if (nota>=5) {           System.out.println(" El alumno: " + alumnos[p] +" con DNI: "+dni[p]+ " aprobó con un: " + notas[p]);

    	    }
    	   System.out.println(numAulas[0]);
           System.out.println(" Alumno: " + alumnos[1] +" DNI: "+dni[1]+ " Nota: " + notas[1]);
           

        	   
           }
}}}

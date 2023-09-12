package es.curso.java.introduccion.ejercicios;

import java.util.Scanner;

public class EjercicioRangosEdad {
      public static void main(String[] Args) {
      System.out.println("Por favor, introduce los siguientes datos:" );  
      Scanner scan = new Scanner(System.in) ;
     
      System.out.println("Introduce tu nombre:");
      String nombre=scan.nextLine();
     
      System.out.println("Introduce tu edad:");
      int edad = scan.nextInt();
      
      System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
      
      //int [] bebe= {1,2,3,4,5} ;
      //if (edad = bebe)
    	//  System.out.println("Eres un bebe");}
      
      if (edad <=5) {
    	  System.out.println("Eres un bebe");
      }
      else if (edad<=16) {
    	  System.out.println("Eres un niño o adolescente");}
      
      else if (edad<=20){
    	  System.out.println("Eres un adolescente o un adulto joven");
      }
      
      else if(edad<=40) {
    	  System.out.println("Eres un adulto");
      }
      else if(edad<=60)
     {System.out.println("Eres un adulto casi jubilado");}
     
     else if(edad<=80) {  System.out.println("Eres un jubilado"); }
      
     else if(edad<=100) { System.out.println("Eres un anciano"); }
      
     else System.out.println("Estas fuera del baremo");
      }}     


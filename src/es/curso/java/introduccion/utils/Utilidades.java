package es.curso.java.introduccion.utils;

import java.util.Scanner;

public class Utilidades {
	
	public static void main(String[] args) {
		
		Utilidades.pideDatoTexto();
		pideDatoNumerico();
		pintarMenu();
	}
                //+ pideDatoTexto método para pedir un String por consola a partir de un texto y que devuelva el valor seleccionado  

	     public static String pideDatoTexto () {
			
        	 //preguntar y hacer un escaner
        	 System.out.println("Introduce un dato de texto: ");
        	 Scanner scan= new Scanner (System.in) ;
        	 String texto=scan.nextLine();
	    	 return texto;
         }
       
       // + pideDatoNumerico método para pedir un int por consola a partir de un texto y que devuelva el valor seleccionado

         
         public static int pideDatoNumerico () {
        	 System.out.println("Introduce un dato númerico: ");
        	 Scanner scan= new Scanner (System.in) ;
        	 int dato=scan.nextInt(); 
        	 return dato;
         }
        // + Método pintarMenu() le vamos a pasar un texto o un array de Strings  y ambos van a pintar el menu, va a pedir la opcion al usuario 
        // y va a devolver la opcion seleccionada
         
         public static String pintarMenu ()
         {     
        	 int opcion=0;
     		 {
     			String menu = "1. Opcion1\n2. Opcion2\n3. Opcion3\n4. Opcion4\n5. Salir";
     			System.out.println(menu);
     			System.out.println("Selecciona una opcion");
     			Scanner scan = new Scanner(System.in);
     			opcion = scan.nextInt();
     			System.out.println("Opcion seleccionada " + opcion);
     		}
     		    String seleccion=Integer.toString(opcion);

        	 return seleccion ;      }
}

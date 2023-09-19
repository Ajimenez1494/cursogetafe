package es.curso.java.introduccion.utils;

import java.util.Scanner;

public class Utilidades {
	
	
                //+ pideDatoTexto método para pedir un String por consola a partir de un texto y que devuelva el valor seleccionado  

	     public static String pideDatoTexto (String texto) {
			
        	 //preguntar y hacer un escaner
        	 System.out.println(texto);
        	 Scanner scan= new Scanner (System.in) ;
        	 String textoP=scan.nextLine();
	    	 return textoP;
         }
       
       // + pideDatoNumerico método para pedir un int por consola a partir de un texto y que devuelva el valor seleccionado

         
         public static int pideDatoNumerico (String texto) {
        	 System.out.println(texto);
        	 Scanner scan= new Scanner (System.in) ;
        	 int dato=scan.nextInt(); 
        	 return dato;
         }
        // + Método pintarMenu() le vamos a pasar un texto o un array de Strings  y ambos van a pintar el menu, va a pedir la opcion al usuario 
        // y va a devolver la opcion seleccionada
         
         public static int pintarMenu (String menu)
         {     
        	 int opcion=0;
     		 {
     		// menu = "1. Opcion1\n2. Opcion2\n3. Opcion3\n4. Opcion4\n5. Salir";
     			//System.out.println(menu+ "\n");
     			System.out.println("Selecciona una opcion");
     			opcion=pideDatoNumerico(menu);
     			System.out.println("Opcion seleccionada " + opcion);
     		}
     		   // String seleccion=Integer.toString(opcion);

        	 return opcion ;      }

     	public static int pintarMenu(String menu, String pregunta, String caracterSeparacion) {
     		
     		
     		return pintarMenu(menu.split(caracterSeparacion),pregunta);
     	}
     	
     	
     	public static int pintarMenu(String[] menu, String pregunta) {
     		for (String opcion : menu) {
     			System.out.println(opcion);
     		}
     		//Pido la opción del menú
     		int opcion = pideDatoNumerico(pregunta);
     		
     		return opcion;
     	}
     		 
         

}

package es.curso.java.introduccion.funciones;

import es.curso.java.introduccion.utils.Utilidades;

public class ColegioMenuAdaptado {
       public static void main(String[] args) {
    	
    	   String texto="Introduce el número de aulas del colegio";
    	   int numAulas=Utilidades.pideDatoNumerico(texto); 
   		   String [][] colegio = new String[numAulas][];
   		   
   		   for(int i=0;i<numAulas;i++) {
   	    	   texto="Introduce el número de alumnos del aula";
   			   int numAlumnos=Utilidades.pideDatoNumerico(texto);
   			   colegio[i] = new String[numAlumnos]; }
   		   
   		   String menu ="";
   		   Utilidades.pintarMenu(menu);


    	
       }
}

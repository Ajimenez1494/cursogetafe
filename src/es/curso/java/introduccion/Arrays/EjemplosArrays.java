package es.curso.java.introduccion.Arrays;

public class EjemplosArrays {
      public static void main(String[] args) {
    	  //String nombre= "Raul";
    	  //Si ya conocemos los valores,
    	  String [] nombres = {"n1","n2","n3","n4"};
    	 // System.out.println(nombres.length);
    	 for ( int i=0 ; i<nombres.length ;i++){ System.out.println(nombres[i]);}
    	  System.out.println(nombres[3]);
    	  int [] numeros = new int [3];
    	  numeros [1]=9;
    	  for (int i=0; i<numeros.length ; i++) {System.out.println(numeros[i]);
    	  
    	  }
    	 // System.out.println(nombres[3] + " " + nombres[2] + " "+ nombres[1] + " " + nombres[0]);  
      }
}

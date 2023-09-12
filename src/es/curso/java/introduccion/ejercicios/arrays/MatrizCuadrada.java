package es.curso.java.introduccion.ejercicios.arrays;

import java.util.Scanner;

public class MatrizCuadrada {
       public static void main(String[] arg) {
    		System.out.println("Introduce el número de filas:");
    		Scanner scan = new Scanner(System.in);
    		int f = scan.nextInt();
    		int [][] matriz= new int [f][f];

    	  for (int j=0; j<matriz.length; j++ ) {
    			System.out.println("Introduce el dato:");
    			
    		for (int e=0; e<matriz[j].length ; e++){ 
    			int num=0;
    			num++;
    			matriz[j][e]= scan.nextInt(); 

    		   }
    		
    		}
           for (int i=0; i<matriz.length; i++ ) {
   			for(int j1=0; j1<matriz[i].length ;j1++) {
  		System.out.print(matriz[i][j1]);}
  		System.out.println();
       }
                
    	System.out.println("La cadena en diagonal es: " +matriz[0][0]+matriz[1][1]+matriz[2][2]);           
           int[] diagonal= new int [f];
           
}}

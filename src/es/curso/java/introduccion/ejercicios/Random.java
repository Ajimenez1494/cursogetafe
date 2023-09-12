package es.curso.java.introduccion.ejercicios;

public class Random {
    public static void main(String [] Args) {
    	System.out.println((int)(Math.random()*6)+1);
    	
    	for (int i=0; i<5 ; i++) {
    		System.out.println(i);
    		System.out.println("Pasa0");
    		if(i%2==0) {continue;}
    		if (i%3==0) {break;}
    		System.out.println("Pasa1");
    		System.out.println("Pasa0");
    	}
    	    System.out.println("FIN");
    	
    		
    		
    	}
    	
    
    	
    }


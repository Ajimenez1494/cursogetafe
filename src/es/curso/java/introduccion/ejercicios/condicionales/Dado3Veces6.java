package es.curso.java.introduccion.ejercicios.condicionales;

public class Dado3Veces6 {
		 public static void main(String [] Args) {
		    	//System.out.println((int)(Math.random()*6)+1);
		    	int dado;
		    	int veces = 2;
		    	int contador=0;
		    	do { 
		    	dado=(int)(Math.random()*6)+1;
		    	if(dado!=6) {
		        veces=2;
		    		System.out.println("Siguiente tirada, ha salido: " + dado);
		    		contador++;
		    		}
		    	else  
//		    		
		    		veces--;
		    	contador++;
		    		System.out.println("Ha salido 6");
//		    		switch (veces) {
//		    		case 1: veces=0 ;break;
		    		}
		       while(veces>0);
		    	
		    	System.out.println("Se han necesitado: "+ contador+ " tiradas");
	}}


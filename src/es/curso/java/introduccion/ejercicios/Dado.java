package es.curso.java.introduccion.ejercicios;

public class Dado {
	 public static void main(String [] Args) {
	    	//System.out.println((int)(Math.random()*6)+1);
	    	int dado;
	    	int veces=3;
	    	do { 
	    	dado=(int)(Math.random()*6)+1;
	    	if(dado!=6) {
	  
	    		System.out.println("Siguiente tirada, ha salido: " + dado);}
	    	else  
	    		//(;veces==0;veces--)
	    		
	    		System.out.println("Ha salido 6");}
	       while(dado!=6);
}}
// tirar un dado hasta que salga el 6, y despues hasta que salga el 6 3 veces seguidas
// Partimos de un importe,1000 euros. Indica cuanto quieres apostar, si el dinero apostado> importe, nos dirá "importe insuficiente"
// preguntamos por el numero a apostar (1-6)
// tiramos el dado-> Si el número es el apostado, el importe apostado se multiplica por 3 y se suma al resto del importe
// ¿Deseas seguir jugando?

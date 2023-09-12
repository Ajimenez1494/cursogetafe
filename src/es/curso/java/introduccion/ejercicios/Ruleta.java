package es.curso.java.introduccion.ejercicios;

import java.util.Scanner;

public class Ruleta {
       public static void main(String []Args) {
    	   System.out.println("Indica el numero de jugadores: ");
    	   Scanner scan=new Scanner(System.in);
    	   int numJug=scan.nextInt();
    	   int veces=numJug;
    		double registro=0;
    		for  (   ; numJug>0  ; numJug--  ) {
   	    	 System.out.println("¿Cuanto dinero tienes?");
   			 scan= new Scanner(System.in);
    	         registro=scan.nextDouble(); }
    	     System.out.println("¿Como quieres apostar? Las opciones son: Numero, Docenas, par o impar, rojo o negro o puedes dejar de jugar");
    	    Scanner scan2 = new Scanner(System.in);
    	    String FormaApuesta=scan2.nextLine();
    	    switch(FormaApuesta) {
			case "numero": System.out.println("Apostar por un número (0-36)");
			System.out.println("Por qué número quieres apostar??");
			scan = new Scanner(System.in);
			int numeroApostado = scan.nextInt();
			System.out.println("¿Cuanto dinero quieres apostar?");
			// el dinero apostado tiene que ser menor o igual al que tienes
			int tirada = (int)(Math.random()*36)+1;
			System.out.println("El dado ha sacado un "+tirada);
			if(numeroApostado==tirada) {
				System.out.println("Enhorabuena has acertado!!!");
			double	importe=registro*3;
			}        
			break;
			case "docenas": System.out.println("Apostar por docenas (0-12/13-24/25-36)");break;
			case "Par o impar": System.out.println("Apostar por un número par/impar");break;
			case "Rojo o negro": System.out.println("Apostar por color");break;
			case "Dejar de jugar": System.out.println(" Dejar de jugar (mostrar el importe del usuario)");break;
			default: System.out.println("Opcion incorrecta");
    	    

    		
    	}

    	
    	}}


/* 
 * --Versión muy complicada
 * Indicar numero de jugadores,
preguntar por cada jugador cuanto dinero tiene (maximo de 3 jugadores)

--Versión complicada
Partimos de un jugador con 1000€

--Por cada jugador mostrar:

Juego de la ruleta
=========================
1. Apostar por un número (0-36)				x36
2. Apostar por docenas (0-12/13-24/25-36)		X12
3. Apostar por par/impar				x2
4. Apostar por rojo/negro				x2
5. Dejar de jugar (mostrar el importe del usuario)

Colores: (switch)
0-verde
1-18 negros
19-36 rojos

+Elegir por la opción que se quiere Jugar
+Elegir por qué se apuesta
+Elegir cantidad a apostar

Tirar la bolita, que salga número. A partir de ahí ver si se ha ganado o perdido y se deberá indicar el saldo de cada jugador/*

 */

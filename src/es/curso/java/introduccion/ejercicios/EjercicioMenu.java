package es.curso.java.introduccion.ejercicios;

import java.util.Scanner;

public class EjercicioMenu {
       public static void main(String []Arg) {
    	   System.out.println("Selecciona una opción:");
    	   Scanner scan= new Scanner(System.in);
    	   int respuesta=scan.nextInt();
    	   switch (respuesta){
    	   case 1 : System.out.println("Has seleccionado la opción 1");
    	   System.out.println("¿Que estación quieres?");
    	   Scanner scan2= new Scanner(System.in);
    	   String respuestaEstacion=scan2.nextLine();
    	   if (respuestaEstacion.equals("invierno")) {System.out.println("Los meses que pertenecen a esta estación son: Enero, Febrero y Marzo");}
    	   if (respuestaEstacion.equals("primavera")) {System.out.println("Los meses que pertenecen a esta estación son: Abril, Mayo, Junio");}
    	   if (respuestaEstacion.equals("verano")) {System.out.println("Los meses que pertenecen a esta estación son: Julio, Agosto, Septiembre");}
    	   if (respuestaEstacion.equals("otoño")) {System.out.println("Los meses que pertenecen a esta estación son: Octubre,Noviembre, Diciembre");};break;
    	   case 2 : System.out.println("Ha seleccionado la opción 2"); break;
    	   case 3 : System.out.println("Ha seleccionado la opción 3"); break;
    	   case 4 : System.out.println("Ha seleccionado la opción 4"); break;
    	   case 5 : System.out.println("Se finaliza el programa");break;
    	   default: System.out.println("Opción incorrecta");
       
       }
}}
// Opcion 1,  preguntar por la estación y despues responder los meses de esa estacion
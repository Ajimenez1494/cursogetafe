package es.curso.java.introduccion.ejercicios.condicionales;

import java.util.Scanner;

public class EjercicioCondicionales {
	public static void main(String[] args) {
		 System.out.println("Introduce un mes");
		//String mes = "Enero";
		Scanner scan= new Scanner(System.in);
        String mes=scan.nextLine();
		if (mes.equals("Enero") || mes.equals("Febrero")|| mes.equals("Marzo")) {
			System.out.println("Estas en invierno");
		}
		else if (mes.equals("Abril") || mes.equals("Mayo") || mes.equals("Junio"))
			
		{
			System.out.println("Estas en primavera");

		}
		else if (mes == "julio" || mes == "agosto" || mes == "septiembre")

		{
			System.out.println("Estas en verano");
			if (mes == "agosto") {System.out.println("Estamos en verano");}
		}

		else if (mes == "octubre" || mes == "noviembre" || mes == "diciembre")
				
			{
			System.out.println("Estas en otoño");
			if (mes == "diciembre") {System.out.println("Estamos en invierno");} 
			else
		{ 
			System.out.println("es incorrecto");
		}
		
		
            System.out.println("Fin");
	}}}

/* 

String mes = "Enero";
String estacion = "" ;
if (mes == "Enero" || mes == "Febrero" || mes == "Marzo") {
	 estacion = invierno";
}
else if (mes == "Abril" || mes == "Mayo" || mes == "Junio")
	
{
	 estacion = primavera;

}
else if (mes == "julio" || mes == "agosto" || mes == "septiembre")

{
	estacion = verano;
}

else if (mes == "octubre" || mes == "noviembre" || mes == "diciembre")
		
	{
	estacion = otoño;
	}
	
	else { system.out.println("mes incorrecto")}
	
{  if ( estacion !="")
{
	System.out.println("La estacion es:"+ estacion);
}
 else
    System.out.println("Fin");
    
    
    para añadir lo de las vacaciones usar el += estacion+="Son vacaciones de verano";
*/


//completar el ejercicio de antes con si es par o impar con true o false
//declarar variable de tipo string llamado mes, si el mes es enero, febreo y marzo es invierno abril,junio,mayo primavera, septiembre,julio y agosto verano, octubre,noviembre diciembre otoño
//si no es ninguno es decir que es incorrecto

//  si es agosto son las vacaciones de verano y si el mes es diciembre son las vacaciones de navidad
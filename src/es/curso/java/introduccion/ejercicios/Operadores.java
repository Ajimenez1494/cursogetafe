package es.curso.java.introduccion.ejercicios;

public class Operadores {
       public static void main(String[] args) {
    	//aritmeticos
    	   System.out.println("hola");
    	   int num=0;
    	   ++num;
    	   System.out.println(num++);
    	   System.out.println(num);
    	   
    	   System.out.println(num+=5);
    	   //operador mod
    	   boolean esPar=num%2==0;
    	   System.out.println(esPar);
    	   //condicionales
    	   // > >= <= < ==
    	   boolean esMayor= 7 > (num%2);
    	   
    	   //operadores logicos
    	   int num2= 8;
    	   System.out.println(num2>=7 && num2>2 || num2<3);
       }
       
}

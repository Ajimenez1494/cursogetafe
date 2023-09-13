package es.curso.java.introduccion.funciones;

public class Funciones1 {
    public static void main (String[] args) {
    	for (int i=0; i<=args.length-1; i++)
    		System.out.println(args[i]);
    	//for (string valor:args){ System.out.println(valor);}
    	Funciones1 f1=new Funciones1();
    	f1.metodo1(); 
    	}
    	//Declaración de un método
    	//modificador de acceso:
    	//+public:modificador que permite el acceso desde cualquier otra clase.
    	//+private:solo se puede acceder desde la clase en la que esta declarado
    	//+package (): solo la propia clase y las clases que estan en el mismo paquete, es la que va por defecto si no pone nada
    	//+protected: igual que package pero las clases hijas aunque esten en diferentes paquetes tendrán acceso
    	//2.static
     static void metodo1 () {
    		 
    		 System.out.println("Metodo1");
    	 }
    	
    }



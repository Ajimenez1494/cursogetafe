package es.curso.java.colecciones;

import java.util.ArrayList;

import poo.Persona;

public class PruebaListas {

	public static void main(String[] args) {

		ArrayList lista1= new ArrayList();
		lista1.add("rojo");
		lista1.add("azul");
		lista1.add(1);
		lista1.add(new Persona());
		
		
		
		for(Object object : lista1) {
			System.out.println(object);
			if (object instanceof Persona) {
				Persona p= (Persona)object;
				System.out.println(p.getNombre());
			
			}
			
			
		}
		
	}

}
//linkedHashSet hace que se queden ordenados los objetos que vayas añadiendo
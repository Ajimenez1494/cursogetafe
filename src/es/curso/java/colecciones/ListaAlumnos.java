package es.curso.java.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import es.curso.java.introduccion.utils.Utilidades;
import poo.ejercicios.Alumno;


public class ListaAlumnos {
	public static void main(String[] args) {
	ListaAlumnos ela= new ListaAlumnos();
	  ela.iniciaEjercicio();}
		
		
		private void iniciaEjercicio() {
		List<Alumno> alumnos = generaListadoAlumno();
		 for (Alumno alumno : alumnos) {
			 System.out.println(alumno);
		}
		 String texto="Introduce Dni a borrar:";
         String dni=Utilidades.pideDatoTexto(texto);
         
         for (Alumno alumno : alumnos) {
        	 if(dni.equals(alumno.getDni())) {
        		 alumnos.remove(alumno);
        	 }}
         
         String texto2="Introduce Dni a modificar:";
         String dni2=Utilidades.pideDatoTexto(texto2);
         
         for (Alumno alumno : alumnos) {
        	 if(dni2.equals(alumno.getDni())) {
      //  		 alumno.setNombre("Nombre nuevo")
        	 }}
	   
		}
		
		public List<Alumno>generaListadoAlumno(){
			
			List<Alumno> lista1 = new CopyOnWriteArrayList<Alumno>();
		Alumno Maria = new Alumno("DNI1","Maria", "Perez");
		Alumno Marta = new Alumno("DNI2","Marta", "Perez");
		Alumno Mario = new Alumno("DNI3","Mario", "Perez");
		Alumno Marcos = new Alumno("DNI4","Marcos", "Perez");

		
		if (lista1.isEmpty()) {
			lista1.add(Maria);
			lista1.add(Marta);
			lista1.add(Mario);
			lista1.add(Marcos);
			
				
//         for (Alumno alumno : lista1) {
//			System.out.println("Nombre: " +alumno.getNombre());
//			System.out.println("Apellido : " +alumno.getApellidos());
//			System.out.println("DNI :" +alumno.getDni());
//         }
        // System.out.println(lista1.size());
			
			
			return lista1;
			
		
		}
        
			
		
       //  if (Maria.getDni()=texto)
//         if (lista1.contains(dni)){
//          lista1.remove();        	
//        	
        
        // System.out.println(lista1.size());
		return lista1;

	}
}

package es.curso.java.colecciones.mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import poo.ejercicios.Alumno;

public class MapaAlum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MapaAlum mapa= new MapaAlum ();
     mapa.iniciaEjercicio();
	}

	public void iniciaEjercicio() {
		Map<String,Alumno> alumnosMap = new HashMap<String,Alumno>();
		for(Alumno alumno : generaAlumnos()) {
			alumnosMap.put(alumno.getDni(), alumno);
		}
		System.out.println(alumnosMap.size());

		Collection<Alumno> alumnos=alumnosMap.values();
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		buscaAlumno(alumnosMap);
		double sumaNotas=0;
		for (Alumno alumno : alumnos) {
			sumaNotas += alumno.getNota();
		}
		System.out.println("La media de las notas de todos los alumnos "
				+ "es"+(sumaNotas/alumnos.size()));
		
	}
	
	public void buscaAlumno(Map<String,Alumno> alumnosMap) {
		
		String dni = es.curso.java.introduccion.utils.Utilidades.pideDatoTexto("Escribe el DNI que quieres buscar: ");
		Alumno alumonoEncontrado = alumnosMap.get(dni);
		if (alumonoEncontrado!=null) {
			System.out.println(alumonoEncontrado);
		}else {
			System.out.println("No existe ningun alumno con DNI: "+dni);
		}
	}
	
	
	
	
	
	public Alumno[] generaAlumnos() {
		Alumno alu1= new Alumno("123A", "alu1", "ape1", 6);
		Alumno alu2= new Alumno("123B", "alu2", "ape2", 7);
		Alumno alu3= new Alumno("123C", "alu3", "ape3", 8);
		Alumno alu4= new Alumno("123D", "alu4", "ape4", 9);

		return new Alumno[]{alu1,alu2,alu3,alu4};
		
		
	}
	
}

package poo.ejercicios;



public class AlumnoMain {
	public static void main(String[] args) {
		Alumno p1 = new Alumno();
		p1.nombre="Juan";
		p1.apellidos="Perez";
		p1.dni="GDUFJKG0";
		p1.nota=4;
		p1.estudiar();
		
		Alumno p2 = new Alumno("28376123N", "Pedro", "Garcia");
		p2.estudiar();
		Alumno p3 = new Alumno("28376123N", "Javi", "Garcia",10);
		p3.estudiar();
		
		Alumno [] alumnos = {p1,p2,p3};
		AlumnoMain am= new AlumnoMain();
		am.pintarAprobados(alumnos);
	}
        public void pintarAprobados(Alumno[] alumnos) {
        	for(Alumno alumno:alumnos ) { 
        		System.out.println("Alumnos aprobados: ");
        		if(alumno.nota>=5) {
        			System.out.println(alumno.dni);
        			System.out.println(alumno.nombre);
        			System.out.println(alumno.apellidos);
        			System.out.println(alumno.nota);
        		}
        	}
        	
        }
}

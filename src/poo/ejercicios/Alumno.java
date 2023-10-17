package poo.ejercicios;

public class Alumno {
	String dni;
	String nombre;
	String apellidos;
	int nota;

	public Alumno() {

	}

	public Alumno(String dni, String nombre, String apellidos) {
		this.dni=dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public Alumno(String dni, String nombre, String apellidos, int nota) {
		this.dni=dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void estudiar () {
				System.out.println("La persona con nombre " + this.nombre + " ha sacado un " +this.nota);
				if (nota==0) {
					System.out.println("el alumno " + this.nombre+ " no ha estudiado nada");}
				else if (nota<5) {
						System.out.println("el alumno " + this.nombre+ " ha estudiado poco");}
				else if (nota>5 & nota<=9) {
							System.out.println("el alumno " + this.nombre+ " ha estudiado mucho");}
				else if (nota==10) {
								System.out.println("el alumno " + this.nombre+ " es un genio");
				} else {
					System.out.println("La nota no es valida");
				}
			}

	public void setNombre() {
		// TODO Auto-generated method stub
		
	}
					

}

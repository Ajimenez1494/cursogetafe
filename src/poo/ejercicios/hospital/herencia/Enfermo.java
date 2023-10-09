package poo.ejercicios.hospital.herencia;


public class Enfermo extends Persona {
    private String enfermedad;
    
	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public Enfermo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enfermo(int id, String nombre, int edad) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}
	public void comer () {
		
		
		System.out.println("Paciente"+ getNombre() + "comiendo en la habitación");
	}

}

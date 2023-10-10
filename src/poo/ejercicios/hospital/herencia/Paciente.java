package poo.ejercicios.hospital.herencia;

public class Paciente extends Persona {

	String[] sintomas;

	public String[] getSintomas() {
		return sintomas;
	}

	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}

	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paciente(int id, String nombre, int edad, String [] sintomas) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}
    
	public  void comer() {
		System.out.println("Paciente"+ getNombre() + "comiendo en la habitación");

		
	}

}

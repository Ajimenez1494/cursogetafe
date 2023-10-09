package poo.ejercicios.hospital.herencia;

public class Enfermero extends EmpleadosHospital {
    private int planta;
    
	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}
    
	public void atenderPaciente() {};
	
	public Enfermero() {
		// TODO Auto-generated constructor stub
	}

	public Enfermero(int id, String nombre, int edad, String turno) {
		super(id, nombre, edad, turno);
		// TODO Auto-generated constructor stub
	}

}

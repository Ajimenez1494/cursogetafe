package poo.ejercicios.hospital.herencia;

public class Doctor extends EmpleadosHospital {
    private String especialidad;
    
    
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(int id, String nombre, int edad, String turno) {
		super(id, nombre, edad, turno);
		// TODO Auto-generated constructor stub
	}
   public void diagnosticarPaciente() {};
   
   
}

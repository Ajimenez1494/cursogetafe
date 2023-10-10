package poo.ejercicios.hospital.herencia;



public class Enfermero extends EmpleadosHospital {
    private int planta;
    
	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}
    
	public Paciente[] atenderPaciente(Paciente[] salaEspera) {
		Paciente[] pacientesDeDoctor=new Paciente[salaEspera.length];
		
		for(int i=0;i<salaEspera.length;i++) {
			pacientesDeDoctor[i]=salaEspera[i];
			salaEspera[i]=null;
		}
		return pacientesDeDoctor;
	}
	
	public Enfermero() {
		// TODO Auto-generated constructor stub
	}

	public Enfermero(int id, String nombre, int edad, String turno, int planta) {
		super(id, nombre, edad, turno);
		// TODO Auto-generated constructor stub
	}

}

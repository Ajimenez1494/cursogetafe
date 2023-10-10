package poo.ejercicios.hospital.herencia;

import java.util.Random;


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

	public Doctor(int id, String nombre, int edad, String turno, String especialidad) {
		super(id, nombre, edad, turno);
		// TODO Auto-generated constructor stub
	}
   public Enfermo diagnosticarPaciente(Paciente pac1) {
		Random r=new Random();
		int numAleatorio= r.nextInt(1,10);
		//System.out.println("El numero aleatorio es: " + numAleatorio);
		System.out.println("El numero aleatorio es: " + numAleatorio);
		if(numAleatorio>=8) {
			System.out.println("El paciente " + pac1.getNombre() + " esta enfermo");
			Enfermo enfermo=new Enfermo(pac1.getId(),pac1.getNombre(),pac1.getEdad());
			return enfermo;
		}else {
			System.out.println("El paciente " + pac1.getNombre() + " no esta enfermo");
			return null;
		}
	}
	   
	   
   }
   
   


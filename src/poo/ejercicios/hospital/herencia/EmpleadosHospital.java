package poo.ejercicios.hospital.herencia;

public class EmpleadosHospital extends Persona {
    private String turno;
    
    
	public String getturno() {
		return turno;
	}

	public void setturno(String turno) {
		this.turno = turno;
	}
	public void fichar(EmpleadosHospital empleados) {
		System.out.println("El empleado"+ getNombre() + "esta fichando");

	}

	public EmpleadosHospital() {
		// TODO Auto-generated constructor stub
	}

	public EmpleadosHospital(int id, String nombre, int edad, String turno) {
		super(id, nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Empleado"+ getNombre() + "comiendo en la habitación");

	}

}

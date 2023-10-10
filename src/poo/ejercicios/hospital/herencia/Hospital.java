package poo.ejercicios.hospital.herencia;


public class Hospital {
	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaEspera;

	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
		this.habitaciones = new Habitacion[2];
		this.salaEspera = new Paciente[3];
	}

	public void abrirHospital() {
		Habitacion habitacion1 = new Habitacion(1);
		Habitacion habitacion2 = new Habitacion(2);
		// Habitacion[] habitaciones= {habitacion1,habitacion2};
		this.habitaciones[0] = habitacion1;
		this.habitaciones[1] = habitacion2;

		String[] sintomas1 = { "dolor de cabeza", "dolor de estomago" };

		Paciente paciente1 = new Paciente(1, "Alvaro", 23, sintomas1);
		Paciente paciente2 = new Paciente(2, "Jose", 36, new String[] { "fiebre", "dolor de estomago" });
		Paciente paciente3 = new Paciente(3, "Carlos", 78, new String[] { "fiebre", "dolor de estomago" });

		this.salaEspera[0] = paciente1;
		this.salaEspera[1] = paciente2;
		this.salaEspera[2] = paciente3;

		Enfermero enfermero1 = new Enfermero(1, "Pepe", 47, "Turno2", 1);

		Doctor doctor1 = new Doctor(1, "Felix", 54, "Neurocirujano", "Turno1");

		// Fichan los empleados
		EmpleadosHospital[] empleados = { enfermero1, doctor1 };
		fichar(empleados);

		// Comen todas las personas
		Persona[] personas = { paciente1, paciente2, paciente3, enfermero1, doctor1 };
		comerPersonas(personas);
	

}

	private void fichar(EmpleadosHospital[] empleados) {
		// TODO Auto-generated method stub
		
	}
	public void comerPersonas(Persona[] personas) {
		for (Persona persona : personas) {
			persona.comer();
		}
		

}}

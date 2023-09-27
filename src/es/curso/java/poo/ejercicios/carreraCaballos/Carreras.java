package es.curso.java.poo.ejercicios.carreraCaballos;



public class Carreras {
	private int id;
	private String nombre;
	private Caballo[] caballos;
	private double distancia;
	
	
	
	public void iniciarCarrera() {
		for(int i=0 ; distancia<0; i++)
		if (distancia>0) {
		Caballo caballo = new Caballo();
		caballos[i]=caballo;
		caballo.correr();
		}
         
		if (distancia==0) {System.out.println("ha ganado: " + caballos);}
		
		//	todos los caballos asignados a la carrera se pongan a correr  
			//Devolver caballo ganador
	}
	     public Carreras() {
		super();
	}
		public Carreras(int id, String nombre, Caballo[] caballos, double distancia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.caballos = caballos;
		this.distancia = distancia;
	}
		

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Caballo[] getCaballos() {
		return caballos;
	}

	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	
}

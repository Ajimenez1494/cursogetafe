package es.curso.java.poo.ejercicios.carreraCaballos;

public class Caballo {
       private int id;
       private String nombre;
   	   private int numero;
   	   private int edad;
   	   private double velocidad ;
   	   private double peso ;
   	   private double avance;
   	   
	public double getAvance() {
		return avance;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Caballo(int id, String nombre, int numero, int edad, double velocidad, double peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
	}



	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	
	   public Caballo() {
		// TODO Auto-generated constructor stub
	}

	public void correr (){
	double avanceCaballo=this.velocidad*Math.random()*20+1-this.peso*Math.random()*3+1-this.edad*Math.random()*3+1;
	System.out.println("El caballo avanza " + avanceCaballo + " metros");
	this.avance += avanceCaballo > 0 ? avanceCaballo:0;
}
//	(simular avance del caballo)
//	velocidad*(random(1-20))-peso*(random(1-3))-edad*(random(1-3))
//	"Caballo x avanza z metros"   
//	
	
	
}

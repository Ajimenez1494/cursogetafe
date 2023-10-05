package poo.ejercicios.herencia;

public class Guitarra extends Instrumento {
    
	private int cuerdas;
	public Guitarra(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}
	public Guitarra(String nombre, String tipo, int cuerdas) {
		super(nombre, tipo);}
	
	
	public int getCuerdas() {
		return cuerdas;
	}
	public void setCuerdas(int cuerdas) {
		this.cuerdas = cuerdas;
	}

	public void afinar() {
		  System.out.println("Afinando" + this.getNombre());	  
			  
		  }
  
}

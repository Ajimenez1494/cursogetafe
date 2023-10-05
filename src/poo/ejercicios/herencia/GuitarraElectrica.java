package poo.ejercicios.herencia;

public class GuitarraElectrica extends Guitarra {
    private int potencia;
    
    
	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public GuitarraElectrica(String nombre, String tipo, int cuerdas) {
		super(nombre, tipo, cuerdas);
		// TODO Auto-generated constructor stub
	}
	public GuitarraElectrica(String nombre, String tipo, int cuerdas, int potencia) {
		super(nombre, tipo, cuerdas);
		// TODO Auto-generated constructor stub
	}
	
	 public void tocar() {
		  System.out.println("Tocando muy alto");	  
			  
		  }

}

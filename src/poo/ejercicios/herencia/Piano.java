package poo.ejercicios.herencia;

public class Piano extends Instrumento {
    
	private int numeroOctavas;
	private String tipoPiano;
	
	public int getNumeroOctavas() {
		return numeroOctavas;
	}

	public void setNumeroOctavas(int numeroOctavas) {
		this.numeroOctavas = numeroOctavas;
	}

	public String getTipoPiano() {
		return tipoPiano;
	}

	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}

	public Piano(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}


	public Piano(String nombre, String tipo, int numeroOctavas, String tipoPiano) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	public void afinar() {
		  System.out.println("Afinando" + this.getNombre());	  
			  
		  }
	
}

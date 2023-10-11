package poo.herencia.interfaces;

public class Coche extends Vehiculo {
    private int numPuertas;
    
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public Coche(int id, String matricula, String marca, int numPuertas) {
		super(id, matricula, marca);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

	
	
}

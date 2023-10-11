package poo.herencia.interfaces;

public class Moto extends Vehiculo {
    private int numRuedas;
    
	
	public int getNumRuedas() {
		return numRuedas;
	}


	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}


	public Moto(int id, String matricula, String marca, int numRuedas) {
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

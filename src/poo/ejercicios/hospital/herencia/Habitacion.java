package poo.ejercicios.hospital.herencia;

public class Habitacion {
	private int numero;
    private Enfermo enfermo;
	
    public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Enfermo getEnfermo() {
		return enfermo;
	}
	public void setEnfermo(Enfermo enfermo) {
		this.enfermo = enfermo;
	}
	public Habitacion(int numero, Enfermo enfermo) {
		super();
		this.numero = numero;
		this.enfermo = enfermo;
	}
	
}

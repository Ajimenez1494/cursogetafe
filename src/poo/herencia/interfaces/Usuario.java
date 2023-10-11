package poo.herencia.interfaces;

public class Usuario {
	private Movil movil;
	private Moto moto;
	private Coche coche;
    private Television television;
	
    public Movil getMovil() {
		return movil;
	}
	public void setMovil(Movil movil) {
		this.movil = movil;
	}
	public Moto getMoto() {
		return moto;
	}
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	public Coche getCoche() {
		return coche;
	}
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	public Television getTelevision() {
		return television;
	}
	public void setTelevision(Television television) {
		this.television = television;
	}
	
	public Usuario(Movil movil, Moto moto, Coche coche, Television television) {
		super();
		this.movil = movil;
		this.moto = moto;
		this.coche = coche;
		this.television = television;
	}
    
	
}

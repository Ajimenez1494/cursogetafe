package es.curso.java.poo.ejercicios.carreraCaballos;

public class GranPremio {
	private int id;
	private String nombre;
	private Carreras [] carreras;
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
	public Carreras[] getCarreras() {
		return carreras;
	}
	public void setCarreras(Carreras[] carreras) {
		this.carreras = carreras;
	}
	public GranPremio(int id, String nombre, Carreras[] carreras) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carreras = carreras;
	}
}

package es.curso.java.bbdd.ejercicios.bibliotecabbdd.entities;

public class Direccion {
	private int id;
	private String calle;
	private int cod_postal;
	private int numero;
	private String localidad;
	
	
	public Direccion(int id, String calle, int cod_postal, int numero, String localidad) {
		super();
		this.id = id;
		this.calle = calle;
		this.cod_postal = cod_postal;
		this.numero = numero;
		this.localidad= localidad;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public int getCod_postal() {
		return cod_postal;
	}


	public void setCod_postal(int cod_postal) {
		this.cod_postal = cod_postal;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calle=" + calle + ", cod_postal=" + cod_postal + ", numero=" + numero + "]";
	}
	
	
	
}

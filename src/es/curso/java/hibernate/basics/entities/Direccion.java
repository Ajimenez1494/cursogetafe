package es.curso.java.hibernate.basics.entities;

public class Direccion {
	private long id;
	private String tipo;
	private String nombre;
	private String ciudad;
	private String provincia;
	private int codPostal;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	@Override
	public String toString() {
		return "Direccion [id=" + id + ", tipo=" + tipo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", provincia="
				+ provincia + ", codPostal=" + codPostal + "]";
	}
	public Direccion(long id, String tipo, String nombre, String ciudad, String provincia, int codPostal) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codPostal = codPostal;
	}
	public Direccion() {
		super();
	}
	
}

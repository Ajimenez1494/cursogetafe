package poo.ejercicios;

public class Direccion {
      private String nombreCalle;
      private int numero;
      private int codPostal;
      private String poblacion;
      private String provincia;
	private long id;
	private String tipo;
	private String nombre;
	private String ciudad;
      
      
      public String getNombreCalle() {
		return nombreCalle;
	}


	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getCodPostal() {
		return codPostal;
	}


	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}


	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public Direccion(String nombreCalle, int numero, int codPostal) {
		super();
		this.nombreCalle = nombreCalle;
		this.numero = numero;
		this.codPostal = codPostal;
	}


	public Direccion(String nombreCalle, int numero, int codPostal, String poblacion, String provincia) {
		super();
		this.nombreCalle = nombreCalle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.poblacion = poblacion;
		this.provincia = provincia;
	}


	public Direccion(long id, String tipo, String nombre, String ciudad, String provincia, int codPostal) {

		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codPostal = codPostal;
	}
}

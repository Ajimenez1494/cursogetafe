package poo.ejercicios;

public class Pantalon {
    private long id;
	private String color;
	private String talla;
	private int precio;
    private Boton boton;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Boton getBoton() {
		return boton;
	}
	public void setBoton(Boton boton) {
		this.boton = boton;
	}
	public Pantalon(long id, String color, String talla, int precio, Boton boton) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.boton = boton;
	}
	public Pantalon() {
		super();
	}
	
	
	 
	  
	   
	  
}

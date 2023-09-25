package poo.ejercicios;

public class Vestido {
	 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Vestido() {
		super();
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
	public Vestido(long id, String color, String talla, int precio) {
		super();
		this.id = id;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}
	private long id;
		private String color;
		private String talla;
		private int precio;
}

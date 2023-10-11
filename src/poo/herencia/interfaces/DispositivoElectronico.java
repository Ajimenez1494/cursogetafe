package poo.herencia.interfaces;

public abstract class DispositivoElectronico implements SistemaEncendido {
	private int id;
	private double precio;
	private String fabricante;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public DispositivoElectronico(int id, double precio, String fabricante) {
		super();
		this.id = id;
		this.precio = precio;
		this.fabricante = fabricante;
	}
	
	
}

package poo.ejercicios;

public class Boton {
   private long id;
   private String forma;
   private String color;
   private double tamaño;
    public Boton(long id, String forma, String color, double tamaño) {
	super();
	this.id = id;
	this.forma = forma;
	this.color = color;
	this.tamaño = tamaño;
	
	
}
	public Boton() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
    
    
}

package es.curso.java.poo.ejercicios.carreraCaballos;

public class Apostante {
    private String nombre;
	private double saldo ;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getApuesta() {
		return apuesta;
	}
	public void setApuesta(String apuesta) {
		this.apuesta = apuesta;
	}
	private String apuesta;
	public Apostante(String nombre, double saldo, String apuesta) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.apuesta = apuesta;
	}
	
}

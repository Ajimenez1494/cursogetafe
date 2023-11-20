package es.curso.java.bbdd.ejercicios.bibliotecabbdd.entities;

import java.util.List;

import poo.ejercicios.Direccion;

public class Biblioteca {
	private long id;
	private String nombre;
	private Direccion direccion;
	
	public Biblioteca(long id, String nombre, Direccion direccion2) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion2;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (direccion != null ? "direccion=" + direccion : "") + "]";
	}
	public List<Libro> getLibros() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

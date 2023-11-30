package es.curso.java.hibernate.basics.entities;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "TB_PRODUCTO")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;
	
@Column(length = 9, name = "NOMBRE_PRODUCTO")
private String nombre;

@Column(length = 9, name = "TIPO_PRODUCTO")
private String tipo;

@Column( name = "UNIDADES")
private int unidades;

@Column( name = "PRECIO")
private double precio;

@Column( name = "FECHA_ALTA")
private LocalDate fechaAlta;




public Producto(Long id, String nombre, String tipo, int unidades, double precio, LocalDate fechaAlta) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.tipo = tipo;
	this.unidades = unidades;
	this.precio = precio;
	this.fechaAlta = fechaAlta;
}


public Producto() {
	super();
}


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public LocalDate getFechaAlta() {
	return fechaAlta;
}
public void setFechaAlta(LocalDate fechaAlta) {
	this.fechaAlta = fechaAlta;
}
public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


public int getUnidades() {
	return unidades;
}


public void setUnidades(int unidades) {
	this.unidades = unidades;
}


@Override
public String toString() {
	return "Producto [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", unidades=" + unidades + ", precio="
			+ precio + ", fechaAlta=" + fechaAlta + "]";
}



}

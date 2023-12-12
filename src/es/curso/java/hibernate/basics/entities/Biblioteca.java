package es.curso.java.hibernate.basics.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_BIBLIOTECAS")
public class Biblioteca {
	@Id
	@SequenceGenerator(name="BIBLIOTECASGEN", sequenceName="BIBLIOTECAS_GEN", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BIBLIOTECASGEN")
	@Column(name="ID", nullable=false, updatable=false)
	private long id;
	private String nombre;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_direccion", foreignKey = @ForeignKey(name = "fk_bibliotecadireccion") )
  

	private Direccion direccion;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	public Biblioteca(long id, String nombre, Direccion direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public Biblioteca() {
		super();
	}
	
	
}

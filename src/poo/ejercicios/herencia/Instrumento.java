package poo.ejercicios.herencia;

public class Instrumento {
	private String nombre;
	private String tipo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	} 


  public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

public void afinar() {
  System.out.println("Afinando instrumento:" + this.nombre);	  
	  
  }
  public void tocar() {
	  System.out.println("Tocando instrumento:" + this.nombre);	  
		  
	  }
  
  }
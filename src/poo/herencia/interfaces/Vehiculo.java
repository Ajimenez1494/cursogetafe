package poo.herencia.interfaces;

public abstract class Vehiculo implements SistemaEncendido {
	private int id;
    private String matricula;
	private String marca;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Vehiculo(int id, String matricula, String marca) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
	}
	
}

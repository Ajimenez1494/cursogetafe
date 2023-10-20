package poo.ejercicios.EjercicioNave;

public class Guerrero {
	private String nombre;
	private String tipo;
	private int fuerza;
	private int resistencia;

	public Guerrero(String nombre, String tipo, int fuerza, int resistencia) throws LimiteValoresException {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.fuerza = fuerza;
		this.resistencia = resistencia;

		if (fuerza + resistencia > 10) {
			throw new LimiteValoresException(
					"La suma de la fuerza " + "y la resistencias del guerrero " + "no puede ser superior a 10");
		} else {
			this.fuerza = fuerza;
			this.resistencia = resistencia;
		}
		this.nombre = nombre;
		this.tipo = tipo;

	}

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

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public String toString() {
		return "Guerrero [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (tipo != null ? "tipo=" + tipo + ", " : "") + "fuerza=" + fuerza + ", resistencia=" + resistencia
				+ "]";
	}

	public int getAtaque() {
		// TODO Auto-generated method stub
		return 0;
	}
}

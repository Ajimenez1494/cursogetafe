package poo.ejercicios.EjercicioNave;

import java.util.ArrayList;
import java.util.List;

public abstract class VehiculoGuerra implements Tripulable {
	private int puntosVida = PUNTOS_VIDA;
	private int ataque = 5;
	private int defensa = 5;
	private String nombre;
	private List<Guerrero> guerreros = new ArrayList<Guerrero>();

	public void embarcar(List<Guerrero> guerreros) throws UnidadesPermitidasExcepcion, LimiteValoresException {
		if (this.guerreros.size() < 10) {
			this.guerreros.add((Guerrero) guerreros);
		} else {
			throw new UnidadesPermitidasExcepcion("Has superado el numero de unidades máximo establecido en 10");
		}

	}

	private VehiculoGuerra(int ataque, int defensa) throws LimiteValoresException {
		if (ataque + defensa > 10) {
			throw new LimiteValoresException("La suma del ataque " + "y defensa de la nave no puede ser superior a 10");
		} else {
			this.ataque = ataque;
			this.defensa = defensa;
		}
	}

	public VehiculoGuerra(String nombre) throws LimiteValoresException {
		this(5, 5);
		this.nombre = nombre;

	}

	public VehiculoGuerra(String nombre, int ataque, int defensa) throws LimiteValoresException {
		this(ataque, defensa);
		this.nombre = nombre;
	}

	public VehiculoGuerra(String nombre, int ataque, int defensa, int puntosVida) throws LimiteValoresException {
		this(ataque, defensa);
		this.nombre = nombre;
		this.puntosVida = puntosVida;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public List<Guerrero> getGuerreros() {
		return guerreros;
	}

	public void setGuerreros(List<Guerrero> guerreros) {
		this.guerreros = guerreros;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

package poo.ejercicios.EjercicioNave;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nave extends VehiculoGuerra {
	Guerrero guerrero1 = new Guerrero(null, null, 0, 0);
	Guerrero guerrero2 = new Guerrero(null, null, 0, 0);
	Guerrero guerrero3 = new Guerrero(null, null, 0, 0);
	Guerrero guerrero4 = new Guerrero(null, null, 0, 0);

	@Override
	public void embarcar(List<Guerrero> nuevosGuerreros) throws UnidadesPermitidasExcepcion, LimiteValoresException {
		if (getGuerreros().size() + nuevosGuerreros.size() <= 10) {
			getGuerreros().addAll(nuevosGuerreros);
		} else {
			throw new UnidadesPermitidasExcepcion("Has superado el número máximo de unidades permitidas en la nave.");
		}
	}

	public void embarcar(Guerrero guerreros) throws UnidadesPermitidasExcepcion, LimiteValoresException {
		if (getGuerreros().size() <= 10) {
			getGuerreros().add(guerreros);
		} else {
			throw new UnidadesPermitidasExcepcion("Has superado el número máximo de unidades permitidas en la nave.");
		}
	}

	public Nave(String nombre) throws LimiteValoresException {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Nave(String nombre, int ataque, int defensa) throws LimiteValoresException {
		super(nombre, ataque, defensa);
		// TODO Auto-generated constructor stub
	}

	public Nave(String nombre, int ataque, int defensa, int puntosVida) throws LimiteValoresException {
		super(nombre, ataque, defensa, puntosVida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int atacar() {
		// Ataque: ataque VehiculoGuerra*(random 0-1)+SUM(ataque todos
		// Guerreros)*(random 0-0.5)
		Random random = new Random();

		// Calcular el ataque de VehiculoGuerra
		int ataqueNave = getAtaque();
		double factorAtaqueNave = random.nextDouble(); // Número aleatorio entre 0 y 1
		double ataqueTotalNave = ataqueNave * factorAtaqueNave;

		// Calcular la suma del ataque de todos los Guerreros embarcados
		int ataqueTotalGuerreros = 0;
		for (Guerrero guerrero : getGuerreros()) {
			ataqueTotalGuerreros += guerrero.getAtaque();
		}

		// Calcular el ataque total según la fórmula
		double ataqueTotal = ataqueTotalNave + ataqueTotalGuerreros * (random.nextDouble() * 0.5);

		// Convertir el resultado a un entero si es necesario
		return (int) ataqueTotal;
	}

	@Override
	public int defender(int ataque) {
		// defensa VehiculoGuerra*(random0-1) + Sumatorio(resistencia todos
		// guerreros)*(random0-0.5)
		Random random = new Random();

		// Calcular la defensa de VehiculoGuerra
		int defensaNave = getDefensa();
		double factorDefensaNave = random.nextDouble(); // Número aleatorio entre 0 y 1
		double defensaTotalNave = defensaNave * factorDefensaNave;

		// Calcular la suma de la resistencia de todos los Guerreros embarcados
		int resistenciaTotalGuerreros = 0;
		for (Guerrero guerrero : getGuerreros()) {
			resistenciaTotalGuerreros += guerrero.getResistencia(); // Asumiendo que los guerreros tienen un atributo
																	// "resistencia"
		}

		// Calcular la defensa total según la fórmula
		double defensaTotal = defensaTotalNave + resistenciaTotalGuerreros * (random.nextDouble() * 0.5);

		// Reducir el daño recibido por la defensa
		int dañoRecibido = ataque - (int) defensaTotal;
		if (dañoRecibido < 0) {
			dañoRecibido = 0; // No puede ser un número negativo
		}

		return dañoRecibido;

	}

}

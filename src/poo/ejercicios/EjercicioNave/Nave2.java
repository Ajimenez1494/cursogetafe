package poo.ejercicios.EjercicioNave;

public class Nave2 extends VehiculoGuerra {

	
	
	
	public Nave2(String nombre) throws LimiteValoresException {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Nave2(String nombre, int ataque, int defensa) throws LimiteValoresException {
		super(nombre, ataque, defensa);
		// TODO Auto-generated constructor stub
	}

	public Nave2(String nombre, int ataque, int defensa, int puntosVida) throws LimiteValoresException {
		super(nombre, ataque, defensa, puntosVida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int atacar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defender(int ataque) {
		// TODO Auto-generated method stub
		return 0;
	}

}

package poo.ejercicios.EjercicioNave;

import java.util.ArrayList;
import java.util.List;

public class Guerra {

	public static void main(String[] args) throws LimiteValoresException, UnidadesPermitidasExcepcion {
		// TODO Auto-generated method stub
		Guerra guerra1 = new Guerra();
		guerra1.iniciarGuerra();
	}

	public void iniciarGuerra() throws LimiteValoresException, UnidadesPermitidasExcepcion {
		Nave nave1 = new Nave("nave1");
		Nave nave2 = new Nave("nave2");
		construyeVehiculos(nave1);
		construyeVehiculos(nave2);

		while (nave1.getPuntosVida() > 0 && nave2.getPuntosVida() > 0) {
			// Turno de la Nave1
			int ataqueNave1 = nave1.atacar();
			int dañoRecibidoNave1 = nave2.defender(ataqueNave1);
			nave2.setPuntosVida(nave2.getPuntosVida() - dañoRecibidoNave1);

			// Turno de la Nave2
			int ataqueNave2 = nave2.atacar();
			int dañoRecibidoNave2 = nave1.defender(ataqueNave2);
			nave1.setPuntosVida(nave1.getPuntosVida() - dañoRecibidoNave2);
		}
		if (nave1.getPuntosVida() <= 0 && nave2.getPuntosVida() <= 0) {
			System.out.println("La guerra ha terminado en empate.");
		} else if (nave1.getPuntosVida() <= 0) {
			System.out.println("Nave2 ha ganado la guerra.");
		} else {
			System.out.println("Nave1 ha ganado la guerra.");
		}
	}

	VehiculoGuerra construyeVehiculos(Nave nave1) throws LimiteValoresException {

		Guerrero guerrero1 = new Guerrero("Guerrero1", "Tipo1", 6, 4);
		Guerrero guerrero2 = new Guerrero("Guerrero2", "Tipo1", 3, 7);
		Guerrero guerrero3 = new Guerrero("Guerrero3", "Tipo1", 4, 6);
		Guerrero guerrero4 = new Guerrero("Guerrero4", "Tipo1", 5, 5);
		
		try {
			nave1.embarcar(guerrero1);
			nave1.embarcar(guerrero2);
			nave1.embarcar(guerrero3);
			nave1.embarcar(guerrero4);
		} catch (UnidadesPermitidasExcepcion | LimiteValoresException e) {
			
		}

		return nave1; 
	}


	VehiculoGuerra vehiculosBasedeDatos() {

		return null;
	}
}

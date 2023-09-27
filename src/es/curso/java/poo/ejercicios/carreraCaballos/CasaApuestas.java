package es.curso.java.poo.ejercicios.carreraCaballos;

public class CasaApuestas {
	public static void main(String[] args) {
		// Crear Caballos
		Caballo caballo1 = new Caballo(1, "Negro", 7, 5, 70, 300);
		Caballo caballo2 = new Caballo(2, "Pinto", 3, 7, 40, 200);
		Caballo caballo3 = new Caballo(3, "Castaño", 5, 10, 40, 250);
		Caballo[] caballos = { caballo1, caballo2, caballo3 };

		// Crear Carreras
		Carreras carrera1 = new Carreras(1, "carrera 1", caballos, 200);
		Carreras carrera2 = new Carreras(1, "carrera 2", caballos, 500);
		Carreras carrera3 = new Carreras(1, "carrera 3", caballos, 600);
		Carreras[] carreras = { carrera1, carrera2, carrera3 };

		// Crear Gran premio

		GranPremio granPremio1 = new GranPremio(1, "Gran premio 1", carreras);

		CasaApuestas casaApuestas = new CasaApuestas();
		casaApuestas.empezarGranPremio(carreras);

	}

	public void empezarGranPremio(Carreras[] carreras) {
		for (Carreras carrera : carreras) {
			carrera.iniciarCarrera();
			// System.out.println(granPremio1);
			System.out.println(carrera.getNombre());
			System.out.println(carrera.getCaballos().length);
			System.out.println();

			if (carrera.getCaballos() != null) {
				Caballo[] arrayCaballos = carrera.getCaballos();
				for (Caballo caballo : arrayCaballos) {
					System.out.println(caballo.getNombre());
					System.out.println(caballo.getNumero());
				}

			}

		}
//       
//        Mostrar todos los datos del gran premio,
//		+ Nombre
//		+ Numero de carreras
//		+ Por cada carrera 
//			- Cuantos caballos participan
//			- Nombre y dorsal de todos los caballos

	}
}
package es.curso.java.introduccion.ejercicios.arrays;

public class EjercicioArray {
	public static void main(String[] arg) {

		String[] nombres = { "Alumno1:9", "Alumno2:8", "Alumno3:3", "Alumno4:4", "Alumno5:5", "Alumno6:10",
				"Alumno7:4" };
		int contador = 0;
		for (int i = 0; i < nombres.length; i++) {
			String dato = nombres[i];
			// System.out.println(dato);
			String[] partes = dato.split(":");
			if (partes.length == 2) {
				String alumno = partes[0];
				String nota = partes[1];

				int notaStr = Integer.parseInt(nota);
				{
					System.out.println("La nota del " + alumno + " es:" + notaStr);
				}

				int aprobado = 5;
				if (notaStr >= aprobado) {
					contador++;
					System.out.println("El " + alumno + " esta aprobado");
				}
				if (notaStr < aprobado) {
					System.out.println("El " + alumno + " esta suspenso");
				}

				// int nota = Integer.parseInt(notaStr);
			}

		}

		String[] alumnosAprobados = new String[contador];
		int indice = 0;
		for (int i = 0; i < nombres.length; i++) {
			String dato = nombres[i];
			// System.out.println(dato);
			String[] partes = dato.split(":");
			if (partes.length == 2) {
				String alumno = partes[0];
				String nota = partes[1];

				int notaStr = Integer.parseInt(nota);

				int aprobado = 5;
				if (notaStr >= aprobado) {
					alumnosAprobados[indice] = alumno;
					indice++;
				}

				// int nota = Integer.parseInt(notaStr);
			}

		}
		for (String alumno : alumnosAprobados)
			System.out.println("Los alumnos aprobados son:" + alumno);

//		for ( String listado:alumnosAprobados)
//		System.out.println(contador );

	}

}

//int num = Integer.parseInt("0"); (para convertir un string en un int)
package es.curso.java.colecciones.mapas.equipo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class testMapa {

	public static void main(String[] args) {
		testMapa liga= new testMapa();
		liga.iniciarLiga();
		
		
	}
	
		// TODO Auto-generated method stub
		
	private void iniciarLiga(){	
	
    Map <List<Equipo>, List<Jugador>>listado= new HashMap<>();
    
    Equipo equipo1 = new Equipo("Equipo A", 1, 3);
    Equipo equipo2 = new Equipo("Equipo B", 0, 2);

    Jugador jugador1 = new Jugador("Jugador 1", 21, "Delantero");
    Jugador jugador2 = new Jugador("Jugador 2", 33, "Lateral izquierdo");
    Jugador jugador3 = new Jugador("Jugador 3",  27, "Delantero");
    Jugador jugador4 = new Jugador("Jugador 4", 20, "Lateral derecho");
    Jugador jugador5 = new Jugador("Jugador 5", 24, "Delantero");
    Jugador jugador6 = new Jugador("Jugador 6", 26, "Portero");

    List<Equipo> equipos = new ArrayList<>();
    List<Jugador> jugadoresEquipo1 = new ArrayList<>();
    List<Jugador> jugadoresEquipo2 = new ArrayList<>();

    equipos.add(equipo1);
    equipos.add(equipo2);

    jugadoresEquipo1.add(jugador1);
    jugadoresEquipo1.add(jugador2);
    jugadoresEquipo1.add(jugador3);

    jugadoresEquipo2.add(jugador4);
    jugadoresEquipo2.add(jugador5);
    jugadoresEquipo2.add(jugador6);

    listado.put(equipos, jugadoresEquipo1);
    listado.put(equipos, jugadoresEquipo2);
    
    
    
        for (List<Jugador> jugadores : listado.values()) {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre());
        }
    }


    Equipo equipoMostrar = equipo1;
    System.out.println("Información del equipo: " + equipoMostrar.getNombre());

    for (Map.Entry<List<Equipo>, List<Jugador>> entry : listado.entrySet()) {
        if (entry.getKey().contains(equipoMostrar)) {
            System.out.println("Jugadores del equipo:");

            for (Jugador jugador : entry.getValue()) {
                System.out.println("Nombre: " + jugador.getNombre() +
                                   ", Posición: " + jugador.getPosicion() +
                                   ", Edad: " + jugador.getEdad());
            }
        }
    }
    

   
	}
	

	
	//Mapa 2 equipos con 3 jugadores

	//Mostrar Solo los nombres de los jugadores
	//Mostrar la información de un equipo y todos los datos de los jugadores del equipo
	
	
}

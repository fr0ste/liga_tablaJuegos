package pojo;

import java.util.Hashtable;


public class Equipo {

	private String nombre; //Llave primaria (id)
	private Hashtable<String, Jugador> jugadores;
	
	public Equipo() {
		jugadores = new Hashtable<String, Jugador>();
	}
	
	public Equipo(String nombre) {
		this.setNombre(nombre);
		jugadores = new Hashtable<String, Jugador>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Hashtable<String, Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugador(Jugador jugador) {
		jugadores.put(jugador.getId(), jugador);
	}
	
}

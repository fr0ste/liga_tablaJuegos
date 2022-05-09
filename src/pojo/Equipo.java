/* Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 09/05/2022
 * 
 * Descripción: clase de tipo Equipo 
 * 
 * 
 */


package pojo;

import java.util.Hashtable;


public class Equipo {

	private String id;
	private String nombre;
	private Hashtable<String, Jugador> jugadores;
	
	public Equipo() {
		jugadores = new Hashtable<String, Jugador>();
	}
	
	public Equipo(String nombre, String id) {
		
		this.setNombre(nombre);
		this.setId(id);
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}

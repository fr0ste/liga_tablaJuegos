/*
 * Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 
 * 
 * Descripci�n: 
 * 
 * 
 */





package service;

import java.util.Hashtable;

import pojo.Jugador;

public interface IJugadorService {
	
	public void crearJugador(Hashtable<String, Jugador> lista, Jugador jugador);
	public Jugador crearJugador();
	public void eliminarJugador(Hashtable<String, Jugador> lista, String idJugador);
	public void actualizarJugador(Hashtable<String, Jugador> lista, Jugador jugador);
	public Jugador obtenerUnJugador(Hashtable<String, Jugador> lista, String idJugador);
	public Hashtable<String, Jugador> obtenerTodosJugador(Hashtable<String, Jugador> lista, Jugador jugador);
	
	
}
	
	//public Jugador crearJugador();
	
	/*
	// CRUD 5 metodos, crear, eliminar, actualizar, leer 1 registro, leer todos los registros
		
		public List<Jugador> eliminarJugador(List<Jugador> lista, String idJugador);
		public List<Jugador> actualizarJugador(List<Jugador> lista, Jugador jugador);
		public Jugador obtenerUnJugador(List<Jugador> lista, String idJugador);
		public List<Jugador> obtenerTodosJugador(List<Jugador> lista, Jugador jugador);
		*/
//}

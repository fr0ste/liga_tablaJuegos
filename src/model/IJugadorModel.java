/*
 * Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 
 * 
 * Descripción: 
 * 
 * 
 */




package model;


import pojo.Jugador;

public interface IJugadorModel {
	// CRUD 5 metodos, crear, eliminar, actualizar, leer 1 registro, leer todos los registros
	public Jugador crearJugador();
	
	
	/*
	public List<Jugador> crearJugador(List<Jugador> lista, Jugador jugador);
	public List<Jugador> eliminarJugador(List<Jugador> lista, long idJugador);
	public List<Jugador> actualizarJugador(List<Jugador> lista, Jugador jugador);
	public Jugador obtenerUnJugador(List<Jugador> lista, long idJugador);
	public List<Jugador> obtenerTodosJugador(List<Jugador> lista, Jugador jugador);
	*/
}

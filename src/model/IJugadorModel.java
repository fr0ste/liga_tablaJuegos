/* Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 09/05/2022
 * 
 * Descripción: interface para el modelo del jugador 
 * 
 * 
 */




package model;


import java.util.Hashtable;

import pojo.Jugador;

public interface IJugadorModel {
	// CRUD 5 metodos, crear, eliminar, actualizar, leer 1 registro, leer todos los registros
	//public Jugador crearJugador();
	
	public void crearJugador(Hashtable<String, Jugador> lista, Jugador jugador);
	public Jugador crearJugador(String id, String nombre, int edad, String direccion, String telefono);
	public void eliminarJugador(Hashtable<String, Jugador> lista, String idJugador);
	public void actualizarJugador(Hashtable<String, Jugador> lista, Jugador jugador);
	public Jugador obtenerUnJugador(Hashtable<String, Jugador> lista, String idJugador);
	public Hashtable<String, Jugador> obtenerTodosJugador(Hashtable<String, Jugador> lista, Jugador jugador);
	
}

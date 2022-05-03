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




package model;


import java.util.List;

import pojo.Jugador;

public interface IJugadorModel {
	// CRUD 5 metodos, crear, eliminar, actualizar, leer 1 registro, leer todos los registros
	//public Jugador crearJugador();
	
	public void crearJugador(List<Jugador> lista, Jugador jugador);
	public void eliminarJugador(List<Jugador> lista, long idJugador);
	public void actualizarJugador(List<Jugador> lista, Jugador jugador);
	public Jugador obtenerUnJugador(List<Jugador> lista, long idJugador);
	public List<Jugador> obtenerTodosJugador(List<Jugador> lista, Jugador jugador);
}

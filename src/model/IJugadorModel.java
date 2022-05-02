package model;

import java.util.List;

import pojo.Jugador;

public interface IJugadorModel {
	// CRUD 5 metodos, crear, eliminar, actualizar, leer 1 registro, leer todos los registros
	public List<Jugador> crearJugador(List<Jugador> lista, Jugador jugador);
	public List<Jugador> eliminarJugador(List<Jugador> lista, long idJugador);
	public List<Jugador> actualizarJugador(List<Jugador> lista, Jugador jugador);
	public Jugador obtenerUnJugador(List<Jugador> lista, long idJugador);
	public List<Jugador> obtenerTodosJugador(List<Jugador> lista, Jugador jugador);
}

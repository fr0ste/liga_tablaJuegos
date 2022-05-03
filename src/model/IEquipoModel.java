package model;

import java.util.List;

import pojo.Equipo;
import pojo.Jugador;

public interface IEquipoModel {
	// CRUD 5 metodos, crear, eliminar, actualizar, leer 1 registro, leer todos los
	// registros
	// public Jugador crearJugador();

	public void crearEquipo(List<Equipo> lista, Equipo equipo);

	public void eliminarEquipo(List<Equipo> lista, long idEquipo);

	public void actualizarEquipo(List<Equipo> lista, Equipo equipo);

	public Jugador obtenerUnEquipo(List<Equipo> lista, long idEquipo);

	public List<Jugador> obtenerTodosEquipo(List<Equipo> lista, Equipo equipo);

}

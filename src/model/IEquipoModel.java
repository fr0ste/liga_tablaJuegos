package model;

import java.util.Hashtable;
import java.util.List;

import pojo.Equipo;
import pojo.Jugador;

public interface IEquipoModel {
	// CRUD 5 metodos, crear, eliminar, actualizar, leer 1 registro, leer todos los
	// registros
	// public Jugador crearJugador();

	public void guardarEquipo(Hashtable<String, Equipo> lista, Equipo equipo);

	public void eliminarEquipo(Hashtable<String, Equipo> lista, String idEquipo);

	public void actualizarEquipo(Hashtable<String, Equipo> lista, Equipo equipo);

	public Jugador obtenerUnEquipo(Hashtable<String, Equipo> lista, String idEquipo);

	public List<Jugador> obtenerTodosEquipo(Hashtable<String, Equipo> lista, Equipo equipo);

}

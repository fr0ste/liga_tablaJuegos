package service;

import java.util.List;

import pojo.Equipo;
import pojo.Jugador;

public interface IEquipoService {
	public void crearEquipo(List<Equipo> lista, Equipo equipo);

	public void eliminarEquipo(List<Equipo> lista, long idEquipo);

	public void actualizarEquipo(List<Equipo> lista, Equipo equipo);

	public Jugador obtenerUnEquipo(List<Equipo> lista, long idEquipo);

	public List<Jugador> obtenerTodosEquipo(List<Equipo> lista, Equipo equipo);
}

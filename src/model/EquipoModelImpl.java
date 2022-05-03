package model;

import java.util.List;

import pojo.Equipo;
import pojo.Jugador;

public class EquipoModelImpl implements IEquipoModel{

	@Override
	public void crearEquipo(List<Equipo> lista, Equipo equipo) {
		lista.add(equipo);
	}

	@Override
	public void eliminarEquipo(List<Equipo> lista, long idEquipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarEquipo(List<Equipo> lista, Equipo equipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jugador obtenerUnEquipo(List<Equipo> lista, long idEquipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jugador> obtenerTodosEquipo(List<Equipo> lista, Equipo equipo) {
		// TODO Auto-generated method stub
		return null;
	}

}

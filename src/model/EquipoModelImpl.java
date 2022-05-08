package model;

import java.util.Hashtable;
import java.util.List;

import pojo.Equipo;
import pojo.Jugador;

public class EquipoModelImpl implements IEquipoModel{

	@Override
	public void guardarEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
		lista.put(equipo.getNombre(), equipo);
	}

	@Override
	public void eliminarEquipo(Hashtable<String, Equipo> lista, String idEquipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jugador obtenerUnEquipo(Hashtable<String, Equipo> lista, String idEquipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jugador> obtenerTodosEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipo crearEquipo(String nombre) {
		
		return new Equipo(nombre);
	}

}

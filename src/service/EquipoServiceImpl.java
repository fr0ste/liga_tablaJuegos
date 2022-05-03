package service;

import java.util.List;

import model.EquipoModelImpl;
import model.IEquipoModel;
import pojo.Equipo;
import pojo.Jugador;

public class EquipoServiceImpl implements IEquipoService {

	IEquipoModel model = new EquipoModelImpl();
	@Override
	public void crearEquipo(List<Equipo> lista, Equipo equipo) {
		model.crearEquipo(lista, equipo);
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

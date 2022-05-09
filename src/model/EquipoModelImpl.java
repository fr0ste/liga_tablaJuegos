package model;

import pojo.Equipo;


public class EquipoModelImpl implements IEquipoModel{


	@Override
	public Equipo crearEquipo(String nombre, String id) {
		
		return new Equipo(nombre,id);
	}

}

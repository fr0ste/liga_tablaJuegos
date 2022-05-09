/* Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 09/05/2022
 * 
 * Descripción: implementacion del modelo de torneo 
 * 
 * 
 */


package model;

import java.util.Hashtable; 

import pojo.Equipo;
import pojo.Jugador;
import pojo.Torneo;


public class TorneoModelImpl implements ITorneoModel{

	@Override
	public Torneo crearTorneo(String nombreTorneo, String categoria) {
		
		return new Torneo(nombreTorneo,categoria);
	}

	@Override
	public void guardarEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
		// TODO Auto-generated method stub
		
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

	

}

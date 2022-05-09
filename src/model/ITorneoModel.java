/* Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 09/05/2022
 * 
 * Descripción: interface del modelo del torneo  
 * 
 * 
 */


package model;

import java.util.Hashtable;

import pojo.Equipo;
import pojo.Jugador;
import pojo.Torneo;

public interface ITorneoModel {
	
	public Torneo crearTorneo(String nombreTorneo, String categoria);
	
	public void guardarEquipo(Hashtable<String, Equipo> lista, Equipo equipo);

	public void eliminarEquipo(Hashtable<String, Equipo> lista, String idEquipo);

	public void actualizarEquipo(Hashtable<String, Equipo> lista, Equipo equipo);

	public Jugador obtenerUnEquipo(Hashtable<String, Equipo> lista, String idEquipo);
	



}

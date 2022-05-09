package service;

import java.util.Hashtable;

import pojo.Equipo;
import pojo.Grafica;
import pojo.Torneo;

public interface ITorneoService {
	
	
	public Torneo crearTorneo();
	
	public void guardarTorneo(Hashtable<String, Equipo> lista, Torneo torneo);

	public void eliminarTorneo(Hashtable<String, Equipo> lista, String idTorneo);

	public void actualizarTorneo(Hashtable<String, Equipo> lista, Torneo torneo);
	
	public void agregarEquipo(Equipo equipo, Torneo torneo);
	
	public String Grafica(Torneo torneo);
	

}

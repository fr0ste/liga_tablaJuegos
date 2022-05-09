package pojo;

import java.util.Hashtable;


public class Torneo {
	private Hashtable<String, Equipo> equipos;
	private String nombreTorneo;
	private String categoria;
	
	public Torneo() {
	}
	
	

	public Torneo(String nombreTorneo, String categoria) {
		
		this.nombreTorneo = nombreTorneo;
		this.categoria = categoria;
		equipos = new  Hashtable<String, Equipo>();
	}



	//getters && setters
	public Hashtable<String, Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipo equipo) {
		this.equipos.put(equipo.getId(), equipo);
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}	

}

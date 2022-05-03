package pojo;

//import java.util.Hashtable;
import java.util.List;

public class Equipo {

	private String nombre; //Llave primaria (id)
	private List<Jugador> jugadores;
	
	public Equipo() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
		
	//getters && setters
	
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public Hashtable<Long, Jugador> getEquipo() {
//		return jugadores;
//	}
//
//	public void setJugador(Jugador jugador) {
//		
//		jugadores.put(jugador.getId(), jugador);
//		
//	}
	
}

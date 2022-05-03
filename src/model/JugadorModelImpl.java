/*
 * Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 
 * 
 * Descripción: 
 * 
 * 
 */


package model;


import pojo.Jugador;

public class JugadorModelImpl implements IJugadorModel{

	@Override
	public Jugador crearJugador() {
		
		
		
		return null;
	}

	
	/*
	@Override
	public Hashtable<int, Jugador> crearJugador(Hashtable<int, Jugador> jugadores, Jugador jugador) {
		jugadores.put(jugador.getId(), jugador);
		return jugadores;
	}

	@Override
	public List<Jugador> eliminarJugador(List<Jugador> lista, long idJugador) {
		int i = 0;
		for (Jugador jugador : lista) {
			if(jugador.getId() == idJugador) {
				lista.remove(i);
				break;
			}
			i++;
		}
		return lista;
	}

	@Override
	public List<Jugador> actualizarJugador(List<Jugador> lista, Jugador jugador) {
		int i = 0;
		for (Jugador j : lista) {
			if(j.getId() == jugador.getId()) {
				lista.set(i, jugador);
				break;
			}
			i++;
		}
		return lista;
	}

	@Override
	public Jugador obtenerUnJugador(List<Jugador> lista, long idJugador) {
		for (Jugador jugador : lista) {
			if(jugador.getId() == idJugador) {
				return jugador;
			}
		}
		return null;
	}

	@Override
	public List<Jugador> obtenerTodosJugador(List<Jugador> lista, Jugador jugador) {
		return lista;
	}
	
	*/
	
}

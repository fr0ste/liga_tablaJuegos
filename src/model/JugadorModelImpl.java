/*
 * Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 
 * 
 * Descripci�n: 
 * 
 * 
 */


package model;


import java.util.List;

import pojo.Jugador;

public class JugadorModelImpl implements IJugadorModel{

	@Override
	public void crearJugador(List<Jugador> lista, Jugador jugador) {
		lista.add(jugador);
	}

	@Override
	public void eliminarJugador(List<Jugador> lista, long idJugador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarJugador(List<Jugador> lista, Jugador jugador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jugador obtenerUnJugador(List<Jugador> lista, long idJugador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jugador> obtenerTodosJugador(List<Jugador> lista, Jugador jugador) {
		// TODO Auto-generated method stub
		return null;
	}
}

	/*@Override
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
	
//}

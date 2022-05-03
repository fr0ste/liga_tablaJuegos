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


package service;

import model.IJugadorModel;
import model.JugadorModelImpl;
import pojo.Jugador;

public class JugadorServiceImpl  implements IJugadorService {
	IJugadorModel model = new JugadorModelImpl();
	
	
	public Jugador crearJugador() {
		
		return model.crearJugador();
	}
	
	/*
	@Override
	

	@Override
	public List<Jugador> eliminarJugador(List<Jugador> lista, long idJugador) {
		return model.eliminarJugador(lista, idJugador);
	}

	@Override
	public List<Jugador> actualizarJugador(List<Jugador> lista, Jugador jugador) {
		return model.actualizarJugador(lista, jugador);
	}

	@Override
	public Jugador obtenerUnJugador(List<Jugador> lista, long idJugador) {
		return model.obtenerUnJugador(lista, idJugador);
	}

	@Override
	public List<Jugador> obtenerTodosJugador(List<Jugador> lista, Jugador jugador) {
		return model.obtenerTodosJugador(lista, jugador);
	}
	*/

}

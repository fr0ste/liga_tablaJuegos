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


package service;

import java.util.List;

import model.IJugadorModel;
import model.JugadorModelImpl;
import pojo.Jugador;

public class JugadorServiceImpl  implements IJugadorService {
	IJugadorModel model = new JugadorModelImpl();

	@Override
	public void crearJugador(List<Jugador> lista, Jugador jugador) {
		model.crearJugador(lista, jugador);
		
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
	/*public Jugador crearJugador() {
		
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

//}

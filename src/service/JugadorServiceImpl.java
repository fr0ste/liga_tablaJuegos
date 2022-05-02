package service;

import java.util.List;

import model.IJugadorModel;
import model.JugadorModelImpl;
import pojo.Jugador;

public class JugadorServiceImpl  implements IJugadorService {
	IJugadorModel model = new JugadorModelImpl();
	@Override
	public List<Jugador> crearJugador(List<Jugador> lista, Jugador jugador) {
		return model.crearJugador(lista, jugador);
	}

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

}

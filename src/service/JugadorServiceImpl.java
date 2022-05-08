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

import java.util.Hashtable;
import java.util.Scanner;

import model.IJugadorModel;
import model.JugadorModelImpl;
import pojo.Jugador;

public class JugadorServiceImpl  implements IJugadorService {
	IJugadorModel model = new JugadorModelImpl();

	@Override
	public void crearJugador(Hashtable<String, Jugador> lista, Jugador jugador) {
		
		model.crearJugador(lista, jugador);
		
		
	}

	@Override
	public Jugador crearJugador(String id) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("ingrese el nombre del jugador");
			String nombre = scan.nextLine();
			System.out.println("ingrese la edad");
			int edad= scan.nextInt();
			scan.nextLine();
			System.out.println("ingrese la direccion");
			String direccion = scan.next();
			System.out.println("ingrese el telefono");
			String telefono = scan.next();
			scan.nextLine();
		
			
			
			return model.crearJugador(id, nombre, edad, direccion, telefono);
		
		
	}

	@Override
	public void eliminarJugador(Hashtable<String, Jugador> lista, String idJugador) {
		lista.remove(idJugador);
		
	}

	@Override
	public void actualizarJugador(Hashtable<String, Jugador> lista, Jugador jugador) {
		lista.replace(jugador.getId(), jugador);
		
	}

	@Override
	public Jugador obtenerUnJugador(Hashtable<String, Jugador> lista, String idJugador) {
		
		return lista.get(idJugador);
	}

	@Override
	public Hashtable<String, Jugador> obtenerTodosJugador(Hashtable<String, Jugador> lista, Jugador jugador) {
		return lista;
	}
	
		
		
		
	
	
	
}
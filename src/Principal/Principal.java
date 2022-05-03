/*
 * Autor:Figueroa Mart�nez Joel Francisco 
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 
 * 
 * Descripci�n: 
 * 
 * 	El programa cuenta con estas opciones:
 *		1.- Dar de alta a un equipo
 *		2.- Crear lista de arbitros
 *		3.- Ver tabla de juegos
 *		4.- Buscar equipo
 *		5.- Actualizar jugador
 *		6.- Eliminar un equipo
 *		
 * 
 * 
 */

package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pojo.Equipo;
import pojo.Jugador;
import service.EquipoServiceImpl;
import service.IEquipoService;
import service.IJugadorService;
import service.JugadorServiceImpl;

//import java.util.Hashtable;

public class Principal {
	private static IJugadorService serviceJugador;
	private static List<Jugador> listaJugador;

	private static IEquipoService serviceEquipo;
	private static List<Equipo> listaEquipo;

	public static void main(String[] args) {
		Jugador j1 = new Jugador();
		j1.setId(1);
		j1.setNombre("Juan");
		j1.setEdad(20);

		Jugador j2 = new Jugador();
		j2.setId(2);
		j2.setNombre("Pedro");
		j2.setEdad(20);

		Jugador j3 = new Jugador();
		j3.setId(3);
		j3.setNombre("Pablo");
		j3.setEdad(20);

		serviceJugador = new JugadorServiceImpl();
		listaJugador = new ArrayList<>();
		
		serviceJugador.crearJugador(listaJugador, j1);
		serviceJugador.crearJugador(listaJugador, j2);
		serviceJugador.crearJugador(listaJugador, j3);

		Equipo e1 = new Equipo();
		e1.setNombre("123");
		e1.setJugadores(listaJugador);
		
		serviceEquipo = new EquipoServiceImpl();
		listaEquipo = new ArrayList<>();
		serviceEquipo.actualizarEquipo(listaEquipo, e1);
		

		do {
			Scanner leerOpcion = new Scanner(System.in);
			int opcion = leerOpcion.nextInt();
			switch (opcion) {
			case 1:
					System.out.println("CREAR EQUIPO");
					Scanner numJugadores = new Scanner(System.in);
					System.out.println("Ingrese el numero de jugadores");
					int cantidadJugador = numJugadores.nextInt();
					for (int i = 0; i < cantidadJugador; i++) {
						
					}
				break;

			case 2:

				break;

			case 3:

				break;

			default:
				break;
			}
		} while (condition);

		// Hashtable<String, String> contenedor = new Hashtable<String, String>();

	}

}

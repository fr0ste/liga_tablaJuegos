package service;

import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

import model.EquipoModelImpl;
import model.IEquipoModel;
import pojo.Equipo;
import pojo.Jugador;

public class EquipoServiceImpl implements IEquipoService {

	IEquipoModel model = new EquipoModelImpl();
	IJugadorService jugadorService = new JugadorServiceImpl();

	@Override
	public Equipo crearEquipo() {
		
		final int maxJugadores =10;
		final int minJugadores =5;
		
		Equipo equipo = new Equipo();
		
		int njugador=0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("ingrese el nombre del equipo");
		String nombre = scan.nextLine();
		equipo = model.crearEquipo(nombre);
		System.out.println("\n\n\n");
		
		
		int opc=0;
		
		System.out.println("¡NECESITA AL MENOS 5 JUGADORES PARA CADA EQUIPO!");
		
		do {
			System.out.println("\t\t\t----JUGADOR " + (njugador+1) + "----");
			Jugador jugador = jugadorService.crearJugador(String.valueOf(njugador));
			equipo.setJugador(jugador);
			
			njugador++;
			
			if(njugador>=minJugadores) {
				System.out.println("¿desea seguir agregando jugadores? 1: si / 2: no");
				opc = scan.nextInt();  
			}
			
		}while(njugador<maxJugadores && opc!=2);
		
		
		return equipo;
	}

	@Override
	public void guardarEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarEquipo(Hashtable<String, Equipo> lista, String idEquipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jugador obtenerUnEquipo(Hashtable<String, Equipo> lista, String idEquipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jugador> obtenerTodosEquipo(Hashtable<String, Equipo> lista, Equipo equipo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

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
		
		Equipo equipo = new Equipo();
		
		int njugador=0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("ingrese el nombre del equipo");
		String nombre = scan.nextLine();
		equipo = model.crearEquipo(nombre);
	
		
		
		int opc=0;
		do {
			
			Jugador juga = jugadorService.crearJugador(String.valueOf(njugador));
			equipo.setJugador(juga);
			
			njugador++;
			
			if(njugador>=2) {
				System.out.println("¿desea continuar? 1: si/2: no");
				opc = scan.nextInt();  
			}
			
		}while(njugador<10 && opc!=2);
		
		
		
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
	
	
	public static void main(String[] args) {
		
		IEquipoService EService = new EquipoServiceImpl();
		
		Equipo e = EService.crearEquipo();
		
		
		System.out.println(e.getNombre());
		
	}
	
	

}

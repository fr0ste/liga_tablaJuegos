
package service;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import model.ITorneoModel;
import model.TorneoModelImpl;
import pojo.Equipo;
import pojo.Grafica;
import pojo.Torneo;

public class TorneoServiceImpl implements ITorneoService{

	@Override
	public Torneo crearTorneo() {
		
		final int maxEquipos = 5;
		final int minEquipos=2;
		int i=0, opc=0;
		ITorneoModel torneo = new TorneoModelImpl();
		IEquipoService EquipoService = new EquipoServiceImpl();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ingrese el nombre del torneo");
		String nombre = scan.nextLine();
		System.out.println("ingrese la categoria del torneo");
		String categoria = scan.nextLine();
		
		Torneo nTorneo = torneo.crearTorneo(nombre, categoria);
		
		System.out.println("¡NECESITA AL MENOS 2 EQUIPOS PARA GENERAR EL TORNEO!");
		
		System.out.println("\n +Ingrese los datos del los equipos");
		do {
			
			System.out.println("\n\t\t----Equipo " +(i+1) +"----");
			nTorneo.setEquipos(EquipoService.crearEquipo());
			i++;
			
			if(i>=minEquipos) {
				System.out.println("¿desea continuar agregando equipos? 1: si / 2: no");
				opc = scan.nextInt();  
			}
			
		}while(i<maxEquipos && opc!=2);
		
		return nTorneo;
	}

	@Override
	public void guardarTorneo(Hashtable<String, Equipo> lista, Torneo tiorneo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarTorneo(Hashtable<String, Equipo> lista, String idTorneo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarTorneo(Hashtable<String, Equipo> lista, Torneo torneo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarEquipo(Equipo equipo, Torneo torneo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String Grafica(Torneo torneo) {
		
		
		// Getting keySets of Hashtable and
        // storing it into Set
        Set<String> setOfKeys = torneo.getEquipos().keySet();
 
        // Creating an Iterator object to
        // iterate over the given Hashtable
        Iterator<String> itr = setOfKeys.iterator();
        String a = itr.next();
        
       int n = (int)(Integer.parseInt(a)-1);
        
		
	return Grafica.getGrafica(n);
		
	}
	
	
	
}

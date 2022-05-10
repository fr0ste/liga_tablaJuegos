/* Autor:Figueroa Martínez Joel Francisco
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 09/05/2022
 * 
 * Descripción: clase con la vista disponible para los equipos  
 * 
 * 
 */


package view;

import java.util.Iterator;
import java.util.Set;

import pojo.Equipo;
import pojo.Torneo;

public class MostrarEquipo {
	
	public static void listarEquipos(Torneo torneo) {
		
		System.out.println("\n\n\t\t-----Nombre del torneo: " +torneo.getNombreTorneo()+"-----");
		
		

		// Getting keySets of Hashtable and
        // storing it into Set
        Set<String> setOfKeys = torneo.getEquipos().keySet();
 
        // Creating an Iterator object to
        // iterate over the given Hashtable
        Iterator<String> itr = setOfKeys.iterator();
        
        
        while(itr.hasNext()) {
        	
        	String a = itr.next();
        	
        	System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        	System.out.println("\t\t EQUIPO: " + a);
        	
        	listarJugadores(torneo.getEquipos().get(a));
        	 
        	
        	
        	
        	System.out.println("\n\n\n");
        	
        	
        }
		
		
		
	/*
		torneo.getEquipos().forEach((key, value)
                ->  System.out.println("--------------\n" + listarJugadores(value) + "+++++++++++++++\n"));		
		*/
		
	}
	
	private static String listarJugadores(Equipo equipo) {
		
		
		equipo.getJugadores().forEach((key, value)
                -> System.out.println(value));
		
		return "";
		
		
	}

}

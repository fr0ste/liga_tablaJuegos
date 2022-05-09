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

import java.util.*;   


//import java.util.Hashtable;

public class Principal {

	 // Main driver method
	 public static void main(String[] args)
	    {
	 
	        // Creating Hashtable object in where key is of
	        // Integer type
	        // and value is of String type
	        Hashtable<String, String> ht = new Hashtable<>();
	 
	        // Putting key-value pairs to HashTable object
	        // Custom input entries
	        ht.put("1", "Java");
	        ht.put("2", "Scala");
	        ht.put("3", "Python");
	        ht.put("4", "Ruby");
	        ht.put("5", "R");
	 
	   
	        
	        // Iterating through Hashtable using
	        // forEach loop of java 8
	        ht.forEach((key, value)
	                       -> System.out.println(
	                           "Rank : " + key
	                           + "\t\t Name : " + value));
	    }


}

/*
 * Autor:Figueroa Martï¿½nez Joel Francisco  
 * 
 * Fecha de creaciï¿½n: 02/05/2022
 * Fecha de modificaciï¿½n: 
 * 
 * Descripciï¿½n: 
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

package view;

import java.util.Scanner;

import pojo.Torneo;
import service.ITorneoService;
import service.TorneoServiceImpl;

//import java.util.Hashtable;

public class Principal {

public static void main(String[] args) {
		
	
		ITorneoService torneoService = new TorneoServiceImpl();
		int opc =0;
		int opc2 =0;
		boolean salir = false;
		boolean salir2 = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**************GESTIÓN DE TORNEOS******************");
		System.out.println("PARA CONTINUAR DEBE INGRESAR LOS DATOS DEL TORNEO\n\n");
		Torneo torneo = torneoService.crearTorneo();
		System.out.println("\n\t\t---TORNEO: " + torneo.getNombreTorneo() + "---");
	
		
		
		do {
			
			System.out.println("\t\t¿DESEA?...");
			System.out.println("1.- gestionar toneo");
			System.out.println("2.- generar grafico del torneo");
			System.out.println("3.- cerrar programa");
			opc = scan.nextInt();
			
			switch(opc) {
			
			case 1:
				
				do {
				
				System.out.println("\t\t¿DESEA?...");
				System.out.println("1.- actualizar un equipo");
				System.out.println("2.- agregar un equipo");
				System.out.println("3.- eliminar torneo");
				System.out.println("4.- regresar");
				opc2 = scan.nextInt();
				
					switch(opc2) {
					
					
					case 1:
						
						torneoService.actualizarTorneo(torneo.getEquipos(), torneo);
						break;

					case 2:
						
						System.out.println(torneoService.Grafica(torneo));
						break;

					case 3:
						break;

					case 4:
						salir2 = true;
						break;

					default:
						System.out.println("opcion no valida");
					
					}//fin switch 2
				
				
				}while(!salir2);
				
				
				
				
				break;
				
			case 2:
				
				System.out.println(torneoService.Grafica(torneo));
				
				break;
			case 3:
				salir=true;
				break;
			default:
				System.out.println("opcion no valida");
			
				}	
			
			
			
		}while(!salir);
		
		
		
		scan.close();
		System.out.println("\t\t--FIN DEL PROGRAMA--");
		
	}


}

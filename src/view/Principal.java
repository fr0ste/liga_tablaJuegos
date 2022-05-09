/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 09/05/2022
 * 
 * Descripci�n:
 * 	El programa cuenta con estas opciones:
 *		1.- crear torneos donde es necesario un minimo de 
 *			dos equipos, en la cual cada equipo necisita un minimo
 *			de 5 jugadores y un maximo de 10.
 *			El maximo de equipos es 5.
 *		2.- Dar de alta a un equipo
 *		3.- Ver tabla de juegos
 *		4.- listar todos los equipos
 *			con sus respectivos jugadores.
 *		
 *  
 * 
 * 
 */

package view;

import java.util.Scanner;

import pojo.Torneo;
import service.ITorneoService;
import service.TorneoServiceImpl;

public class Principal {

	public static void main(String[] args) {

		ITorneoService torneoService = new TorneoServiceImpl();
		int opc = 0;
		int opc2 = 0;
		boolean salir = false;
		boolean salir2 = false;
		Scanner scan = new Scanner(System.in);

		System.out.println("\t\t\t\t\t**************GESTI�N DE TORNEOS******************");
		System.out.println("\nPARA CONTINUAR DEBE INGRESAR LOS DATOS DEL TORNEO\n\n");
		Torneo torneo = torneoService.crearTorneo();
		System.out.println("\n\t\t---TORNEO: " + torneo.getNombreTorneo() + "---");

		do {

			System.out.println("\t\t�DESEA?...");
			System.out.println("1.-gestionar torneo");
			System.out.println("2.- generar grafico del torneo");
			System.out.println("3.- cerrar programa");
			opc = scan.nextInt();

			switch (opc) {

			case 1:

				do {

					System.out.println("\t\t�DESEA?...");
					System.out.println("1.- agregar un equipo");
					System.out.println("2.- listar todos los equipos del torneo");
					System.out.println("3.- regresar");
					opc2 = scan.nextInt();

					switch (opc2) {

					case 1:
						
						torneoService.agregarEquipo(torneo);
						
						break;

					case 2:
						
						MostrarEquipo.listarEquipos(torneo);
						
						break;

					case 3:
						salir2 = true;
						
						break;

					default:
						System.out.println("opcion no valida");

					}// fin switch 2

				} while (!salir2);

				break;

			case 2:

				torneoService.Grafica(torneo);

				break;
			case 3:
				salir = true;
				break;
			default:
				System.out.println("opcion no valida");

			}

		} while (!salir);

		scan.close();
		System.out.println("\t\t--FIN DEL PROGRAMA--");

	}

}

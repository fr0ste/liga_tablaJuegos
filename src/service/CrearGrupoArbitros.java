package service;

import java.util.ArrayList;

import java.util.Scanner;

import model.*;
import pojo.Arbitro;

public class CrearGrupoArbitros {
	public static ArrayList<Arbitro> lista = new ArrayList<Arbitro>();
	// Método que devuelve un lista

	public ArrayList<Arbitro> LeerArbitro(int Max) {

		String nombre;
		String domicilio;
		String telefono;
		int edad;
		String cedula;
		int j;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < Max; i++) {

			j = i + 1;

			Arbitro aux = new Arbitro();

			System.out.println("ingrese el nombre del arbitro " + j);
			nombre = entrada.nextLine();
			System.out.println("ingrese el domicilio del arbitro " + j);
			domicilio = entrada.nextLine();
			System.out.println("ingrese el telefono del arbitro " + j);
			telefono = entrada.nextLine();
			System.out.println("ingrese la edad del arbitro " + j);
			edad = entrada.nextInt();
			entrada.nextLine();
			System.out.println("ingrese la cedula del arbitro " + j);
			cedula = entrada.nextLine();

			aux.setNombre(nombre);
			aux.setEdad(edad);
			aux.setDireccion(domicilio);
			aux.setTelefono(telefono);
			aux.setCedula(cedula);

			lista.add(aux);

		}

		return lista;
	}
}

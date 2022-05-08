/*
 * Autor:Figueroa Martínez Joel Francisco 
 * 
 * Fecha de creación: 02/05/2022
 * Fecha de modificación: 
 * 
 * Descripción: 
 * 
 * 
 */



package pojo;

public class Jugador extends Persona {
	private String id; //primary key
	
	public Jugador() {
		
	}
	
	public Jugador(String id, String nombre, int edad, String direccion, String telefono) {
		
		this.id=id;
		this.setDireccion(direccion);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setTelefono(telefono);
		
		
	}

	public String getId() {
		return id;
	}

	public String setId(String id) {
		return this.id = id;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getDireccion()="
				+ getDireccion() + ", getTelefono()=" + getTelefono() + "]";
	}
	
	
	
	
	
}

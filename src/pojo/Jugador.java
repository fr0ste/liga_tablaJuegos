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
	private long id; //primary key
	
	public Jugador() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}

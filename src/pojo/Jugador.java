/*
 * Autor:Figueroa Mart�nez Joel Francisco 
 * 
 * Fecha de creaci�n: 02/05/2022
 * Fecha de modificaci�n: 
 * 
 * Descripci�n: 
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

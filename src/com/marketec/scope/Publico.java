package com.marketec.scope;

public class Publico {

	public int id;
	public String nombre;
	public String apellido;
	
	public void metodoA() {
		this.metodoB();
		System.out.println("Método Público");
	}
	
	
	private void metodoB() {
		System.out.println("Método Privado");
	}
	
	
}

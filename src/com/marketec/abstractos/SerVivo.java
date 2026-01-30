package com.marketec.abstractos;

public abstract class SerVivo {

	private String nombre;
	
	public abstract void alimentar();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void respirar() {
		System.out.println("Respirando . . .");
	}
	
}

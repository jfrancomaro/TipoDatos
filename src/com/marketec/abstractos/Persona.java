package com.marketec.abstractos;

public class Persona extends SerVivo implements ISerVivo{

	private String nombre;

	private int edad;
		
	@Override
	public void alimentar() {
		System.out.println("Persona aliment�ndose");
	}

	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormirse() {
		// TODO Auto-generated method stub
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

package com.marketec.scope;

public class Privada {

	private int id;
	private String nombre;
	private String apellido;
		
	private void metodoA() {
		System.out.println("hola");
	}
	
	private double metodoB() {
		String x = "hola";
		double rpta = 0;
		if(x.equalsIgnoreCase("HOLA")) {
			rpta = 1.0;
		}else { 
			rpta = 2.0;
		}
		return rpta;
	}
			
	private double metodoB(double numero) {
		return this.metodoB() + numero;
	}

	private double metodoC() {
		return this.metodoB()+ metodoB(2);
	}
	
	public static void main(String[] args) {
		Privada app = new Privada();
		app.apellido = "Code";
		System.out.println(app.apellido);
	}
	
}

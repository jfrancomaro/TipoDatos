package com.marketec.fabrica;

public class App {

	public static void main(String[] args) {
		
		BaseDatosFactory fabrica = new BaseDatosFactory();
		BaseDatos bd = fabrica.getBaseDatos("MySQL");
		bd.conectarse();
		
		
	}

}

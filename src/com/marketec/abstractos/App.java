package com.marketec.abstractos;

public class App {

	public static void main(String[] args) {
		
		IVehiculo vehi = new Auto();
		System.out.println(vehi.mostrarMarca());
		
		vehi = new Bus();
		System.out.println(vehi.mostrarMarca());
		
		vehi = new Moto();
		System.out.println(vehi.mostrarMarca());
		
		
	}
	
}

package com.marketec.abstractos;

public class Bus implements IVehiculo{

	@Override
	public String mostrarMarca() {
		return "BMV";
	}

	@Override
	public double mostrarPrecio() {
		return 150000.00;
	}

}

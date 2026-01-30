package com.marketec.fabrica;

public class BaseDatosFactory {

	public BaseDatos getBaseDatos(String tipo) {

		if (tipo == null) {
			return null;
		}

		if (tipo.equalsIgnoreCase("MySQL")) {
			return new MySQL();
		} else if (tipo.equalsIgnoreCase("SQLServer")) {
			return new SQLServer();
		} else if (tipo.equalsIgnoreCase("Oracle")) {
			return new Oracle();
		} else if (tipo.equalsIgnoreCase("PostgreSQL")) {
			return new PostgreSQL();
		}
		return null;
	
	}

}

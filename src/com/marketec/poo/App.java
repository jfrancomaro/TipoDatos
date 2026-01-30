package com.marketec.poo;

public class App {

	public static void main(String[] args) {

		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setUsuario("Franco");
		usu.setClave("admin");

		Encriptacion enc = new Encriptacion();
		enc.setNivel(3);
		enc.setNombre("Franquito");

		Login login = new Login();
		login.registrar(usu, enc);

	}

}

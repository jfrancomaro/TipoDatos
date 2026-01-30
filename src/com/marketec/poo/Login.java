package com.marketec.poo;

import javax.swing.JOptionPane;

public class Login {

	// Crear un mecanismo para registrar un usuario
	// Estos deberán registrar un nombre de usuario(16) y clave (10)
	// La clave será encriptada mediante el método del cesar de nivel indicado por
	// el usuario
	// Utilizar POO en todo momento

	public void registrar(Usuario usuario, Encriptacion enc) {

		String claveEncriptada = this.encriptar(usuario,enc);
		usuario.setClave(claveEncriptada);
		JOptionPane.showMessageDialog(null, usuario.getUsuario() + " - " + usuario.getClave());

	}

	public String encriptar(Usuario usuario, Encriptacion enc) {
		String claveEncriptada = enc.ejecutarCesar(usuario);
		return claveEncriptada;
	}

}


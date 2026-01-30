package com.marketec.colecciones;

import java.util.Set;
import java.util.TreeSet;

public class SetApp {
	private Set<Persona> lista;

	public SetApp() {
		lista = new TreeSet<Persona>(new ComparadorNombres());
	}

	public void llenar() {
		lista.add(new Persona(1, "Jaime", 26));
		lista.add(new Persona(2, "Mito", 26));
		lista.add(new Persona(1, "Jaime", 26));		
		lista.add(new Persona(4, "MitoCode", 28));
		lista.add(new Persona(3, "Code", 27));
		
	}

	public void imprimir() {
		// lista.forEach(System.out::println);
		for (Persona elemento : lista) {
			System.out.println(elemento.getNombre() + " - " + elemento.getEdad() + " - " + elemento.getCodigo());
		}
	}

	public static void main(String[] args) {
		SetApp app = new SetApp();
		app.llenar();
		app.imprimir();
	}
}

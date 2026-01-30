package com.marketec.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Coleccion {

	private List<Integer> lista = new LinkedList<>();
	
	public Coleccion() {
		lista = new ArrayList<>();
	}

	public void desordenar() {
		Collections.shuffle(lista);
	}
	
	public void invertir() {
		
		Collections.reverse(lista);
		
	}
	
	public void imprimir() {
		
		lista.forEach(System.out::println);
		
	}
	
	public void llenar() {
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
	}
	
	public static void main(String[] args) {
			
			Coleccion c = new Coleccion();
			c.llenar();
			c.imprimir();
			System.out.println("--------------");
			c.desordenar();
			c.imprimir();
			System.out.println("--------------");
			c.invertir();
			c.imprimir();
	}
	
}

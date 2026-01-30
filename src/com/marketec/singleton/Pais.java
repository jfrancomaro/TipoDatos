package com.marketec.singleton;

import java.util.ArrayList;
import java.util.List;

public class Pais {

	private static Pais instancia = null;
	private static List<String> lista;
	
	public static Pais getInstance() {
		if(instancia == null) {
			instancia = new Pais();
			System.out.println("Se ha creado una instancia");
			lista = new ArrayList<>();
			listar();
			imprimir();
		}
		return instancia;
	}
	
	private Pais() {
	
	}
	
	public static void listar() {
		
		lista.add("Peru");
		lista.add("Mexico");
		lista.add("Venezuela");
		
	}
	
	public static void imprimir() {
		lista.forEach(System.out::println);
	}
	
	
}

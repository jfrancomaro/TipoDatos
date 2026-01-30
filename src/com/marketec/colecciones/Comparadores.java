package com.marketec.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Comparadores {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1, "Jaime", 28));
		lista.add(new Persona(2, "Code", 27));
		lista.add(new Persona(3, "Mito", 26));

		// Collections.sort(lista, new ComparadorEdad());
		// Collections.sort(lista, new ComparadorNombres());

		/*
		 * Collections.sort(lista, new Comparator<Persona>() {
		 * 
		 * @Override public int compare(Persona o1, Persona o2) { return o2.getEdad() -
		 * o1.getEdad(); } });
		 * 
		 */

		// lista.forEach(x -> System.out.println(x.getEdad()));

		lista.stream().sorted((x, y) -> x.getNombre().compareTo(y.getNombre()))
				.forEach(x -> System.out.println(x.getNombre()));

		List<Persona> otraLista = lista.stream().sorted((x, y) -> x.getNombre().compareTo(y.getNombre()))
				.collect(Collectors.toList());

		otraLista.forEach(x -> System.out.println(x.getNombre()));

		// lista.forEach(x -> System.out.println(x.getNombre()));

	}

}

package com.marketec.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EliminarElemento {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1, "Code", 26));
		lista.add(new Persona(2, "Code", 21));
		lista.add(new Persona(3, "Code", 22));
		lista.add(new Persona(4, "Code", 23));

		/*for (Persona per : lista) {
			lista.remove(2);
		}*/

		int contador = 0;
		Iterator<Persona> it = lista.iterator();
		while (it.hasNext()) {
			it.next();// esto falto , el metodo next es necesario para ejecutar el remove()
			if (contador == 2) {
				it.remove();
			}
			contador++;
		}
				
		lista.forEach(s -> System.out.println(s.getCodigo()));
	}
}

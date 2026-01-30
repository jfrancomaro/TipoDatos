package com.marketec.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArregloLista {

	public static void main(String[] args) {
		
		String[] arreglo = new String[3];
		arreglo[0] = "Mito";
		arreglo[1] = "MitoCode";
		arreglo[2] = "Mito";
		
		
		// List<String> lista = Arrays.asList(arreglo);
		// lista.add("ga"); //inmutable
		
		// lista.forEach(x -> System.out.println(x));
		
		List<String> otraLista = new ArrayList<String>(Arrays.asList(arreglo));
		otraLista.add("Franco");//mutable
		
		otraLista.forEach(System.out::println);
		
		
	}
	
	
}

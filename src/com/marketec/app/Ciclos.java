package com.marketec.app;

import java.util.ArrayList;
import java.util.Iterator;

public class Ciclos {

	public static void main(String[] args) {
		
		String[] arreglo = {"mito","code"};
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("mito");
		lista.add("code");
		
		//1.5
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//1.6
		
		for(int i = 0 ; i < arreglo.length ; i++) {
			System.out.println(arreglo[i]);
		}
		
		//1.7
		
		for(Object x : arreglo) {
			System.out.println(x);
		}
		
		//1.8
		
		lista.forEach(x -> System.out.println(x));
		lista.stream().forEach(System.out::println);
		
	}

}

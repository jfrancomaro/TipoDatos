package com.marketec.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaApp {

	public static void main(String[] args) {
		List<Integer> lista_1 = new ArrayList<>(20);
		
		// |1|2|3|4|5|6|7|8|9|10|
		// add. -- garbage collector
		// new ArrayList capacidad de 11
		// |1|2|3|4|5|6|7|8|9|10|11| -- garbage collector
		// new ArrayList capacidad de 12
		// |1|2|3|4|5|6|7|8|9|10|11|12|
		
		
		// |1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|
		// new ArrayList capacidad de 21
		// |1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|
		
		List<Integer> lista_2 = new LinkedList<>();
 		
		long ini = System.currentTimeMillis();		
		for(int i = 0; i< 1000000 ;i++){
			lista_1.add(i);
		}
		long fin = System.currentTimeMillis();

		System.out.println("ArrayList: " + (fin - ini));
		
		ini = System.currentTimeMillis();
		for(int i = 0; i< 1000000 ;i++){
			lista_2.add(i);
			//lista_2.get(index)
		}
		fin = System.currentTimeMillis();
		System.out.println("LinkedList: " + (fin - ini));
		
		
	}
}

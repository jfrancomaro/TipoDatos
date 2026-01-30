package com.marketec.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArratvsSet {

	public static void main(String[] args) {
		
		List<String> listArray = new ArrayList<>();
		Set<String> setHash = new TreeSet<>();
		
		listArray.add("MitoCode");
		listArray.add("MitoCode");
		listArray.add("Code");
		
		listArray.forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		setHash.add("MitoCode");
		setHash.add("MitoCode");
		setHash.add("Code");
		setHash.add("Mito");
		setHash.add("AAA");
		setHash.add("Franco");
		
		setHash.forEach(System.out::println);
		
	}
	
}

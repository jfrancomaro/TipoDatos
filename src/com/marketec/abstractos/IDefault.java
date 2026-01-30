package com.marketec.abstractos;

//@FunctionalInterface
public interface IDefault {	
	
	void mostrar();
	void saludar();
		
	default void calcular(){
		System.out.println("logica");
	}
	
	default void calcular(String nombre){
		System.out.println("logica");
	}
}

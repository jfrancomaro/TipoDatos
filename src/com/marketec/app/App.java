package com.marketec.app;

public class App {

	public static void main(String[] args) {

		//Tipos de Datos
		int num1; // Declaracion
		num1 = 0; // Inicializaci�n
		
		System.out.println(num1+1); // Utilizaci�n
		
		/////////////////
		
		//byte byte1 = 127;
		//short short1 = -32768;

		//Integer a = new Integer(1);
		
		//double PI = 3.1416;
		int LIMITE_EDAD = 18;
		
		if(LIMITE_EDAD > 15) {
			System.out.println("Es mayor");
		}
		
		int x = Integer.parseInt("19");
		System.out.println(x+1);
		//double y = Double.parseDouble("26.2");
		
	}
	
}

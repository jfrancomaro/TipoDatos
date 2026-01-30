package com.marketec.app;

import java.util.Scanner;

public class Cifrado {

	// Cifrado del Cesar
	
	public static void main(String[] args) {
		final String[] ABC = { "A" ,"B","C","D","E","F","G","H","I","J","K","L","M",
				"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

		StringBuilder sb = new StringBuilder();
		
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("Ingrese cadena a cifrar: ");
	    String texto = teclado.next();
		
	    System.out.println("Ingrese el nivel de cifrado");
	    int nivel = teclado.nextInt();
	    
	    for (int i = 0; i < texto.length(); i++) {
			char elemento = texto.charAt(i);
			for (int j = 0; j < ABC.length; j++) {
				if(String.valueOf(elemento).equalsIgnoreCase(ABC[j])) {
					int posicion = nivel + j;
					if(posicion >= ABC.length) {
						int x = posicion - ABC.length;
						String cifrado = ABC[x];
						sb.append(ABC[x]);
						System.out.println(sb.toString());
						System.out.println(cifrado);
					} else  {
						String cifrado= ABC[posicion];
						sb.append(ABC[posicion]);
						System.out.println(cifrado);
						System.out.println(sb.toString());
						break;
					}
					
				}
			}
			
		}
	    
	    teclado.close();
	    
		}
	
}

package com.marketec.app;

public class Bucles {

	public static void main(String[] args) {

		franco:
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				System.out.println(i+j);
				if (j == 1) {
					break franco;
				}
			}
			
		}
		
	}

}

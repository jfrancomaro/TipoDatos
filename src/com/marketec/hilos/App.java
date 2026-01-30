package com.marketec.hilos;

public class App {

	public static void main(String[] args) {
		
		Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2();
		Thread h3 = new Thread(new Hilo3());
		//h1.run();
		//h2.run();
		 
		Thread h4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hilo 4 - Runnable");
			}
		});
		
		Thread h5 = new Thread(() -> System.out.println("Hilo 5 - Runnable Lambda"));
		
		
		h1.start();
		h2.start();
		h3.start();
		try {
			h3.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h4.start();
		h5.start();
		System.out.println("Hilo Main");
	}
	
}

package com.marketec.hilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PoolHilos {

	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(3);
		Future<Double> tarea1 = pool.submit(new Operacion());
		Thread th1 = new Thread(() -> System.out.println("Proceso alterno1"));
		Future<?> tarea2 = pool.submit(new Hilo3());
		th1.start();

		while (!tarea1.isDone()) {
			System.out.println("Aún estoy procesando, sigue haciendo lo tuyo");
		}

		try {
			System.out.println(tarea1.get());
			System.out.println(tarea2.get());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
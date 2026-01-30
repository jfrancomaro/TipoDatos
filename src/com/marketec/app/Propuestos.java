package com.marketec.app;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Propuestos {

	public void pregunta1() {

		int numero = 1;

		if (numero >= 0) {
			System.out.println("Es Positivo");
		} else {
			System.out.println("Es Negativo");
		}

		String respuesta = numero >= 0 ? "Es Positivo!" : (numero == 1 ? "Es uno" : "Diferente de 1");
		System.out.println(respuesta);
	}

	public void pregunta2() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número para saber si es par o impar: ");
		int numero = scanner.nextInt();
		String respuesta = numero % 2 == 0 ? "Es par" : "Es impar";
		System.out.println(respuesta);
		scanner.close();
	}

	public void pregunta3() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer número entero: ");
		int n1 = teclado.nextInt();
		System.out.println("Ingrese el segundo número entero: ");
		int n2 = teclado.nextInt();
		System.out.println("Ingrese el tercer número entero: ");
		int n3 = teclado.nextInt();
		if (n1 > n2 && n1 > n3)
			System.out.println(n1 + " es el mayor número");
		else if (n2 > n3)
			System.out.println(n2 + " es el mayor número");
		else
			System.out.println(n3 + "es el mayor numero");
		teclado.close();
	}

	public void pregunta4() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String cadena = teclado.nextLine();
		int inicio = 0;
		int fin = cadena.length() - 1;
		boolean a = false;
		// Manera1
		while (inicio < fin && !a) {
			if (cadena.charAt(inicio) == cadena.charAt(fin)) {
				inicio++;
				fin--;
			} else {
				a = true;
			}
		}
		if (!a)
			System.out.println("es palindromo");
		else
			System.out.println("no es");
		// Manera2
		StringBuilder sb = new StringBuilder(cadena);
		String reversa = sb.reverse().toString();

		String respuesta = cadena.equalsIgnoreCase(reversa) ? "Es palindromo" : "No es Palíndromo";
		System.out.println(respuesta);

		teclado.close();

	}

	public void pregunta5() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un mensaje");
		String mensaje = teclado.nextLine();

		Random random = new Random();
		int num1 = random.nextInt(9);
		int num2 = random.nextInt(9);
		mensaje = mensaje.replace(String.valueOf(mensaje.charAt(0)), String.valueOf(num1));
		mensaje = mensaje.replace(String.valueOf(mensaje.charAt(mensaje.length() - 1)), String.valueOf(num2));
		mensaje = mensaje.replaceAll("\\s", "");
		System.out.println(mensaje);
		teclado.close();

	}

	public void pregunta6() {

		double accion3 = 0.0, monto = 0.0;
		final double MAX = 500.00;
		final double MONEDA_SOLES = 3.368;
		final double MONEDA_PESOS = 21;
		// Manera 1
		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.println("¿Cuál es su nombre?: "); String nombre =
		 * teclado.nextLine(); System.out.println("¿Qué moneda posee? ");
		 * System.out.println("1. Soles"); System.out.println("2. Pesos"); int
		 * accion = teclado.nextInt(); switch(accion) { case 1:
		 * System.out.println("Ingrese monto en soles:"); accion3 = teclado.nextInt();
		 * accion3final = accion3/MONEDA_SOLES; break; case 2:
		 * System.out.println("Ingrese monto en pesos:"); accion3 = teclado.nextInt();
		 * accion3final = accion3/MONEDA_PESOS; break; default: break; }
		 * System.out.println("Estimando "+nombre+" su monto en dólares es: "
		 * +accion3final);
		 */
		// Manera 2
		String nombre = JOptionPane.showInputDialog("¿Cuál es su nombre?");
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

		String accion = JOptionPane.showInputDialog("¿Qué moneda posee? \n 1. Soles \n 2. Pesos");
		JOptionPane.showMessageDialog(null, "Divisa Seleccionada " + accion);

		String accion31 = "";

		DecimalFormat df = new DecimalFormat("#.000");

		switch (accion) {
		case "1":
			accion31 = JOptionPane.showInputDialog("¿Qué cantidad desea cambiar? ");
			accion3 = Double.parseDouble(accion31);
			if (accion3 > 0) {
				monto = accion3 / MONEDA_SOLES;
				if (monto < MAX) {
					JOptionPane.showMessageDialog(null, "El monto en dólares es: " + df.format(monto));
				} else {
					JOptionPane.showMessageDialog(null, "Has excedido el límite permitido");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Ingrese una cantidad correcta");
			}
			break;
		case "2":
			accion31 = JOptionPane.showInputDialog("¿Qué cantidad desea cambiar? ");
			accion3 = Double.parseDouble(accion31);
			if (accion3 > 0) {
				monto = accion3 / MONEDA_PESOS;
				if (monto < MAX) {
					JOptionPane.showMessageDialog(null, "El monto en dólares es: " + df.format(monto));
				} else {
					JOptionPane.showMessageDialog(null, "Has excedido el límite permitido");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Ingrese una cantidad correcta");
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "Divisa no válida ");
			break;
		}

	}

	public void pregunta7() {

		int cantidad = 50;

		String nombre = JOptionPane.showInputDialog("Ingrese el usuario: ");
		String clave = JOptionPane.showInputDialog("Ingrese su clave: ");
		if (nombre.equalsIgnoreCase("user") && clave.equalsIgnoreCase("123")) {
			JOptionPane.showMessageDialog(null, "Bienvenido nuevamente \nExistencias del producto: " + cantidad);
			String accion = JOptionPane.showInputDialog("1. Comprar Producto \n2. Devolver Producto");
			JOptionPane.showMessageDialog(null, "Acción Seleccionada " + accion);

			String accion2 = "";
			int accion3 = 0, monto = 0;
			
			switch (accion) {
			case "1":
				accion2 = JOptionPane.showInputDialog("¿Cuánto desea comprar? ");
				accion3 = Integer.parseInt(accion2);
				if (accion3 > 0 && accion3 < cantidad) {
					monto = cantidad - accion3;
					JOptionPane.showMessageDialog(null, "La cantidad de existencias es: " + monto);
				} else {
					JOptionPane.showMessageDialog(null, "Ingrese una cantidad correcta");
				}
				break;
			case "2":
				accion2 = JOptionPane.showInputDialog("¿Cuánto desea devolver? ");
				accion3 = Integer.parseInt(accion2);
				if (accion3 > 0 && accion3 <= 5 && accion3 < cantidad) {
					monto = cantidad + accion3;
					JOptionPane.showMessageDialog(null, "La cantidad de existencias es: " + monto);
				} else {
					JOptionPane.showMessageDialog(null, "Ingrese una cantidad correcta");
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida ");
				break;
			}

		} else {
			JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
			System.exit(0);
		}

	}

	public static void main(String[] args) {

		Propuestos p = new Propuestos();
		// p.pregunta1();
		// p.pregunta2();
		// p.pregunta3();
		// p.pregunta4();
		// p.pregunta5();
		// p.pregunta6();
		p.pregunta7();
	}

}

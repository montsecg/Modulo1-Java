package pruebas;

import java.util.Scanner;

public class EjerciciosBucles {

	public static void main(String[] args) {
		
		//EJERCICIO 1 
		/*
		Scanner usuario = new Scanner(System.in);
		System.out.println("escribe el nombre de la capital de un país donde quieras viajar");
		String capital = usuario.nextLine();
		System.out.println("has elegido... " + capital);
		
		for (int i = 0; i < capital.length(); i ++) {
			System.out.println("Voy por la vuelta..." + i);
		} */
		
		// EJERCICIO 2
		/* EJEMPLO CARLOS
		Scanner usuario = new Scanner(System.in);
		System.out.println("Dime un número entero");
		int respuesta = usuario.nextInt();
		
		int contador = 1;
		while (contador < respuesta) {
			System.out.println("Voy por el número..." + (contador++));
			} */
		
		// EJEMPLO EVA
		/*
		Scanner usuario = new Scanner(System.in);
		System.out.println("Dime un número entero");
		int respuesta = usuario.nextInt();
		
		int contador = 0;
		while (contador < (respuesta - 1)) {
			System.out.println("Voy por el número..." + (contador+1));
			contador++;
			} */
		
		//EJERCICIO 3 - BUCLE FOR
		/*
		Scanner usuario = new Scanner(System.in);
		System.out.println("Dime un número entero");
		int respuesta = usuario.nextInt();
		
		for (int i = 1; i < respuesta; i++) {
			System.out.println("voy por el número..." + i);
		} */
		
		// EJERCICIO 4 (FELIZ CUMPLEAÑOS)
		/*
		int edad;
		int i;
		
		System.out.println("Escribe tu edad");
		Scanner newEdad = new Scanner(System.in);
		edad = newEdad.nextInt();
		
		for (i = 1; i < edad; i++) {
			System.out.println("Feliz cumpleaños, nº vuelta... " + i);
					} */
		
		// EJERCICIO 5 (10 AL 20 CON LÍNEA). 
		
		for (int i = 10; i < 21; i++) {
			System.out.println(i);
			System.out.println();
		}
	}
}

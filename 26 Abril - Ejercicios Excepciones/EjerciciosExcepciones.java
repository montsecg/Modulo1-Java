package Abril26;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosExcepciones {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		
	// EJERCICIO 1 - DAVID 
	/*	
		start();
	}
	
	public static void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("A que continente quieres viajar?");
		System.out.println("\n1. Europa");
		System.out.println("\n2. América del Norte");
		System.out.println("\n3. América del Sur");
		System.out.println("\n4. Africa");
		
		int num = 0;
		try {
			num = scan.nextInt();
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("No has puesto un continente correctamente utiliza 1,2,3,4");
			start();
		}

		switch (num) {
		case 1:
			System.out.println("la ciudad más grande es Estambúl con 15.519.267 habitantes");
			break;
		case 2:
			System.out.println("la ciudad más grande es México con 8 851 080 habitantes");
			break;
		case 3:
			System.out.println("la ciudad más grande es Brasil, 21,7 millones");
			break;
		case 4:
			System.out.println("la ciudad más grande es Nigeria (24 millones)");
			break;
		default:
			System.out.println("Opción no válida");
			start();
		}
 */ 

	// EJERCICIO 2 - POL
/* 
		start();
	}

	private static void start() {
		
		int sumatorio;
		
		ArrayList<Integer> lista = new ArrayList<>();

		Scanner pregunta = new Scanner(System.in);
		System.out.println("Dame tres valores ");
		
		try {
			int respuesta = pregunta.nextInt();
			int respuesta2 = pregunta.nextInt();
			int respuesta3 = pregunta.nextInt();

			lista.add(respuesta);
			lista.add(respuesta2);
			lista.add(respuesta3);

			sumatorio = (respuesta + respuesta2 + respuesta3);

			System.out.println("Te confimro que lo has hecho bien, has introducido: " + lista.size());
			System.out.println("Esta es la lista de números " + lista.toString());

			System.out.println("La suma de los tres numeros que me has dado es: " + sumatorio);

		} catch (Exception e) {
			System.out.println("No es tan dificil, solo pido 3 numeros, vuelve a intentaro fenómeno.");
			start();

		} finally {
			System.out.println("No se para que sirve esto, pero aquí lo lees, Craaaaack!");
		}
*/
	}

}

package Abril26;

import java.util.Scanner;

public class Main {
// EJERCICIO 3

	public static void main(String[] args) {
		start();
	}

	private static void start() {

		try {
			Scanner pregunta = new Scanner(System.in);
			System.out.println("Dime 10, 8 o 2");
			int num = pregunta.nextInt();

			if (num == 10) throw new MiExcepcion(1);
			else if (num == 8) throw new MiExcepcion(2);
			else if (num == 2) throw new MiExcepcion(3);
			else start();

		} catch (MiExcepcion ex) {
			System.out.println(ex.getMessage());
			start();
		} catch (Exception e) {
			System.out.println("ya te vale Pol con PHP");
		}
	}

}

package Abril25.NumeroAleatorio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		start();}

	public static void start() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Quiere empezar el juego? Diga sí o no");
		String respuesta = scanner.nextLine();
		respuesta = respuesta.toLowerCase();
		if (respuesta.equals("sí") || respuesta.equals("si")) init();
		else System.out.println("gracias por todo. Adiós");
	}
	
	public static void init() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Prueba suerte, adivine el número");
		try {
			int number = scanner.nextInt();
			//CREAMOS UN OBJETO NUMBER, CON UN CONSTRUCTOR CON UN PARÁMETRO. EL PARÁMETRO ES EL Nº QUE EL USUARIO NOS DA
			Number numero = new Number(number);
			numero.setRandomNumber();
			numero.randomVerified();
			do {
				System.out.println("Prueba suerte de nuevo");
					try {
						number = scanner.nextInt();
						numero.setNumber(number);
						numero.randomVerified();
						numero.printVerification();
					} catch (InputMismatchException e) {
						System.out.println(e.getMessage());
						start();
						break;
					}
			} while(numero.isNotNull());
		} catch(InputMismatchException e) {
			start();
			System.out.println(e.getMessage());
			
		}
	}
	}

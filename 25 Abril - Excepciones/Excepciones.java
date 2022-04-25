package Abril25;

import java.io.IOException;
import java.util.Scanner;

public class Excepciones {
	
	public static void main(String[] args) {
		// IndexOutOfBounds exception -> ejemplo
		//int[] myNumbers = {1, 2, 3};
		//System.out.println(myNumbers[10]);
		
		// ArithmeticException;
		//int result = 5/0;
		
		
		//¿CÓMO GESTIONAR ESTAS EXCEPCIONES?
		// MEDIANTE LA FÓRMULA DEL TRY CATCH
		/*try {
			int result = 5/0;
			System.out.println("resultado: " + result);
		} catch (Exception e) {
			System.out.println("Algo ha ido mal..." + e.getMessage());
		} */
		
		// AÑADIMOS LA INSTRUCCIÓN FINALLY.
		//ejemplo 1 
		/*
		try {
			int result = 5/0;
			System.out.println("resultado: " + result);
		} catch (Exception e) {
			System.out.println("Algo ha ido mal..." + e.getMessage());
		} finally {
			System.out.println("la estructura try catch ha terminado");
		} */
		
		//EJEMPLO 2
		
		Scanner scan = new Scanner(System.in);
		
		try {
			// ESTO SE EJECUTA SIEMPRE
			System.out.println("dime tu edad");
			int edad = scan.nextInt();
			// SE EJECUTA SI TODO VA BIEN
			//System.out.println("solo me ejecuto a veces :(");
			
		} catch (Exception e) {
			System.out.println("Algo ha ido mal..., tendrás que volver a poner la edad");
		//} catch (IOException e) {
		//} catch (FileNotFoundException e) {
		} finally {
			System.out.println("la estructura try catch ha terminado");
		}

		
		
		
		
		
		/*
	Scanner scan = new Scanner(System.in);
	System.out.println("dime tu edad");
	int edad = scan.nextInt();
		*/
	}
	
	
}

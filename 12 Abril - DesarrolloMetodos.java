import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesarrolloMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 30;
		boolean tengoCarnet = false;
		
		if (comprobacion(edad, tengoCarnet) == true) {
			 JOptionPane.showMessageDialog(null, "enhorabuena a pagar, deja depósito de 500 €");
		} else {
			 JOptionPane.showMessageDialog(null, "adiós y no vuelvas");
		}
	}
	
	public static boolean comprobacion(int anyos, boolean carnet) {
		if (anyos >= 18 && carnet == true) {
			System.out.println("Verificación correcta, edad y carnet. Puedes alquilar el coche");
			return true;
		} else {
			System.out.println("Datos verificados, pero NO puedes alquilar. ");
			return false;
		}
	}
	
		
		// EJEMPLO 1 
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un número");
		int operador1 = scan.nextInt();
		System.out.println("Dime otro número");
		int operador2 = scan.nextInt();
		
		if (sumaNumeros(operador1, operador2)){
			System.out.println("El resultado es mayor que 0");
		} else {
			System.out.println("El resultado es MENOR que 0");
		}
		
		
	}
	
	public static boolean sumaNumeros (int num1, int num2) {
		int resultado = num1 + num2;
		if (resultado >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	*/
}

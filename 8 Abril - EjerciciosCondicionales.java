package pruebas;

import java.util.Scanner;

public class EjerciciosCondicionales {

	public static void main(String[] args) {
		
		// EJERCICIO 3
	
		int numero1 = 5;
		int numero2 = 3;
		int numero3 = 6;
		
		if(numero1 + numero2 == numero3) {
			System.out.println("El resultado de sumar num1 y num2 es " + numero3);
		} else {
			System.out.println("El resultado de sumar num1 y num2 NO es " + numero3);
		}
	
		//EJERCICIO 4
		
		// CREO OBJETO DE LA CLASE SCANNER, UTILIZANDO FUNCIONALIDADES SYSTEM.IN
		// PARA QUÉ SIRVE? PARA PODER PREGUNTAR POR CONSOLA. 
		/*
		Scanner pregunta = new Scanner(System.in);
		System.out.println("Dime un número");
		int num1 = pregunta.nextInt();
		System.out.println("Dime un segundo número");
		int num2 = pregunta.nextInt();
		System.out.println("Dime un tercer número");
		int num3 = pregunta.nextInt();
		
		if (num1 - num2 == 20) {
			System.out.println("La diferencia entre num1 y num2 es 20");
		} else if (num1 - num3 == 20) {
			System.out.println("La diferencia entre num1 y num3 es 20");
		} else if (num2 - num1 == 20) {
			System.out.println("La diferencia entre num2 y num1 es 20");
		} else if (num2 - num3 == 20) {
			System.out.println("La diferencia entre num2 y num3 es 20");
		} else if (num3 - num1 == 20) {
			System.out.println("La diferencia entre num3 y num1 es 20");
		} else if (num3 - num2 == 20) {
			System.out.println("La diferencia entre num2 y num1 es 20");
	}
		*/
	
	
		// EJERCICIO 5
	
		Scanner preguntando = new Scanner(System.in);
		
		// FORMA MÁS SIMPLE--- LO PEDIDO AL USUARIO ES UN NÚMERO 
		/*
		System.out.println("Dime qué día es, introduce un número: 1-Lunes, 2-Martes...");
		
		int dia = preguntando.nextInt();
		
		switch (dia) {
		case 1: System.out.println("Es lunes");
		break;
		case 2: System.out.println("Es martes");
		break;
		case 3: System.out.println("Es miércoles");
		break;
		case 4: System.out.println("Es jueves");
		break;
		case 5: System.out.println("Es viernes");
		break;
		case 6: System.out.println("Es sábado");
		break;
		case 7: System.out.println("Es domingo");
		break;
		}
		
		*/ 
		
		// FORMA IDÓNEA - STRING, CON LOWERCASE Y CON TRIM. 
		/* 
		System.out.println("Dime qué día es");
		
		
		String dia = preguntando.nextLine();
		// BORRAMOS ESPACIOS 
		dia = dia.trim();
		
		switch (dia.toLowerCase()) {
		case "lunes": System.out.println("Es lunes");
		break;
		case "martes": System.out.println("Es martes");
		break;
		case "miercoles", "miércoles": System.out.println("Es miércoles");
		break;
		case "jueves": System.out.println("Es jueves");
		break;
		case "viernes": System.out.println("Es viernes");
		break;
		case "sabado": System.out.println("Es sábado");
		break;
		case "domingo": System.out.println("Es domingo");
		break;
		}	
                     */
		// CASO CON IF ELSE.
		
		/* 
		System.out.println("Dime qué día es");
		
		String dia = preguntando.nextLine();
		// BORRAMOS ESPACIOS 
		dia = dia.trim();
		
		if (dia.toLowerCase().equals("lunes")){
			System.out.println("Es lunes"); 
		} else if (dia.toLowerCase().equals("martes")){
			System.out.println("Es martes"); 
		} else if (dia.toLowerCase().equals("miercoles") || (dia.toLowerCase().equals("miércoles"))){
			System.out.println("Es miércoles"); 
		} else if (dia.toLowerCase().equals("jueves")){
			System.out.println("Es jueves"); 
		} else if (dia.toLowerCase().equals("viernes")){
			System.out.println("Es viernes"); 
		} else if (dia.toLowerCase().equals("sabado") || (dia.toLowerCase().equals("sábado"))){
			System.out.println("Es sábado"); 
		} else if (dia.toLowerCase().equals("domingo")){
			System.out.println("Es domingo");
			
}

*/
		
		// EJERCICIO 6
		
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un número");
		a = scan.nextInt();
		
		if (a > 0) {
			System.out.println("El cuadrado es igual a " + a * a);
			System.out.println("El cubo es igual a " + a * a * a);
		} else {
			System.out.println("El número es menor a uno");
		}
		
		

}}



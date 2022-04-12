import java.util.Scanner;

public class IntroduccionMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// INTRODUCCIÓN MÉTODOS
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un número");
		int operador1 = scan.nextInt();
		System.out.println("Dime otro número");
		int operador2 = scan.nextInt();
		
		
		int result = sumaNumeros(operador1, operador2);
		int result2 = sumaNumeros(5,5);
		
		System.out.println("El resultado de la suma con parámetros pedidos al usuario es de " + result);
		System.out.println("El resultado de la suma con parámetros ya dados (5 y 5) es de " + result2);
		
		restaNumeros(10, 5);
				
	}
	
	// MÉTODO QUE DEVUELVE DATOS (USO DEL TIPO DE DATO QUE QUEREMNOS QUE NOS DEVUELVA). 
	
	public static int sumaNumeros (int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	// MÉTODO QUE NO DEVUELVE (USO DEL MODIFICADOR VOID). 
	
	public static void restaNumeros (int num1, int num2) {
		int resultado = num1 - num2;
		System.out.println("El resultado de la resta es de " + resultado);
	}

}

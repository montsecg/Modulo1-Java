package pruebas;
import java.util.Scanner;

public class Preguntando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner pregunta =  new Scanner(System.in);
		System.out.println("Dime un número:");
		int respuesta1 = pregunta.nextInt();
		
		System.out.println("Dime un segundo número:");
		int respuesta2 = pregunta.nextInt();
		
		System.out.println("el número es "+respuesta1+" y el segundo número "+respuesta2);

	}

}

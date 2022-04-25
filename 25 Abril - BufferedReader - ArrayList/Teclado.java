package DatosTeclado;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException; // administrador de excepciones
import java.io.InputStreamReader; 

public class Teclado {
	
	public static void main(String[] args) throws IOException {
	
	//*** MÉTODOS TRADICIONALES *** 
		
		// VAMOS A CREAR UN OBJETO DE LA CLASE BUFFEREDREADER -> 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Por favor introduce tu nombre: ");
		
		String nombre = br.readLine();
		System.out.println("Bienvenido " + nombre + " por favor introduce ahora tu edad ");
		
		String entrada = br.readLine();
		int edad = Integer.parseInt(entrada);
		
		System.out.println("Bienvenido " + nombre + " tienes esta edad " + edad);

	// SCANNER (REQUIERE IMPORTACIÓN DE LA CLASE Y DIFERENTES MÉTODOS PARA EL TIPO DE DATO). 
	/*
	System.out.println("Dime tu edad");
	Scanner scanner = new Scanner(System.in);
	int edad = scanner.nextInt();
	
	System.out.println(edad); */
	
	}
	
	// BufferedReader - InputStreamReader
	
	
	
	
	
	
	
			
	//*** MÉTODOS ALTERNATIVOS CON FUNCIONALIDADES AÑADIDAS ***
	
	// SWING, PEDÍA DATOS AL USUARIO MEDIANTE INTERFACES VISUALES
	
	
}

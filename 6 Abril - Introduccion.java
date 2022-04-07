package pruebas;

public class Pruebas {

	//ESTO ES UN MÉTODO QUE INICIALIZA EL PROGRAMA
	// MÉTODO ES SINÓNIMO DE ALGO QUE HACE COSAS (FUNCIONALIDADES).
	public static void main(String[] args) {
		
		int ejercicio1 = ((33+3*4)/5);
		System.out.println("El resultado es " + ejercicio1);
		

		// ************VARIABLES CON NÚMERO***************
	
		// INT = numero entero;
		int numero = 5000; // 32 BITS DE MEMORIA.
		System.out.println(numero);
		int numero2 = 6;
		int numero3 = 10;

		int resultadoFinal = (numero + numero2 + numero3);
		System.out.println("El resultado de la suma es " + resultadoFinal);
		
		int resultadoFinal2 = (numero - numero2 - numero3);
		System.out.println("El resultado de la resta es " + resultadoFinal2);
	
		// FLOAT = numero decimal (REQUIERE INCLUIR ESA F, O EL (FLOAT);
		float numeroDecimal = 30.0f; // 32 BITS DE MEMORIA
		float numeroDecimal2 = (float) 30.5;
		
		// OTROS, MÁS O MENOS GRANDES.
		
		byte resultado = 127; // 8 BITS 
		short calculo = 30; // 16 bits.
		long operacion = 60; // 64 bits
		
		// DOUBLE, numero decimal más grande. 
		double operaciones = 30;
		
		// ************VARIABLES CON TEXTOS***************
		
		//CADENA DE CARACTERES (STRING)
		String nombre = "David";
		nombre = "50";
		//CARACTER (CHAR)
		char primeraLetra = 'a';
		primeraLetra = 'b';
		
		System.out.println("Hola, mi número de la suerte es el " + operaciones);
		
		
		Boolean estoyEstudiando = true;
		Boolean estoyTrabajando = false;
		
		
		
		
		
		
		

		/* ;
		System.out.println("Estoy plantando un awrbol con el system");
		System.out.println("********");
		System.out.println("******");
		System.out.println("*"); */ 
		
	}
}

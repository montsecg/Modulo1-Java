package pruebas;

public class LibreriaMath {

	public static void main(String[] argumentos) {
		
		double numero = -6.8;
		
		// EXISTEN NÚMEROS YA GRABADOS... TIPO EL Nº PI:
		double pi = Math.PI;
		System.out.println(pi);
		
		// Math.abs -> devuelve número absoluto
		System.out.println(Math.abs(numero));
		
		// MÁS EN LOS APUNTES
		
		// Potencia, raíz cuadrada...
		int num = 4;
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.sqrt(num));
		// Nº aleatorio de 0 a 1. 
		float aleatorio = (float) Math.random();
		System.out.println("Nº aleatorio: " + aleatorio);
		System.out.println("Nº aleatorio 2 es : " + Math.random()*100);
		double random = Math.random()*100;
		System.out.println(random);
		
		//Redondeo... 
		
		double calculo = 61.3;
		int redondeo = (int) Math.round(calculo);
		System.out.println(redondeo);
		
		
	}
	
}

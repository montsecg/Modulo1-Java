import java.util.Random;
import java.util.Scanner;

public class EjerciciosMetodos2 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// EJERCICIO 2 - EJEMPLO EVA (CON PROBLEMAS)
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Primer número:");
		int resp1 = scan.nextInt();
		System.out.println("Segundo número:");
		int resp2 = scan.nextInt();

		System.out.println("Número random entre "+resp1+" y "+resp2+": "+numerosLimite(resp1,resp2));
				}
	
		public static int numerosLimite (int numBajo, int numAlto) {
			
		Random random = new Random();
		int resultado = (int) random.nextInt(numAlto - numBajo) + numBajo;
		return resultado; */
		
		
		// EJERCICIO 2 - EJEMPLO CARLOS - PERFECTO
/*
      int cantidad;
      
      int resultado[];
      
      System.out.println("Cuántos números? ");
      
      Scanner scan = new Scanner(System.in);
      cantidad = scan.nextInt();
      
      resultado = alea(cantidad);
      System.out.println("Mostrando " + cantidad + " números aleatorios");
      for(int i=0;i<resultado.length;i++) {
          System.out.println(resultado[i]);
      }
      scan.close();
	} 
	
	   public static int[] alea(int cantidad) {
	        int[] numeros = new int[cantidad];
	        for(int i=0;i<cantidad;i++) {
	            numeros[i] = (int) (Math.random()*100);        }
	        return numeros;
	   	*/

	// EJERCICIO 3

	int numero;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Ingresar un número entero: ");
	numero = scan.nextInt();
	
	if (primo(numero))
		System.out.println("Es primo");
	else
		System.out.println("NO es primo");
	scan.close();
	
	   }
	   
		public static boolean primo(int numero) {
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					return false;
				}
			}
				return true;
		}

 }
		



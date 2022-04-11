import java.util.Scanner;

import javax.swing.JOptionPane;

public class Repaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		// EJERCICIO 1 - PRUEBAS CON SWING Y SCANNER
		
		// VÍA "SWING"
		
		// PRUEBAS "SWING"
		/*
		String nombre = JOptionPane.showInputDialog("Cómo te llamas");
		JOptionPane.showMessageDialog(null, "Entonces te llamas... " + nombre);
		
		nombre = nombre.toLowerCase().trim().replace(" ", "");
		nombre = nombre.replace("á", "a");
		nombre = nombre.replace("é", "e");
		nombre = nombre.replace("ó", "o");
		nombre = nombre.replace("ú", "u");
		nombre = nombre.replace("í", "i");
		*/
		//JOptionPane.showMessageDialog(null, "Ahora, tras PRUEBAS, te llamas " + nombre);
		/*
		// SIEMPRE OBTENEMOS STRING. 
		/*
		String textoNum = JOptionPane.showInputDialog("Dime un número");
		int num1 = Integer.parseInt(textoNum);
		
		String textoNum2 = JOptionPane.showInputDialog("Dime un número");
		int num2 = Integer.parseInt(textoNum2);
	
		System.out.println(num1 + " " + num2);
		
		JOptionPane.showMessageDialog(null, "Los números seleccionados han sido... " + num1 + " y " + num2);
		
	*/
		// EJEMPLO SCANNER 
		/*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número");
		int num1 = sc.nextInt();
		System.out.println("Dime otro número");
		int num2 = sc.nextInt();
		
		sc.close();
		
		System.out.println("Suma " + num1 + num2);
		System.out.println("Resta " + (num1 - num2));
		System.out.println("Multiplicacion " + num1 * num2);
		System.out.println("Division " + num1 / num2);
		System.out.println("Resto " + num1 % num2);
		
		*/
		
		//EJERCICIO 2 - EJEMPLO FYE 
		/*
		int N = 8;
		double A = 4.5;
		char C = 'f';
		
		int asciivalue = C;

		System.out.println("N vale "+N);
		System.out.println("A vale "+A);
		System.out.println("C equivale a "+C);
		
		System.out.println(N+A);
		System.out.println(A-N);
		System.out.println(N+A);
		System.out.println(N+A);
		System.out.println("El valor ASCII de "+C+" es: "+asciivalue); */
		
		// EJEMPLO CARLOS
		/* 
		int N = 5;
		double A = 3.1416;
		char C = 'A';

		System.out.println();
		System.out.println("*** Ejercicio 2 ***");

		System.out.println("N = " + N);
		System.out.println("A = " + A);
		System.out.println("C = " + C);

		System.out.println(N + " + " + A + " = " + (N+A));
		System.out.println(A + " - " + N + " = " + (A-N));
		System.out.println("Valor numérico de C = " + (int) C);
		System.out.println("Valor caracter de C = " + C);
		*/
		
		// EJERCICIO 3 - EJEMPLO JOSEP MARIA
		/*
	      	int x = 9;
	        int y = 7;
	        double n = 4.35895;
	        double m = 1.4789;
	        
	        
	       
	        System.out.println("Valores de las variables.  x = " + x +"     y = " + y +"     n = " + n +"    m = "+ m + "\n");

	        System.out.println("x + y = " + (x+y) + "   x - y = " + (x-y) + "   x * y = " + (x*y) + "   (parte entera) x / y = " + (x/y)
	            + "   el resto de x%y = " +    (x%y) + "\n");

	        System.out.println("n + m = " + (n+m) + "   n - m = " + (n-m) + "   n * m = " + (n*m) + "   n / m = " + (n/m)
	                + "   el resto de n%m = " +    (n%m) + "\n");

	        System.out.println(" x + n = " + (x+n) + "   y / m =" + (y/m) + "   y%m = " + (y%m) + "\n");

	        System.out.println("El doble " + x + " es " + 2*x);
	        System.out.println("El doble " + y + " es " + 2*y);
	        System.out.println("El doble " + n + " es " + 2*n);
	        System.out.println("El doble " + m + " es " + 2*m);
	        System.out.println();

	        System.out.println("La suma de todas las variables es " + (x+y+n+m));
	        System.out.println();
	        System.out.println("El producto de todas las variables es " + (x*y*n*m));
		 
		  */
		
		// EJERCICIO 4 - EJEMPLO POL
		/*
		
		System.out.println("----------------- Ejercicio 4----------------");

        int W = 67;

        int incremento = (W + 77);
        int decremento = (W-3);
        int duplicar = (W*2);

        System.out.println("Valor incial = " + W + "\n Incremento de 7: " + incremento + "\n Decremento de 3: " + decremento + "\n valro duplicado: " + duplicar);
	        */
		
		// EJERCICIO 5 - EJEMPLO POL - PIERDE UN VALOR
		/*
		
	    System.out.println("----------------- Ejercicio 5----------------");

        int AA = 45;
        int AB = 77;
        int AC = 6;
        int AD = 10;
    
        AB = AC;
        AC = AA;
        AA = AD;
        AD = AB;

        System.out.println("Valores: AA " + AA + "\n Valor AB: " + AB + "\n Valor AC: " + AC + "\n Valor AD: " + AD);
        */
		
		// EJERCICIO 5 - EJEMPLO EVA - SYSTEM.OUT
		/*
		
		int A = 5;
        int B = 6;
        int C = 7;
        int D = 8;

        System.out.println("Variable B inicial es: "+B+", y ahora es C: "+(B = C));
        System.out.println("Variable C inicial es: "+C+", y ahora es A: "+(C = A));
        System.out.println("Variable A inicial es: "+A+", y ahora es D: "+(A = D));
        System.out.println("Variable D inicial es: "+D+", y ahora es B: "+(D = B));

	*/ 
		
		// EJERCICIO 5 - EJEMPLO CARLOS - VARIABLE AUXILIAR PARA NO PERDER NINGUN VALOR
		
		int AA,BB,CC,DD,swap;

		AA = 2;
		BB = 4;
		CC = 6;
		DD = 8;

		System.out.println();
		System.out.println("*** Ejercicio 5 ***");
		System.out.println("AA, BB, CC, DD = " + AA + ", " + BB + ", "+ CC + ", " + DD);

		swap = BB;
		BB = CC;
		CC = AA;
		AA = DD;
		DD = swap;

		System.out.println("AA, BB, CC, DD = " + AA + ", " + BB + ", "+ CC + ", " + DD);
		
	}

}

import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Repaso2 {

	public static void main(String[] args) {
		
		//EJERCICIO 1
		/*
	     System.out.println("-------Ejercicio 1--------");

	    int A = 5;
	    int B = 10; 
	 
	    if (A==B) {
	        System.out.println("Los valores son iugales");        
	    } else if (A>B) {
	        System.out.println("A es mayor que B");
	    } else if (A<B) {
	        System.out.println("B es mayor que A");
	    }
	    
	    //EJERCICIO 2
	    
	    String nombre = "David";
	    System.out.println("Bienvenido " + nombre);
	    
	    //EJERCICIO 3
	    /*
	    Scanner pregunta = new Scanner(System.in);
	    System.out.println("¿Cómo te llamas");
	    String respuesta = pregunta.nextLine();
	    pregunta.close();
	    System.out.println("Hola a ti también " + respuesta); 
	    
	    //EJERCICIO 4 
	    
        System.out.println("*** Ejercicio 4 ***");
        String strRadio;
        double dblRadio = 0.0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar el radio del círculo: ");
        strRadio = scan.nextLine();
        
        dblRadio = Double.parseDouble(strRadio);
        System.out.println("Area del círculo: " + Math.PI*(Math.pow(dblRadio, 2)));*/
		
		//EJERCICIO 5
		/* 
		int num;
		
		Scanner question = new Scanner(System.in);
		System.out.println("Inserte número");
		num = question.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("SÍ que es divisible");
		} else System.out.println("NO es divisible");
		
				// SIMPLIFICADO. UNA SOLA SENTENCIA SIN LLAVES
	 	/* if (num % 2 == 0) System.out.println("SÍ que es divisible");
		else System.out.println("NO es divisible"); */
		
		// EJEMPLO TERNARIO 
		
		//String conclusion = (num % 2 == 0 ) ? "Es divisible de 2" : "No es divisible entre 2";
		//System.out.println((num % 2 == 0 ) ? "Es divisible de 2" : "No es divisible entre 2");
		
		// EJERCICIO 6
		
		/*
        System.out.println("*** Ejercicio 6 ***");
        double precio;
        final double IVA = 0.21;
        
        System.out.print("Introducir el precio: ");
        Scanner scan = new Scanner(System.in);
        precio = scan.nextDouble();
        System.out.print("Precio con IVA: " + (precio + precio * IVA) );*/
		
		// EJERCICIO 7 - EJEMPLO EVA.
		
		/*int contador = 1;

        while (contador < 101) {
            System.out.println("Voy por la vuelta " + contador);
            contador++; // contador = contador + 1
        } */
        
        // EJERCICIO 7 - EJEMPLO CARLOS
       /*
        System.out.println("*** Ejercicio 7 ***");
        int xx = 0;
        while(xx < 100) System.out.println(++xx); */ 
        
        // EJERCICIO 8
        /*
      for (int num = 1; num < 101; num++ ) {
       System.out.println("Voy por la vuelta "+num);
      		}
      		*/
		
		// EJERCICIO 9
		
		//for (int i = 1; i <= 100; i++)

		//	if (i % 2 == 0 && i % 3 == 0) {
		//	System.out.println(i+ " es divisible entre 2 y entre 3.");
	 //	}		
	
		// EJERCICIO 10 - EJEMPLO EVA (+ CARLOS + FYE)
	
		/* 
	Scanner preg = new Scanner(System.in);
    System.out.println("Introduce número de ventas");
    int resp1 = preg.nextInt();

    int [] lista = new int[resp1];
    int total = 0;

    for (int i = 0; i < lista.length; i++) {
        System.out.println("Número ventas en la posición " + i );
        lista[i] = preg.nextInt();
        total += lista[i];
    }

    System.out.println("Suma: "+ total);
	
	} */
		
		// EJERCICIO 10 - EJEMPLO CARLOS
		/*
        System.out.println("*** Ejercicio 10 ***");
        int ventasCantidad;
        double ventasTotal = 0.0;
        System.out.print("Cuántas ventas? ");
        Scanner scan = new Scanner(System.in);
        ventasCantidad = scan.nextInt();
        for(int i=0;i<ventasCantidad;i++) {
            System.out.print("Importe venta nº (usar COMA como separador decimal)" + (i+1));
            ventasTotal += scan.nextDouble();
        }
        System.out.print("Importe total: " + ventasTotal);
	 */
		// EJERCICIO 11
		/*
		String pregunta = JOptionPane.showInputDialog("¿Qué día es hoy?");
        String dia = pregunta.toLowerCase().replace('é','e').replace('á','a').trim();
        
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes": JOptionPane.showMessageDialog(null, "Es día laboral");
            break;
            case "sabado":
            case "domingo": JOptionPane.showMessageDialog(null, "Es fin de semana");
            break;
            default: JOptionPane.showMessageDialog(null,"No te entiendo");
            break;
        }
        */ // EJERCICIO 12
		/*
	        System.out.println("*** Ejercicio 12 ***");
	        String pssWrd = "pepe";
	        String intento = "";
	        Scanner scan = new Scanner(System.in);
	        for(int i=0;i<3;i++) {
	            System.out.println("Intento " + (i+1) + ": ");
	            intento = scan.nextLine();
	            if(intento.equals(pssWrd)) {
	                System.out.println("Enhorabuena!");
	                break;
	            }
	        }
		*/
		
		// EJERCICIO 13
		
	     System.out.println("*** Ejercicio 13 ***");
	        double operando1 = 0.0;
	        double operando2 = 0.0;
	        String operador = "";
	        System.out.println("Primer operando (usar COMA como separador decimal): ");
	        Scanner scan = new Scanner(System.in);
	        operando1 = scan.nextDouble();
	        System.out.println("Segundo operando (usar COMA como separador decimal): ");
	        operando2 = scan.nextDouble();
	        scan = new Scanner(System.in);
	        System.out.println("Operador: ");
	        operador = scan.nextLine().substring(0, 1);
	 	    final JDialog dialog = new JDialog();
	        dialog.setAlwaysOnTop(true);
	        switch(operador) {
	            case "+":
	                //System.out.println(operando1 + operando2);
	                JOptionPane.showMessageDialog(dialog, operando1 + operando2);
	                break;
	            case "-":
	                //System.out.println(operando1 - operando2);
	                JOptionPane.showMessageDialog(dialog, operando1 - operando2);
	                break;
	            case "*":
	                //System.out.println(operando1 * operando2);
	                JOptionPane.showMessageDialog(dialog, operando1 * operando2);
	                break;
	            case "/":
	                //System.out.println(operando1 / operando2);
	                JOptionPane.showMessageDialog(dialog, operando1 / operando2);
	                break;
	            case "^":
	                //System.out.println(Math.pow(operando1, operando2));
	                JOptionPane.showMessageDialog(dialog, Math.pow(operando1, operando2));
	                break;
	            case "%":
	                //System.out.println(operando1 / operando2);
	                JOptionPane.showMessageDialog(dialog, operando1 % operando2);
	                break;
	            default:
	                JOptionPane.showMessageDialog(dialog, "Operador incorrecto");
	        }
		
	}
	
		}


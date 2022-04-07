package pruebas;

public class Condicionales {
	
	public static void main(String[] args) {
		
		// CONDICIONAL SIMPLE O CONDICIONAL IF... 
		
		int edad = 20;
		
		if (edad >= 18) {
		//si... tengo esto... hago esto otro... 
			System.out.println("Enhorabuena eres mayor de edad, puedes "
					+ " alquilar un coche"); 
		}
		

		// CONDICIONAL DOBLE O CONDICIONAL IF ELSE
		
		if (edad >= 18) {
		//si... tengo esto... hago esto otro... 
			System.out.println("Enhorabuena eres mayor de edad. Estamos en un condicional doble"); 
		} else {
			System.out.println("Lástima, no eres mayor");
		}
		
		// CONDICIONAL MÚLTIPLE (HAY DE DOS TIPOS).
		
		// PRIMER EJEMPLO DE CONDICIONAL MÚLTIPLE LLAMADO TAMBIÉN ELSE IF 
		int nota = 10;
		
		if (nota >= 9) {
				System.out.println("Tienes un excelente"); 
		} else if (nota < 9 && nota >= 7) {
				System.out.println("Tienes notable");
		} else if (nota < 7 && nota >= 5) {
			System.out.println("Tienes un suficiente");
		} else {
			System.out.println("Has suspendido");
		}
		
		boolean carnet = true;
		int edad2 = 18;
		
		if (carnet == true && edad2 >= 18) {
			System.out.println("Puedes alquiler el coche");
		} else if (carnet == false || edad2 < 18) {
			System.out.println("NO puedes alquiler un coche");
		}
		
		// SEGUNDO EJEMPLO DE CONDICIONAL MÚLTIPLE: EL SWITCH
		
		int notaExamen = 7;
		
		switch(notaExamen) {
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("Suspendido");
		break;
		case 5: System.out.println("Suficiente");
		break;
		case 6: System.out.println("Bien");
		break;
		case 7:
		case 8: System.out.println("Notable");
		break;
		case 9: System.out.println("Excelente");
		break;
		case 10: System.out.println("Perfecto");
		break;
		}
	
		// UN BUEN CONDICIONAL QUE SIMPLIFICA EL CÓDIGO: EL TERNARIO
		
		int number = 15;
		if (number > 0) {
			System.out.println("Positive number");
		} else {
			System.out.println("Negative number");
		}
		
		// TERNARIO AQUÍ!
		                //condicion  ?     TRUE          :         FALSE 
		String result = (number > 0) ? "Positive Number" : "Negative Number"; 
		System.out.println(result);
	}

}

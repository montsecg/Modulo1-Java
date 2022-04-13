package ClasesObjetos;

import java.util.Scanner;

public class Main {
	
	// -> UNA PLANTA CON VITALIDAD 30.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// vamos a crearnos un objeto (recordad: objeto es la representación física de la clase (de ese patrón/plantilla).
		
		// YA TENEMOS NUESTRO COCHE HONDA:
		Coche Honda = new Coche();
			
		//PERO, QUIERO CREAR UN SEAT
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vas a comprarte un seat. ¿Qué modelo quieres?");
		String modeloElegido = scanner.nextLine();
		
		System.out.println("¿De quié color lo quieres?");
		String colorElegido = scanner.nextLine();

		System.out.println("¿Es gasolina? true o false");
		boolean esGasolinaEleccion = scanner.nextBoolean();
	
		Coche Seat = new Coche(esGasolinaEleccion, colorElegido, modeloElegido);
		
		System.out.println("color honda: " + Honda.color);
		System.out.println("modelo honda: " + Honda.modelo);
		System.out.println("es gasolina honda: " + Honda.esGasolina);
		
		System.out.println("color seat: " + Seat.color);
		System.out.println("modelo seat: " + Seat.modelo);
		System.out.println("es gasolina el seat: " + Seat.esGasolina);
		
		
	}
		
		
		/*
		
		System.out.println("** TIENES TU FLAMANTE COCHE... ¿QUIERES ENCENDERLO? ");
		String decision = scanner.nextLine();
		decision = decision.toLowerCase().trim();
		
		if (decision.equals("si")) Honda.encender();
			else System.out.println("pues ya lo encenderás");
		
		if (Honda.encendido == true) {
			
			do {
				
				System.out.println("¿QUÉ QUIERAS HACER..., 1. ACELERAR; 2.FRENAR; 3.MARCHA ATRÁS; 4.PARAR...");
				int eleccion = scanner.nextInt();
				
				switch (eleccion) {
				case 1: Honda.acelerar();
				break;
				case 2: Honda.frenar();
				break;
				case 3: Honda.marchaAtras();
				break;
				case 4: Honda.apagar();
				break;
				}
				
				if(Honda.combustible <= 15) {
					System.out.println("Queda poco combustible, habría que pensar en llenar el depósito, aunque esté caro");
					System.out.println("Nivel combustible actual " + Honda.combustible);
				}
				
				if(Honda.combustible <= 0) {
					Honda.encendido = false;
					System.out.println("El coche se ha quedado sin combustible. Llama al seguro a ver si te sale gratis la grúa");
				}
											
			} while (Honda.encendido == true);
			
			
			
			
			*/
			
			

			
	
		
		
		/*
		
		System.out.println("*********** COCHE RECIÉN ESTRENADO... ************");
		System.out.println("** NIVEL COMBUSTIBLE INICIAL... **");
		System.out.println(Honda.combustible);
			
		Honda.encender();
		System.out.println(Honda.combustible);
		Honda.acelerar();
		System.out.println(Honda.combustible);
		Honda.frenar();
		System.out.println(Honda.combustible);
		Honda.acelerar();

		
		if (Honda.combustible == 5) System.out.println("Aviso: combustible se está agotando, nos queda " + Honda.combustible);
		else System.out.println("No hay problema con el combustible");
		
		
		
		
	//	Honda.llenarDeposito();
		
	}

	private static void switch(String decision) {
		// TODO Auto-generated method stub
		
	}
*/
	
}

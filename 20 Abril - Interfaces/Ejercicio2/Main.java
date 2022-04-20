package Abril21.Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		 * 
		 * nueva.getCiudad(); nueva.getBarrio(); nueva.getBaños();
		 * nueva.getHabitaciones(); nueva.getColor(); nueva.getPisos();
		 * nueva.isCocina();
		 */
		
		//Casa nueva = new Casa();
		
		Casa primero = new Casa("Molins de Rei, ", "Incresa, ", "Blanco");
		primero.getCiudad();
		primero.getBarrio();
		primero.getColor();

		Casa segundo = new Casa("Peligro, ", "Rojo, ", 2);
		segundo.getBarrio();
		segundo.getColor();
		segundo.getPisos();

		Casa tercero = new Casa(3, 7, 4, true);
		tercero.getPisos();
		tercero.getHabitaciones();
		tercero.getBaños();
		tercero.isCocina();

	}

}

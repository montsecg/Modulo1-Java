package Abril21.Ejercicio2;

public class Casa {
	
	// ATRIBUTOS
	
	final String Ciudad;
	final String Barrio;
	final String Color;
	final int Pisos;
	final int Habitaciones;
	final int Baños;
	final boolean Cocina;

	public Casa(String Ciudad, String Barrio, String Color) {
		this.Ciudad = Ciudad;
		this.Barrio = Barrio;
		this.Color = Color;
		this.Pisos = 0;
		this.Habitaciones = 0;
		this.Baños = 0;
		this.Cocina = true;
	}

	public Casa(String Barrio, String Color, int Pisos) {
		this.Ciudad = "";
		this.Barrio = Barrio;
		this.Color = Color;
		this.Pisos = Pisos;
		this.Habitaciones = 0;
		this.Baños = 0;
		this.Cocina = true;
	}

	public Casa(int Pisos, int Habitaciones, int Baños, boolean Cocina) {
		this.Ciudad = "";
		this.Barrio = "";
		this.Color = "";
		this.Pisos = Pisos;
		this.Habitaciones = Habitaciones;
		this.Baños = Baños;
		this.Cocina = Cocina;
	}

	protected String getCiudad() {
		System.out.println("La Casa esta en la ciudad: " + Ciudad);
		return Ciudad;

	}

	protected String getBarrio() {
		System.out.println("La Casa esta en el barrio: " + Barrio);
		return Barrio;
	}

	protected String getColor() {
		System.out.println("El color de la casa es: " + Color);
		return Color;
	}

	protected int getPisos() {
		System.out.println("El numero de pisos es: " + Pisos);
		return Pisos;
	}

	protected int getHabitaciones() {
		System.out.println("El numero de habitaciones es: " + Habitaciones);
		return Habitaciones;
	}

	protected int getBaños() {
		System.out.println("El numero de baños es: " + Baños);
		return Baños;
	}

	protected boolean isCocina() {
		System.out.println("La casa tiene cocina");
		return Cocina;
	}

}

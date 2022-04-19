package Abril19;

public class Autobus extends Vehiculo {

	// AQUÍ ESTÁN TODOS LOS ATRIBUTOS Y MÉTODOS DE VEHICULO!
	
	private int capacidad;

	protected int getCapacidad() {
		return capacidad;
	}

	protected void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	public void encenderVehiculo() {
		System.out.println("El autobús está encendido");
		super.encenderVehiculo();
	}
	
	
}

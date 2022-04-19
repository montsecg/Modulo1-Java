package Abril19;

public class Taxi extends Vehiculo {

	private String licencia;

	protected String getLicencia() {
		return licencia;
	}

	protected void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	
	public void encenderVehiculo() {
		System.out.println("El TAXI está encendido");
	}
	
	
}

package Abril19;

public class Vehiculo {
	
	//ATRIBUTOS

	private String matricula;
	private String modelo;
	private int potencia;
	
	//MÉTODOS, PRIMERO GETTERS AND SETTERS, LUEGO MÉTODOS NORMALES
	
	protected String getMatricula() {
		return matricula;
	}
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected int getPotencia() {
		return potencia;
	}
	protected void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void encenderVehiculo() {
		System.out.println("El vehículo está encendido");
	}
	
	public void apagarVehiculo() {
		System.out.println("El vehículo está apagado");
	}
	
}


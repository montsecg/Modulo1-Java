package com.welcome;

public class Calculo {

	private Double tiempoInicial;
	private Double tiempoFinal;
	private Double distancia;
	private Double velocidad;
	private Double tiempoTotal;
	
	public Calculo(String tIni, String tFin, String dist) {
		this.tiempoInicial = Double.parseDouble(tIni);
		this.tiempoFinal = Double.parseDouble(tFin);
		this.distancia = Double.parseDouble(dist);
	}
	
	public void velocidad() {
		this.velocidad = distancia/(tiempoFinal - tiempoInicial);
	}
	
	public void tiempoTotal() {
		tiempoTotal = tiempoFinal - tiempoInicial;
	}
	
	public Double getVelocidad() {
		return velocidad;
	}
	
	public Double getTiempo() {
		return tiempoTotal;
	}
}

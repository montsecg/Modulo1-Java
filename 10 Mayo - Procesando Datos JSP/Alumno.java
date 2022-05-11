package com.welcome;

public class Alumno {

	private String nombre;
	private String apellidos;
	private Double promedio;
	
	public Alumno(String nombre, String apellidos, Double promedio) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.promedio = promedio;
	}

	protected String getNombre() {
		return nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected Double getPromedio() {
		return promedio;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", promedio=" + promedio + "]";
	}
	
	
	
	
}

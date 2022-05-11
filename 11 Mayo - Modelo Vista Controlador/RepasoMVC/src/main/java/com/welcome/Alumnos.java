package com.welcome;

public class Alumnos {

	private String nombre;
	private String apellidos;
	private Double promedio;
	
	public Alumnos(String nombre, String apellidos, Double promedio) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.promedio = promedio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Double getPromedio() {
		return promedio;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", promedio=" + promedio + "]";
	}
	
	
	
	
}
	

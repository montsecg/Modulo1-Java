package Abril19;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String NIF;
	boolean estudiante;
	boolean trabajador;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	private String getNIF() {
		return NIF;
	}
	protected void setNIF(String NIF) {
		this.NIF = NIF;
	}
	protected boolean isEstudiante() {
		return estudiante;
	}
	protected void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}
	protected boolean isTrabajador() {
		return trabajador;
	}
	protected void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}

}

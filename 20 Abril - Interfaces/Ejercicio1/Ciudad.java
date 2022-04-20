package Abril21.Ejercicio1;

public class Ciudad {

	private String nombre;
	private int poblacion;
	private String pais;
	private String presidente;

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected int getPoblacion() {
		return poblacion;
	}

	protected void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	protected String getPais() {
		return pais;
	}

	protected void setPais(String pais) {
		this.pais = pais;
	}

	protected String getPresidente() {
		return presidente;
	}

	protected void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", poblacion=" + poblacion + ", pais=" + pais + ", presidente=" + presidente
				+ "]";
	}


}

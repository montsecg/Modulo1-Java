package Abril21;

public interface Aeronave {

	// INTERFAZ -> 
		// COLECCIÓN DE MÉTODOS SIN IMPLENTAR (SIN CÓDIGO DENTRO).
		// ADEMÁS, ATRIBUTOS, PERO SOLO PUEDEN SER FINAL (CONSTANTES).
	
	//ATRIBUTOS CONSTANTES: NUNCA CAMBIARÁN.
	final boolean vuela = true;
	final boolean tieneMotor = true;
	
	public void encender();
	public void apagar();
	public void cargarCombustible(int cantidad);
	public void abrirCompuerta();
	public void cerrarCompuerta();
	public void encenderMotor();
	public void apagarMotor();

}

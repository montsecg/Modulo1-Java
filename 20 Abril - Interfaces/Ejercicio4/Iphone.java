package Abril21.Ejercicio4;

public class Iphone extends Telefono {

	String IOS;
	int edicion;
	String color;
	String fondoPantalla;

	public void cambiarFondoPantalla() {
		System.out.println("El fondo de pantalla del Iphone es azul");
		super.cambiarFondoPantalla();
	}

	protected void botonDerecho() {
		System.out.println("El botón derecho hace una captura de pantalla");
	}

}

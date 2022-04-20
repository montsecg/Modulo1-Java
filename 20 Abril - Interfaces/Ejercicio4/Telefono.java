package Abril21.Ejercicio4;

public class Telefono {

	boolean encendido;
	public String fondoPantalla;
	int bateria;

	private void encender() {
		encendido = true;
		bateria -= 5;
	}

	public void cambiarFondoPantalla() {
		fondoPantalla = "gris";
		System.out.println("El fondo de pantalla es gris.");
	}

}

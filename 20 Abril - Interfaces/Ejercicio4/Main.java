package Abril21.Ejercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono movil = new Telefono();
		Android movilAndroid = new Android("Galaxy", 2020, "Lollipop");
		Iphone movilIphone = new Iphone();

		//movil.encender(); - Este método no es visible

		System.out.print("Android: ");
		movilAndroid.cambiarFondoPantalla("verde");

		System.out.println();

		System.out.print("Iphone: ");
		movilIphone.cambiarFondoPantalla();

		System.out.println();

		System.out.print("Telefono: ");
		movil.cambiarFondoPantalla();
	}

}

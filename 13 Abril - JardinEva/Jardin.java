package JardinEva;

public class Jardin {

	int vida; // con static conseguimos que varios objetos interactuen con él (si no crean
						// diferentes variables sobre las que actuar)
	int agua;
	int sol;
	String tipo;
	private boolean florecer;

	public void regar() {

		vida = vida + 100;
		agua = agua + 100;

		System.out.println("Regando...");
		System.out.println("La planta tiene esta vida: " + vida);
		System.out.println("La planta tiene este nivel de agua: " + agua);

	}

	public void hablar() {
		System.out.println("La planta habla: ...");

	}

	private void florecer() {
		System.out.println("La plantada ha sacado una flor");

	}

	public void podar() {
		vida = vida - 20;
		sol = -10;
		System.out.println("Podando...");
		System.out.println("La planta tiene esta vida: " + vida);

	}

}

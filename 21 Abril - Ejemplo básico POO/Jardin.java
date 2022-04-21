package JardinEva;

public class Jardin {

	int vida; 
	int agua;
	int sol;
	String tipo;
	private boolean florecer;

	public void regar() {

		System.out.println("Regando...");
		

	}

	public void hablar() {
		System.out.println("La planta habla: ...");

	}

	private void florecer() {
		System.out.println("La planta ha sacado una flor");

	}

	public void podar() {
		System.out.println("Podando...");
	}

}

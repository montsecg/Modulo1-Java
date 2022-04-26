package Abril25.NumeroAleatorio;

public class Number {
	
	// QUÉ VAMOS HACER?
	// CREAREMOS UN PROGRAMA QUE UTILIZANDO POO JUEGUE CON EL USUARIO A ADIVINAR UN NÚMERO
	// DEBE CUMPLIR UNA SERIE DE REQUISITOS
	// (1) EL ORDENADOR DEBE GENERAR UN NUMERO ENTRE EL 1 Y EL 50; Y EL USUARIO TIENE ADIVINARLO. 
	// (2) CADA VEZ QUE EL USUARIO INTRODUCE UN VALOR, EL ORDENADOR DEBE DECIRLE AL USUARIO SI EL NÚMERO QUE TIENE QUE ADIVINAR
	//    ES MAYOR O MENOR QUE EL QUE HA INTRODUCIDO.
	// (3) CUANDO CONSIGA ADIVINARLO, DEBE INDICÁRSELO E IMPRIMIR POR PANTALLA EL NÚMERO DE VECES QUE EL USUARIO HA INTENTADO
	//     ADIVINAR EL NUMERO.
	// (4) SI EL USUARIO INTRODUCE ALGO QUE NO ES UN NÚMERO, DEBE INDICARLO EN PANTALLA, Y CONTARLO COMO UN INTENTO
	// INDICANDO QUE NO HA CONSEGUIDO RECONOCER LA ENTRADA LANZANDO LA EXCEPCION INPUTMISMATCHEXCEPTION
	
	private int number;
	private final int MAXIMO = 50;
	private final int MINIMO = 1;
	private int randomNumber;
	private int counterIntents; 
	
	// CONSTRUCTOR POR DEFECTO
	
	public Number() {
		number = 0;
		randomNumber = 0;
		counterIntents = 0;
		}
	
	public Number(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	
	// MÉTODO QUE GENERE EL NÚMERO ALEATORIO
	
	public void setRandomNumber() {
		this.randomNumber = (int) (Math.random() * (MAXIMO-MINIMO));
		//System.out.println(this.randomNumber);
	}
	
	// MÉTODO QUE VERIFIQUE SI EL Nº SELECCIONADO POR EL USUARIO CORRESPONDE CON EL Nº ALEATORIO GENERADO.
	
	public void randomVerified() {
		if (this.number == this.randomNumber) {
			System.out.println("¡NÚMERO CORRECTO!");
		} else {
			this.counterIntents++;
			System.out.println("Intentos realizados hasta ahora " + this.counterIntents);
			if (this.number > this.randomNumber) {
				System.out.println("El n º que busca es menor que el indicado");
			} else {
				System.out.println("El n º que busca es mayor que el indicado");
			}
			
		}
	}
	
	public boolean isNotNull() {
		if (this.number != this.randomNumber) {
			return true;
		}
			return false;
	}
	
	public void printVerification() {
		if (!isNotNull()) {
			System.out.println("El número de intentos totales ha sido de ... " + this.counterIntents);
		}
	}
	
	
	
	
	
	
}

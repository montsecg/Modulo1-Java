package Abril26;

public class MiExcepcion extends Exception{

	private int codigoException;

	public MiExcepcion(int codigoError) {
		super(); // Aquí llamo al padre que es Exception
		this.codigoException = codigoError;

	}

	public String getMessage() {

		String mensaje = "";

		switch (codigoException) {
		
		case 1:
			mensaje = "Te has equivocado 1 vez, no pasa nada, todos podemos fallar";
			break;

		case 2:
			mensaje = "Excepcion 444: te has vuelto a equivocar, fijate mejor y vuelve a intentarlo";
			break;
			
		case 3:
			mensaje = "Tres veces consecutivas equivocandote. Eres un palangana, no sirves para esto";
			break;

		}
		return mensaje;

	}

}

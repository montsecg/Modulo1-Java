package Abril25;

public class MiExcepcion extends Exception {

	private int codigoException;
	
	// CONSTRUCTORES PARA CREAR ESTA CLASE
	// CON PARÁMETRO
	
	public MiExcepcion(int codigoError) {
		super();
		this.codigoException = codigoError;
	}
	
	//SIN PARÁMETRO
	public MiExcepcion() {
		super();
	}
	
	public String getMessage() {
		
		String mensaje="";
		
		switch(codigoException) {
		case 111: 
			mensaje="Excepción 111: el número indicado está entre 0 y 10";
			break;
		case 222: 
			mensaje="Excepción 222: el número indicado está entre 11 y 20";
			break;
		case 333: 
			mensaje="Excepción 333: el número indicado está entre 21 y 30";
			break;
		}
		
		return mensaje;
		
	}
	
	

	
}

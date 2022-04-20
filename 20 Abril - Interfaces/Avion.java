package Abril21;

public abstract class Avion implements Aeronave, Aeropuerto {

	//MIEMBROS DE UNA CLASE : ATRIBUTOS + MÉTODOS
	
	//ATRIBUTOS
	
	String tipo; //carga o pasajeros. 
	int potencia;
	int motores;
	String propulsion;
	String empresa;
	boolean revisionReciente;
	double longitud;
	
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cargarCombustible(int cantidad) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void abrirCompuerta() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cerrarCompuerta() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void encenderMotor() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void apagarMotor() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void abrirPista() {
		// TODO Auto-generated method stub
		
	}

	public abstract void probandoClaseAbstracta();
}

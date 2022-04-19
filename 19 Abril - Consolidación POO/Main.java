package Abril19;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MAIN PARA LA CLASE PERSONA 
		/*
		Persona Joan = new Persona();
		
		Joan.setNIF("9991068X");
		Joan.setApellido("Vendrell");
		//String apellido = Joan.getApellido();
		System.out.println("El apellido de Joan es " + Joan.getApellido());
	*/
		//MAIN PARA LA CLASE CALCULADORA
	//Calculadora Operaciones = new Calculadora();
	
	//System.out.println(Operaciones.sumar());
	/*System.out.println(Operaciones.sumar(3, 3));
	System.out.println(Operaciones.sumar(3.5, 3.5));
	System.out.println(Operaciones.sumar(3.5f, 3.3f)); */
	//System.out.println(Operaciones.sumar(3.5f, 3.5f));
	
	//MAIN PARA LAS CLASES VEHICULO Y AUTOBUS
		
		Vehiculo Mercedes = new Vehiculo();
		Mercedes.apagarVehiculo();
		Autobus Penedes = new Autobus();
		Penedes.encenderVehiculo();
		Taxi taxiLondres = new Taxi();
		taxiLondres.encenderVehiculo();
	}

}

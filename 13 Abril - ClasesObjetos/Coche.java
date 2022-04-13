package ClasesObjetos;

public class Coche {

	// LA CLASE -> PATRÓN DESDE DONDE VAMOS A CONSTRUIR OBJETOS. 
		// EL PLANO DE UNA CASA NO ES UNA CASA. POR TANTO, EL PLANO ES LA CLASE. 
	                                              // LA CASA, SIN EMBARGO, ES EL OBJETO. 
			// UNA CLASE TIENE ATRIBUTOS Y TIENE MÉTODOS
	 // TIENE RASGOS/CARACTERÍSITCAS, Y TIENE FUNCIONALIDADES
		
	// DEFINIMOS LOS ATRIBUTOS DE LA CLASE COCHE:
	
	public String color; 
	public double cilinidradaMotor;
	public int ruedas;
	public int puertas;
	public boolean esDiesel;
	public boolean esGasolina;
	public boolean esElectrico;
	public String modelo;
	
	//variables de estados... 
	int aceleracion;
	int frenado;
	int combustible;
	int desgaste;
	boolean encendido;
	static int vitalidadPlanta;
	
	
	
	// DEFINIMOS LOS MÉTODOS DE LA CLASE COCHE
	
	//MÉTODO ESPECIAL, LLAMADO CONSTRUCTOR (NO ES OBLIGATORIO)
	
	public Coche() {
		esGasolina = true;
		color = "blanco";
		combustible = 50;
	}
	
	public Coche(boolean esGasolina, String color, String modelo) {
		this.esGasolina = esGasolina;
		this.color = color;
		this.modelo = modelo;
	} 
	
	// MÉTODOS GENERALES->
	
	public void encender() {
		System.out.println("El coche se ha encendido");
		encendido = true;
		// Esto es igual = combustible = combustible - 10
		combustible = 10;
	}
	
	public void apagar() {
		System.out.println("El coche se ha apagado");
		encendido = false;
	}

	public void acelerar() {
		System.out.println("El coche está acelerando");
		combustible = combustible - 15;
	}

	public void frenar() {
		System.out.println("El coche está frenando");
		combustible = combustible - 5;
	}
	
	public void marchaAtras() {
		System.out.println("El coche va hacia atrás");
		combustible = combustible - 5;
	}
	
	public void llenarDeposito() {
		System.out.println("Estoy llenando el depósito");
		combustible = 100;
	}
	
	
	
	
	
}

package Abril19;

public abstract class Materiales {
	// ESTO ES UNA CLASE ABSTRACTA
	// ¿QUÉ SUPONE QUE SEA ABSTRACTA?
	// PRIMERO, NO PODREMOS CREAR OBJETOS DE ESTA CLASE
	// SEGUNDA, ES QUE PODEMOS INCLUIR MÉTODOS SIN CÓDIGO DENTRO
	//                                  (( SIN IMPLEMENTAR )) . 
		
	protected void construirCoche() {
		System.out.println("estoy construyendo tu vehiculo");
	}
	
	protected abstract void llenarCombustible();
	
	protected abstract void encenderLuces();
		
		

}

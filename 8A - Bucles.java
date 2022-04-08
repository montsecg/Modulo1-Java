package pruebas;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BUCLES -> REPITEN CÓDIGO HASTA QUE SE REALIZA UNA ACCIÓN CONCRETA
		
	

	// REPETICIÓN DE CODIGO HASTA QUE INTERESE... 
	
	// VARIOS TIPOS
	// PRIMER TIPO -> BUCLE WHILE
	
	//int contador = 5;
	
	/*
	while (contador < 30) {
		contador = contador + 1;
		// contador++;
		System.out.println(contador);
	} */
		
		/*
		
		int i = 1;
		
		while (i < 5) {
			System.out.println("Estoy en la vuelta..." + i);
			i++;
		}   */
		
	
	// SEGUNDO TIPO -> BUCLE DO... WHILE
	  // AL MENOS EJECUTARÁ UNA VEZ LO QUE HAY 
	  // DENTRO DEL DO
	
	/*
	do {
		contador++;
		System.out.println(contador);
		
	} while (contador < 30);
	
	} */

	// TERCER TIPO --> BUCLE FOR
   // FOR --> USO NO SABEMOS CUÁNTAS REPITICIONES... 
		
	//   valor inicial   condición     acción
		
		/*
	for (int i = 1;      i < 5;        i++ ) {
		System.out.println("Estamos en la vuelta..." + i);
		
	}

	int i = 1;
	while (i < 5) {
		i++;
	}	 
	  */
		
		/*
		
	String nombre = "Pol";
	for (int i = 1; i <= nombre.length(); i++) {
		System.out.println("Estamos dando vueltas hasta que acabe la longitud nombre ");
		System.out.println("Vuelta nº " + i);
		System.out.println("El nombre tiene... " + nombre.length() + " caracteres");
	}
	
	*/
		
	// CUARTO TIPO (MUY CERCANO AL FOR) -> FOR EACH
		// USO EXCLUSIVO CON ARRAYS. 
		
		String[] cars = {"Volvo", "BMW", "Fiat", "Mazda"};
		for (String i : cars) {
			System.out.println(i);
		}
		// POSICIONES         [0]     [1]       [2]      [3]
		String[] trains = {"UT447", "UT448R", "UT252", "UT450"};
		System.out.println(trains[1]); 
		
	
		for (int i = 0; i < trains.length; i++ ) {
			System.out.println(trains[i]);
		}
		
		
		
	}
	
}

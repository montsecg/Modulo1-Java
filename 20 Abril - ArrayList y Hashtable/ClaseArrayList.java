package Abril20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ClaseArrayList {

	public static void main(String[] args) {

		// CREACIÓN ARRAYLIST DE STRING.
		ArrayList<String> lista = new ArrayList<>();

		// AÑADIMOS ELEMENTOS

		lista.add("David");
		lista.add("Joan");
		lista.add("Josep Maria");
		lista.add("Pol");
		lista.add("Pol");
		lista.add("Grace");
		lista.add("Fye");
		lista.add("Carlos");
		lista.add("Eva");
		lista.add("Jessica");
		lista.add("Meriem");
		lista.add("Jesús");
		lista.add("Montse");
		lista.add("Marc");

		// RECORREMOS
		for (Object o: lista) {
			System.out.println(o);
		}

		System.out.println(lista.size());
		
		//BORRAMOS UN ELEMENTO
		lista.remove("Pol");
				
		//BORRAMOS TODOS LOS ELEMENTOS
		//lista.clear();
		
		//MIRAMOS CUÁNTOS ELEMENTOS HAY
		System.out.println(lista.size());
		
		//MIRAMOS LA POSICIÓN CONCRETA
		System.out.println(lista.get(5));
		
		System.out.println(lista.isEmpty());
		
		// NOS DICE SI EXISTE EL STRING EN CONCRETO DENTRO DEL ARRAYLIST
		// SI SALE -1 ES QUE NO ESTÁ. 
		
		System.out.println(lista.indexOf("Pol")); // da -1 pq lo borramos
		System.out.println(lista.indexOf("Josep Maria"));
		
		// String listaCompleta = lista.toString();
		
		//ORDENACIÓN DEL ARRAY. OJO, MODIFICA EL ARRAY. 
		Collections.sort(lista);
		
		System.out.println(lista.toString());
		
		//ITERATOR - FORMA ÚTIL PARA RECORRER UN ARRAYLIST. 
		// CREACIÓN DEL ITERATOR, DE TIPO STRING, LLAMADO IT.
		
		Iterator<String> it = lista.iterator();
		
		String objeto;
		while (it.hasNext()) {
			objeto = it.next();
			System.out.println(objeto);
		}
		
	}

}





// Los arraylist serían un tipo de array más completo

// ¿Cómo hacemos un array simple?
// EJEMPLO ARRAY NORMAL 
	// LIMITADO AL PONERLE TAMAÑO. SI ES DE 5, SIEMPRE SERÁ 5.
/*int array[] = {1, 2, 3, 4};
String arrayStrings[] = new String[5];

arrayStrings[1] = "Leo";
arrayStrings[2] = "Ferran";
arrayStrings[3] = "Miriam";

array[2] = 10;

System.out.println(Arrays.toString(arrayStrings));
System.out.println(Arrays.toString(array)); 
}
*/ 

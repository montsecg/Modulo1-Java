package Abril20;

import java.util.Enumeration;
import java.util.Hashtable;

public class ClaseHashtable {

	// Un hashtable es una estructura de datos que utiliza
	// una funcion para identificar datos mediante una clave
	
	// ej-> nombre Persona. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PRIMERO, DEFINIMOS EL HASHTABLE (ESPECIFICAMOS QUE SERÁ CLAVE STRING, VALOR STRING). 
		Hashtable<String, String> contenedor=new Hashtable<String, String>();
		
		//AÑADIMOS ELEMENTOS
		            // CLAVE  // VALOR
		contenedor.put("101", "Harry Potter");
		contenedor.put("102", "James Bond");
		contenedor.put("103", "Ash Ketchum");
		contenedor.put("104", "Violeta");
		contenedor.put("105", "Brienne");
		contenedor.put("106", "Sherlock Holmes");
		contenedor.put("107", "Kenshin");
		contenedor.put("108", "Pol");
		
		// System.out.println(contenedor.get("101"));
		
		//¿CÓMO LO RECORREMOS? 
		//MEDIANTE LA CLASE ENUMERATION
		
		//PARA RECORRER LOS VALORES!
		Enumeration<String> enumeration = contenedor.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println("VALORES: " + enumeration.nextElement());
		}
		
		// PARA RECORRER CLAVES, UTILIZAMOS EL MÉTODO KEY()
		
		Enumeration<String> claves = contenedor.keys();
		while (claves.hasMoreElements()) {
			System.out.println("CLAVES: " + claves.nextElement());
		}
		
	
	}

}

package DatosTeclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosArrays {

	public static void main(String[] args) {
	// throws IOException {
		// TODO Auto-generated method stub
/*
		// EJERCICIO 1 - EVA
		
		ArrayList<String> listaColores = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// BUCLE QUE NOS PEDIRÁ DIEZ COLORES
		for (int i = 0; i < 9; i++) {
			System.out.print("Dime un color: ");
			String nombre = br.readLine();
			listaColores.add(nombre);
		}
		
		// EJEMPLO DE AÑADIR COLORES MANUALMENTE 
	/*
        listaColores.add("Blanco");
        listaColores.add("Amarillo");
        listaColores.add("Rojo");
        listaColores.add("Azul");
        listaColores.add("Marrón");
        listaColores.add("Negro");
        listaColores.add("Violeta");
        listaColores.add("Naranja");
        listaColores.add("Turquesa");
        listaColores.add("Rosa");

        String listaCompleta = listaColores.toString();
        System.out.println("Esto son los colores: " + listaCompleta);
        
        // CONDICIONAL PARA SABER SI UN COLOR EXISTE O NO EN EL ARRAYLIST. 
        
        System.out.println("¿De qué color quieres pintar la casa?");
        String decision = br.readLine();
        
        if(listaColores.indexOf(decision) == -1) System.out.println("Lo siento, ese color no lo tenemos. Lo tendríamos que pedir");
        else System.out.println("Perfecto: pintaremos del color... " + decision);

         */
 
	// EJERCICIO 2 - 

		
		Scanner scanner = new Scanner (System.in);

		System.out.println("Dime un nombre: (será el elemento 0)");
		String elem0 = scanner.nextLine().toLowerCase();

		System.out.println("Dime otro nombre: (será el elemento 1)");
		String elem1 = scanner.nextLine().toLowerCase();

		System.out.println("Dime un último elemento: (será el elemento 2)");
		String elem2 = scanner.nextLine().toLowerCase();

		ArrayList<String> lista = new ArrayList<>();

		lista.add(elem0);
		lista.add(elem1);
		lista.add(elem2);
		
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		System.out.println(lista.get(0));
		/*
		for (Object o : lista) {
		System.out.println(o);

		} */



		}


}


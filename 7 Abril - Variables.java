package pruebas;

import java.util.Arrays;

public class Hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((5 > 3) && (8 > 5));
		                         //AND (Y). 
		                     
		System.out.println((5 < 3) || (8 > 5));
		                         //OR (o).
		
		System.out.println(!(5 < 3));
                            
		
		
		boolean vamosOperar = (2 >= 2);
		//System.out.println(vamosOperar);
		
		double resultado = (double) (32.5 + 10);
		System.out.println(resultado);
		
		
		String estudiante1 = "Grace";
		String estudiante2 = "Fye";
		String estudiante3 = "Jessica";
		String estudiante4 = "Eva";
		
		String listaEstudiantes[] = new String[5];
		
		String tablero[][] = new String[4][4];
		tablero[3][3] = "Rey negro";
		tablero[2][1] = "Reina blanca";
		tablero[0][1] = "Peón";
		
		
		listaEstudiantes[0] = "Fye"; 
		listaEstudiantes[1] = "Pol";
		
		// listaEstudiantes ---> {"Fye", "Pol", null, null, null};
		
		System.out.println(listaEstudiantes[3]);
		System.out.println(Arrays.toString(listaEstudiantes));
		
		
		String lista[] = {"Grace", "Fye", "Jessica", "Maria"};
		
		//System.out.println(lista[3]);
		
	
		
		
		
	}

}

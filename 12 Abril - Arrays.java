
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DECLARO ARRAY DE 10 POSICIONES, SIN ESPECIFICAR LO QUE HAY. POR DEFECTO, INT SE RELLENA DE 0
		// STRING SE RELLENA DE NULL. 
		int num[] = new int[10];
		
		//System.out.println(num[1]);

		String listaClase[] = new String[20];
		listaClase[1] = "Pol";
		listaClase[2] = "Grace lesionado, que te recuperes pronto";
		listaClase[5] = "Eva";
		
		// System.out.println(listaClase[1]);
		
		              //[0][1][2][3][4]
		int numeros[] = {5, 6, 5, 1, 3};
		numeros[1] = 10;

		// VAMOS A RECORRER ESTOS ARRAYS. ¿CÓMO? CON EL BUCLE FOR. 
		// RECORREMOS PRIMERO LA INT NUM[].
		for (int i = 0; i < numeros.length; i++) {
			//System.out.println(numeros[i]);
		}
		
		for (int i = 0; i < listaClase.length; i++) {
			//System.out.println(listaClase[i]);
		}
		
		// ARRAYS BIDIMENSIONALES O MATRICES
		// Definimos un array de 3 filas x 5 columnas
		int array[][] = new int [3][5];
		
		// Asignamos un 5 al array, en la fila 0 columna 1
		array[0][1] = 5;
		                        
		int bidimensional[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		//System.out.println(bidimensional[0][4]);
		
		for (int i = 0; i < bidimensional.length; i++) {
			for (int j = 0; j < bidimensional[i].length; j++) {
				System.out.print(bidimensional[i][j]);
			}
			System.out.println("");
			
		}
		
		// RECORREMOS PRIMERA COLUMNA DE TODAS LAS FILAS
		for (int i = 0; i < bidimensional.length; i++) {
		//	System.out.println(bidimensional[i][0]);
		}
		
		// RECORREMOS TODAS LAS COLUMNAS DE LA SEGUNDA FILA
				for (int i = 0; i < bidimensional[0].length; i++) {
					System.out.println(bidimensional[2][i]);
				}
				
		
	}

}

package ObjetosJuevesSanto;

public class pruebas {

	public static void main(String[] args) {

		int A[] = { 502, 262222, 7222, 92, 15, 27 };
		seleccion(A);

	}

	public static void seleccion(int A[]) {
		int i, j, menor, pos, tmp;

		// el primer elemento lo consideramos el menor del grupo
		// guardamos su posición y buscamos en el resto del array algún elemento menor
		// que el actual

		for (i = 0; i < A.length - 1; i++) {
			menor = A[i];
			pos = i;
			for (j = i + 1; j < A.length; j++) {
				if (A[j] < menor) {
					menor = A[j];
					pos = j;
				}
				// si hay algun elemento menor se intercambia
			}
			if (pos != i) {
				tmp = A[i];
				A[i] = A[pos];
				A[pos] = tmp;
			}
			System.out.println(A[i]);
		}

	}

	}

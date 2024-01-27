package bidimensionales;

import java.util.Random;

public class Ejercicio03 {

	// ENTRADA: Tabla bidimensional de números enteros
	public static void bidimensionalModificado(int tabla[][]) {
		// Modificamos la tabla dada en el parámetro
		// Bucle for que recorre cada fila (desde 0 hasta tabla.lengt)
		for (int n = 0; n < tabla.length; n++) {
			// Bucle for que recorre cada columna (desde 0 hasta tabla[n].lengt)
			for (int m = 0; m < tabla[n].length; m++) {
				// Modifica cada elemento de la tabla del parámetro mediante esta fórmula
				tabla[n][m] = 10 * n + m;
			}
		}
	}

	public static void main(String[] args) {
		// CONSTANTES
		// Cantidad de filas: 5
		final int CANT_FILAS = 5;
		// Cantidad de columnas: 5
		final int CANT_COLUMNAS = 5;

		// Creamos una tabla bidimensional
		int tabla[][] = new int[CANT_FILAS][CANT_COLUMNAS];

		// Creamos un objeto de tipo Random
		Random r = new Random();

		// Asignamos valores a la tabla
		// Bucle for que recorre las filas de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Bucle for que recorre las columnas de cada fila
			for (int j = 0; j < tabla[i].length; j++) {
				// Asignamos a cada elemento de la tabla un número aleatorio del 1 al 9
				tabla[i][j] = r.nextInt(1, 10);
			}
		}

		// Mostramos la tabla original
		System.out.println("TABLA ORIGINAL");
		// Bucle for-each que recorre las filas de la tabla
		for (int[] fila : tabla) {
			// Bucle for-each que recorre las columnas de cada fila
			for (int elemento : fila) {
				// Mostramos el elemento correspondiente seguido de un tabulador
				System.out.print(elemento + "\t");
			}
			// Salto de línea para cada fila
			System.out.println();
		}

		// Salto de línea para cada tabla
		System.out.println();

		// Modificamos la tabla llamando a la función que hemos creado
		Ejercicio03.bidimensionalModificado(tabla);

		// Mostramos la tabla modificada
		System.out.println("TABLA MODIFICADA");
		// Bucle for-each que recorre las filas de la tabla
		for (int[] fila : tabla) {
			// Bucle for-each que recorre las columnas de cada fila
			for (int elemento : fila) {
				// Mostramos el elemento correspondiente seguido de un tabulador
				System.out.print(elemento + "\t");
			}
			// Salto de línea para cada fila
			System.out.println();
		}
	}

}

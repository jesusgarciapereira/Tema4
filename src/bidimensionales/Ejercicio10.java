package bidimensionales;

import java.util.Random;

public class Ejercicio10 {
	// CONSTANTES
	// Número de filas de la tabla: 4
	public final static int CANT_FILAS = 4;
	// Número de columnas de la tabla: 4
	public final static int CANT_COLUMNAS = 4;

	// ENTRADA: Tabla bidimensional de números enteros
	// SALIDA: La tabla del parámetro girada 90 grados
	public static int[][] gira90(int tablaInicio[][]) {
		// Creamos la tabla que devolverá la función, con las mismas longitudes que la
		// del parámetro
		int tablaGirada[][] = new int[tablaInicio.length][tablaInicio[0].length];

		// Si el número de filas es igual al número de columnas en la tabla girada
		if (tablaGirada.length == tablaGirada[0].length) {
			// Asignamos los valores a la tabla girada
			// Bucle for que recorre cada fila de la tabla
			for (int i = 0; i < tablaGirada.length; i++) {
				// Bucle for que recorre cada columna de la fila
				for (int j = 0; j < tablaGirada[i].length; j++) {
					// Aplicamos este algoritmo para todos los elementos de la tabla girada
					tablaGirada[j][tablaGirada.length - 1 - i] = tablaInicio[i][j];
				}
			}
			// En caso contrario
		} else 
			// Mostrará este mensaje y la tabla girada sólo estará formada por ceros
			System.out.println("No se puede girar 90 grados esta tabla");
		
		// Devuelve la tabla que hemos creado
		return tablaGirada;
	}

	public static void main(String[] args) {

		// Tabla girada
		int tablaGirada[][];

		// Creamos la tabla que giraremos 90 grados
		int tablaNormal[][] = new int[CANT_FILAS][CANT_COLUMNAS];

		// Creamos un objeto de tipo Random
		Random r = new Random();

		// Asignamos los valores a la tabla normal
		// Bucle for que recorrerá cada fila de la tabla
		for (int i = 0; i < tablaNormal.length; i++) {
			// Bucle for que recorrerá cada columna de la fila
			for (int j = 0; j < tablaNormal[i].length; j++) {
				// Asinamos a cada elemento de la tabla un número aleatorio entre 1 y 20
				tablaNormal[i][j] = r.nextInt(1, 21);
			}
		}

		// Mostramos la tabla normal
		System.out.println("TABLA NORMAL");
		// Bucle for-each que recorrerá cada fila de la tabla normal
		for (int[] filas : tablaNormal) {
			// Bucle for-each que recorrerá cada columna de la fila
			for (int valor : filas) {
				// Muestra el valor del elemento seguido de un tabulador
				System.out.print(valor + "\t");
			}
			// Salto de línea para cada fila
			System.out.println();
		}

		// Salto de línea
		System.out.println();

		// Llamamos a la función que hemos creado y se la asignamos a la tabla
		// girada
		tablaGirada = Ejercicio10.gira90(tablaNormal);

		// Mostramos la tabla transpuesta
		System.out.println("TABLA GIRADA");
		// Bucle for-each que recorrerá cada fila de la tabla normal
		for (int[] filas : tablaGirada) {
			// Bucle for-each que recorrerá cada columna de la fila
			for (int valor : filas) {
				// Muestra el valor del elemento seguido de un tabulador
				System.out.print(valor + "\t");
			}
			// Salto de línea para cada fila
			System.out.println();
		}
	}
}

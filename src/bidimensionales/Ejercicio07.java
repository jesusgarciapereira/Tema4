package bidimensionales;

import java.util.Random;

public class Ejercicio07 {
	// CONSTANTES
	// Número de filas de la tabla: 4
	public final static int CANT_FILAS = 4;
	// Número de columnas de la tabla: 4
	public final static int CANT_COLUMNAS = 4;
	
	// ENTRADA: Tabla bidimensional
	// SALIDA: La tabla del parámetro pero transpuesta
	public static int[][] tablaTranspuesta(int tabla[][]) {
		// Creamos una tabla de dimensión inversa a la tabla del parámetro
		int tablaTranspuesta[][] = new int[tabla[0].length][tabla.length];

		// Asignamos los valores a la tabla creada
		// Bucle for que recorrerá cada fila de la tabla
		for (int i = 0; i < tablaTranspuesta.length; i++) {
			// Bucle for que recorrerá cada columna de la fila
			for (int j = 0; j < tablaTranspuesta[i].length; j++) {
				// Asignamos a todos los elementos la transposición de la tabla del parámetro
				tablaTranspuesta[i][j] = tabla[j][i];
			}
		}

		return tablaTranspuesta;
	}

	public static void main(String[] args) {

		// Tabla transpuesta
		int tablaTranspuesta[][];

		// Creamos la tabla que transpondremos
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
		
		//Salto de línea
		System.out.println();
		
		// Llamamos a la función que hemos creado y se la asignamos a la tabla
		// transpuesta
		tablaTranspuesta = Ejercicio07.tablaTranspuesta(tablaNormal);

		// Mostramos la tabla transpuesta
		System.out.println("TABLA TRANSPUESTA");
		// Bucle for-each que recorrerá cada fila de la tabla normal
		for (int[] filas : tablaTranspuesta) {
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

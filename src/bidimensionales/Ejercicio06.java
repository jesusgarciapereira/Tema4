package bidimensionales;

import java.util.Random;

public class Ejercicio06 {
	// CONSTANTES
	// Número de filas de la tabla: 6
	public static final int CANT_FILAS = 6;
	// Número de columnas de la tabla: 10
	private static final int CANT_COLUMNAS = 10;

	// ENTRADA: Tabla bidimensional de números enteros
	// SALIDA: Tabla unidimensional de longitud 2 con el valor mínimo y el valor
	// máximo de la tabla del parámetro
	public static int[] minimoMaximo(int tabla[][]) {
		// Variable del valor mínimo (inicializado como MAX_VALUE) que asignaremos a la
		// tabla que devolverá la función
		int valorMin = Integer.MAX_VALUE;
		// Variable del valor máximo (inicializado como MIN_VALUE) que asignaremos a la
		// tabla que devolverá la función
		int valorMax = Integer.MIN_VALUE;
		// Creamos la tabla unidimensional que contendrá esas dos variables
		int minMax[] = new int[2];

		// Recorremos la tabla del parámetro para encontrar los números mínimo y máximo
		// Bucle for que recorrerá todas las filas de la tabla del parámetro
		for (int i = 0; i < tabla.length; i++) {
			// Bucle for que recorrerá todas las columnas de cada fila
			for (int j = 0; j < tabla[i].length; j++) {
				// Si el valor mínimo es mayor que el elemento en el que estemos
				if (valorMin > tabla[i][j])
					// Lo asignaremos al valor mínimo
					valorMin = tabla[i][j];
				// Si el valor máximo es menor que el elemento en el que estemos
				if (valorMax < tabla[i][j])
					// Lo asignaremos al valor máximo
					valorMax = tabla[i][j];
			}
		}

		// Asignamos los valores a la tabla que devolverá el método
		minMax[0] = valorMin;
		minMax[1] = valorMax;

		// Devolverá la tabla minMax
		return minMax;
	}

	public static void main(String[] args) {

		// Tabla unidimensional con el mínimo y el máximo
		int minMax[];

		// Creamos la tabla
		int numeros[][] = new int[CANT_FILAS][CANT_COLUMNAS];

		// Creamos un objeto de tipo Random
		Random r = new Random();

		// Asignamos los valores a la tabla
		// Bucle for que recorrerá cada fila de la tabla
		for (int i = 0; i < numeros.length; i++) {
			// Bucle for que recorrerá cada columna de la fila
			for (int j = 0; j < numeros[i].length; j++) {
				// Asinamos a cada elemento de la tabla un número aleatorio entre 0 y 1000
				numeros[i][j] = r.nextInt(0, 1001);
			}
		}

		// Mostramos la tabla
		// Bucle for-each que recorrerá cada fila de la tabla
		for (int[] filas : numeros) {
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

		// Asignamos a la tabla minMax la tabla que nos devolverá la función que hemos
		// creado
		minMax = Ejercicio06.minimoMaximo(numeros);

		// Mostramos los dos valores que contiene
		System.out.println("El número mínimo en esta tabla es: " + minMax[0]);
		System.out.println("El número máximo en esta tabla es: " + minMax[1]);
	}

}

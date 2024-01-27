package bidimensionales;

public class Ejercicio09 {
	// ENTRADA: Tabla bidimensional
	// SALIDA: True si la tabla del parámetro es un mágica, false en caso contrario
	public static boolean esMagica(int tabla[][]) {
		// Variable de tipo boolean que devolverá la función (inicializada como true)
		boolean esMagica = true;

		// Suma de todos los elementos de la primera fila (inicializada en 0)
		int sumatorioPrimerafila = 0;

		// Suma de todos los elementos de la fila actual
		int sumatorioFilaActual;
		// Suma de todos los elementos de la columna actual
		int sumatorioColumnaActual;

		// Bucle for para recorrer la primera fila de la tabla
		for (int j = 0; j < tabla[0].length; j++) {
			// Asignamos a sumatorioPrimerafila la suma de todos los elementos de la primera
			// fila
			sumatorioPrimerafila += tabla[0][j];
		}
		// Bucle for para recorrer el resto de filas de la tabla
		for (int i = 1; i < tabla.length; i++) {
			// Al principio de cada iteración asignamos sumatorioFilaActual a 0
			sumatorioFilaActual = 0;
			// Bucle for para recorrer las columnas de la fila
			for (int j = 0; j < tabla[i].length; j++) {
				// Asignamos a sumatorioFilaActual la suma de todos los elementos de la fila
				sumatorioFilaActual += tabla[i][j];
			}
			// Si el sumatorio de la primera fila es distinto del sumatorio de la fila
			// actual
			if (sumatorioPrimerafila != sumatorioFilaActual) {
				// Asignamos esMagica como false
				esMagica = false;
				// Y salimos del bucle
				break;
			}
		}
		// Si esMagica sigue siendo true
		if (esMagica) {
			// Bucle for para recorrer las columnas de la tabla
			for (int j = 0; j < tabla[0].length; j++) {
				// Al principio de cada iteración asignamos sumatorioColumnaActual a 0
				sumatorioColumnaActual = 0;
				// Bucle for para recorrer las filas de la columna
				for (int i = 0; i < tabla.length; i++) {
					// Asignamos a sumatorioColumnaActual la suma de todos los elementos de la
					// columna
					sumatorioColumnaActual += tabla[i][j];
				}
				// Si el sumatorio de la primera fila es distinto del sumatorio de la columna
				// actual
				if (sumatorioPrimerafila != sumatorioColumnaActual) {
					// Asignamos esMagica como false
					esMagica = false;
					// Y salimos del bucle
					break;
				}
			}
		}

		// Devuelve el boolean correspondiente
		return esMagica;
	}

	public static void main(String[] args) {
		// Variable de tipo boolean que indica si una tabla es mágica
		boolean esMagica;

		// Creamos una tabla bidimensional y le asignamos los valores
		int tabla[][] = { { 46, 1, 12, 7 }, { 11, 8, 45, 2 }, { 5, 10, 3, 48 }, { 4, 47, 6, 9 } };

		// Mostramos la tabla
		// Bucle for-each que recorrerá cada fila de la tabla
		for (int[] filas : tabla) {
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

		// Llamamos a la función que hemos creado y se lo asignamos a nuestro boolean
		esMagica = Ejercicio09.esMagica(tabla);

		// Mostramos el resultado
		System.out.println("Esta tabla " + (esMagica ? "es " : "no es ") + "mágica");

	}

}

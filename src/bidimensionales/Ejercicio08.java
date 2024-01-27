package bidimensionales;

public class Ejercicio08 {
	// ENTRADA: Una tabla bidimensional
	// SALIDA: True si la tabla del parámetro es simétrica, false en caso contrario
	public static boolean esSimetrica(int tabla[][]) {
		// Variable de tipo boolean que devolverá la función (inicializada como true)
		boolean esSimetrica = true;

		// Si contiene el mismo número de filas que de columnas
		if (tabla.length == tabla[0].length) {
			// Bucle for que recorrerá cada fila de la tabla
			for (int i = 0; i < tabla.length; i++) {
				// Bucle for que recorrerá cada columna de la fila
				for (int j = 0; j < tabla[i].length; j++) {
					// Si el elemento de la tabla es distinto a su opuesto
					if (tabla[i][j] != tabla[j][i]) {
						// Asignamos el boolean esSimetrica como false
						esSimetrica = false;
						// Y salimos del bucle
						break;
					}
				}
			}
			// En caso contrario
		} else
			// Asignamos el boolean esSimetrica como false
			esSimetrica = false;

		// Devuelve el boolean correspondiente
		return esSimetrica;
	}

	public static void main(String[] args) {
		// Variable de tipo boolean que indica si una tabla es simétrica
		boolean esSimetrica;

		// Creamos una tabla bidimensional y le asignamos los valores
		int tabla[][] = { { 7, -1, 3 }, {- 1, 5, 0 }, { 3, 0, 2 } };

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
		esSimetrica = Ejercicio08.esSimetrica(tabla);

		// Mostramos el resultado
		System.out.println("Esta tabla " + (esSimetrica ? "es simétrica" : "no es simétrica"));
	}

}

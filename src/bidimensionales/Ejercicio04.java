package bidimensionales;

public class Ejercicio04 {

	// Constante representando al número 10
	public static final int DIEZ = 10;

	// ENTRADA: Nada
	// SALIDA: La tablas tablas de multiplicar del 1 al 10
	public static int[][] tablasHastaEl10() {
		// Creamos una tabla bidimensional 10x10
		int tablasHastaEl10[][] = new int[DIEZ][DIEZ];

		// Asignamos los valores a la tabla
		// Bucle for que recorre las filas de la tabla
		for (int i = 0; i < tablasHastaEl10.length; i++) {
			// Bucle for que recorre las columnas de cada fila
			for (int j = 0; j < tablasHastaEl10[i].length; j++) {
				// Asignamos a cada elemento el producto de su posición más 1
				tablasHastaEl10[i][j] = (i + 1) * (j + 1);
			}
		}
		// Devolvemos la tabla creada
		return tablasHastaEl10;
	}

	public static void main(String[] args) {

		// Asignamos a tablasHastaEl10[][] la tabla llamada en la función que hemos
		// creado
		int tablasHastaEl10[][] = Ejercicio04.tablasHastaEl10();

		// Mostramos la tabla a nuestro gusto
		// Bucle for que recorre las filas de la tabla
		for (int i = 0; i < tablasHastaEl10.length; i++) {
			// Bucle for que recorre las columnas de cada fila
			for (int j = 0; j < tablasHastaEl10[i].length; j++) {
				// Mostramos cada operación de multiplicar junto con cada elemento de la tabla
				System.out.print((i + 1) + " * " + (j + 1) + " = " + tablasHastaEl10[i][j] + "\t");
			}
			// Salto de línea para cada fila (cada tabla de multiplicar)
			System.out.println();
		}

	}

}

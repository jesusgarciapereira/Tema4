package bidimensionales;


import java.util.Random;

public class Ejercicio05 {
	// ENTRADA: Nada
	// SALIDA: Una tabla bidimensional 4x5 formada por 20 números enteros aleatorios
	// entre 100 y 999
	public static int[][] tabla20Aleatorios() {

		// Creamos la tabla que devolverá la función
		int tabla[][] = new int[4][5];

		// Creamos un objeto de tipo Random
		Random r = new Random();

		// Asignamos los valores a la tabla
		// Bucle for que recorrerá cada fila de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Bucle for que recorrerá cada columna de la fila
			for (int j = 0; j < tabla[i].length; j++) {
				// Asinamos a cada elemento de la tabla un número aleatorio entre 100 y 999
				tabla[i][j] = r.nextInt(100, 1000);
			}

		}

		// Devolverá la tabla creada
		return tabla;

	}

	public static void main(String[] args) {

		// Sumatorios de cada fila y de cada columna
		int sumatorioFila;
		int sumatorioColumna;

		// Sumatorio de todos los elementos (inicializado en 0)
		int sumatorioTotal = 0;

		// Asignamos a calculo[][] la tabla llamada en la función que hemos creado
		int calculo[][] = Ejercicio05.tabla20Aleatorios();

		// Mostramos la tabla calculo incluyendo el sumatorio de cada fila
		// Bucle for que recorerá cada fila de la tabla
		for (int i = 0; i < calculo.length; i++) {
			// Al principio de cada iteración inicializamos el sumatorio de la fila en 0
			sumatorioFila = 0;
			// Bucle for que recorrerá cada columna de la fila
			for (int j = 0; j < calculo[i].length; j++) {
				// Mostramos cada elemento de la tabla
				System.out.print(calculo[i][j] + "\t\t\t");
				// Asignamos al sumatorio de la fila la suma de todos los elementos de la fila
				sumatorioFila += calculo[i][j];
			}
			// Al final de cada fila mostraremos el sumatorio de cada una (con salto de
			// línea)
			System.out.println("\u2211 fila " + i + " = " + sumatorioFila);
		}

		// Mostramos la fila extra con los sumatorios de las columnas y el total
		// Bucle for que recorrerá cada columna de la tabla
		for (int j = 0; j < calculo[0].length; j++) {
			// Al principio de cada iteración inicializamos el sumatorio de la columna en 0
			sumatorioColumna = 0;
			// Bucle for que recorerá cada fila de la columna
			for (int i = 0; i < calculo.length; i++) {
				// Asignamos al sumatorio de la columna la suma de todos los elementos de la
				// columna
				sumatorioColumna += calculo[i][j];
			}
			// Mostramos el sumatorio de todas las columnas
			System.out.print("\u2211 columna " + j + " = " + sumatorioColumna + "\t");
			// Asignamos al sumatorio total la suma de todos los sumatorios de cada columna
			sumatorioTotal += sumatorioColumna;
		}
		
		// Por último, mostramos el sumatorio total
		System.out.println("TOTAL = " + sumatorioTotal);
	}

}

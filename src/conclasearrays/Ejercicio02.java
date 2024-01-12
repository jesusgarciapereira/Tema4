package conclasearrays;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Número de la posición inicial en la que agrego un valor
		int posicionInicial = 0;

		// Número de la posición final en la que agrego un valor
		int posicionFinal = 0;

		// Creamos la tabla
		int tabla[] = new int[55];

		// Bucle for del 1 al 10 (los valores que tendrá la tabla)
		for (int valor = 1; valor <= 10; valor++) {
			// A la posición inicial le asignamos la posición final actual
			posicionInicial = posicionFinal;
			// A la posición final le asignamos ahora la posición inicial más el valor que añadiremos
			posicionFinal = posicionInicial + valor;
			// Asignamos a la tabla los correspondientes valores
			Arrays.fill(tabla, posicionInicial, posicionFinal, valor);
		}

		// Mostramos la tabla
		System.out.println(Arrays.toString(tabla));
	}

}

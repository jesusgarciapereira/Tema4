package bidimensionales;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos una tabla bidimensional de 3 filas y 6 columnas
		int tabla[][] = new int[3][6];

		// Asignamos los valores que pide el ejercicio
		tabla[0][0] = 0;
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 5;
		tabla[1][0] = 75;
		tabla[1][4] = 0;
		tabla[2][2] = -2;
		tabla[2][3] = 9;
		tabla[2][5] = 11;

		// For-each que recorre cada fila de la tabla
		for (int[] fila : tabla) {
			// For-each que recorre cada elemento de la fila
			for (int valor : fila) {
				// Muestra el valor del elemento seguido de un tabulador
				System.out.print(valor + "\t");
			}
			// Salto de línea
			System.out.println();
		}

	}

}

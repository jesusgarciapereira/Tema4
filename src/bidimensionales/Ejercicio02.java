package bidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// CONSTANTES
		// Número de alumnos: 4
		final int CANT_ALUMNOS = 4;
		// Número de notas: 5
		final int CANT_NOTAS = 5;

		// VARIABLES
		// Nota mínima, nota máxima, suma de notas y nota media que calcularemos
		int notaMin;
		int notaMax;
		int sumaNotas;
		double notaMedia;

		// TABLA
		// Creamos una tabla bidimensional para los alumnos y sus notas
		int notasAlumnos[][] = new int[CANT_ALUMNOS][CANT_NOTAS];

		// Actibamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Asignamos los valores de notasAlumnos
		// Bucle for que recorre las filas (alumnos)
		for (int i = 0; i < CANT_ALUMNOS; i++) {
			// Bucle for que recorre las columnas (notas)
			for (int j = 0; j < CANT_NOTAS; j++) {
				// Le pedimos al usuario la nota j del alumno i (quiero que se muestren en la
				// petición las posiciones + 1 )
				System.out.println("Introduzca la nota " + (j + 1) + " del Alumno " + (i + 1));
				// Y asignamos el número dado en la tabla
				notasAlumnos[i][j] = sc.nextInt();
			}
			// Salto de línea al rellenar las notas de un alumno
			System.out.println();
		}

		// Mostramos la tabla de las notas de los alumnos
		// Primera fila con el encabezado "Notas"
		System.out.println("\t\t\t  Notas");
		// Bucle for que recorre cada fila de la tabla
		for (int i = 0; i < CANT_ALUMNOS; i++) {
			// Muestra el nombre del alumno seguido de un tabulador
			System.out.print("'Alumno " + (i + 1) + "'\t");
			// Bucle for que recorre cada elemento de la fila
			for (int j = 0; j < CANT_NOTAS; j++) {
				// Muestra el elemento de la tabla notasAlumnos seguido de un tabulador
				System.out.print(notasAlumnos[i][j] + "\t");
			}
			// Salto de línea
			System.out.println();
		}

		// Salto de línea
		System.out.println();

		// Bucle for que recorre cada fila (alumnos)
		for (int i = 0; i < CANT_ALUMNOS; i++) {
			// En cada iteración del bucle, inicializamos las variables en 0 para así poder
			// reutilizarlas
			notaMin = 0;
			notaMax = 0;
			sumaNotas = 0;
			notaMedia = 0;
			// Aplicamos el método sort() para ordenar cada fila
			Arrays.sort(notasAlumnos[i]);
			// Asignamos a la nota mínima el valor de la primera posición de la fila
			notaMin = notasAlumnos[i][0];
			// Asignamos a la nota máxima el valor de la última posición de la fila
			notaMax = notasAlumnos[i][CANT_NOTAS - 1];
			// Bucle for que recorre cada columna (notas)
			for (int j = 0; j < CANT_NOTAS; j++) {
				// Asignamos a sumaNotas la suma de todas las notas de un alumno
				sumaNotas += notasAlumnos[i][j];
			}
			// Calculamos la nota media del alumno (lo casteamos para que muestre decimales)
			notaMedia = (double) sumaNotas / CANT_NOTAS;

			// Y mostramos los resultados de cada alumno
			System.out.println("La nota más baja del Alumno " + (i + 1) + " es: " + notaMin);
			System.out.println("La nota más alta del Alumno " + (i + 1) + " es: " + notaMax);
			System.out.println("La nota media del Alumno " + (i + 1) + " es: " + notaMedia);
			// Salto de línea para separar los resultados de cada alumno
			System.out.println();
		}

		// Cerramos el Scanner
		sc.close();

	}

}

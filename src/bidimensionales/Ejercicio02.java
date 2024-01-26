package bidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Número de alumnos: 4
		int cantAlumnos = 4;
		// Número de notas: 5
		int cantNotas = 5;
		
		// Nota mínima, nota máxima y nota media que calcularemos
		int notaMin;
		int notaMax;
		int notaMedia;
		
		// Creamos una tabla bidimensional para los alumnos y sus notas
		int notasAlumnos[][] = new int[cantAlumnos][cantNotas];

		// Actibamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorre las filas (alumnos)
		for (int i = 1; i < cantAlumnos + 1; i++) {
			// Bucle for que recorre las columnas (notas)
			for (int j = 1; j < cantNotas + 1; j++) {
				System.out.println("Introduzca la nota " + j + " del Alumno " + i);
				notasAlumnos[i][j] = sc.nextInt();
			}
		}
		// Bucle for que recorre cada fila
		for (int i = 0; i < cantAlumnos; i++) {
			// Aplicamos el método sort() en cada fila
			Arrays.sort(notasAlumnos[i]);
			notaMin = notasAlumnos[i][0];
			notaMax = notasAlumnos[i][cantNotas];
		}
		// For-each que recorre cada fila de la tabla
		for (int[] fila : notasAlumnos) {
			// For-each que recorre cada elemento de la fila
			for (int valor : fila) {
				// Muestra el valor del elemento seguido de un tabulador
				System.out.print(valor + "\t");
			}
			// Salto de línea
			System.out.println();
		}

		// Cerramos el Scanner
		sc.close();

	}

}

package conclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos nuestra tabla de puntuaciones
		int puntuaciones[] = new int[8];

		// Creamos nuestra tabla de puntuaciones en orden descendente
		int puntuacionesDescendentes[] = new int[8];
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorrerá toda la tabla de puntuaciones
		for (int i = 0; i < puntuaciones.length; i++) {
			// Le pedimos al usuario que introduzca la puntuación de cada jugador
			System.out.println("Introduzca la puntuación del jugador");
			// Y lo asignamos a la posición correspondiente de la tabla
			puntuaciones[i] = sc.nextInt();
		}

		// Mostramos la tabla de puntuaciones tal y como fue creada
		System.out.println("PUNTUACIONES SIN ORDENAR");
		System.out.println(Arrays.toString(puntuaciones));

		// Ordenamos la tabla de puntuaciones con el método sort()
		Arrays.sort(puntuaciones);
		
		// Mostramos la tabla de puntuaciones ahora ordenada
		System.out.println("PUNTUACIONES ORDENADAS");
		System.out.println(Arrays.toString(puntuaciones));

		// Bucle for que recorrerá toda la tabla de puntuaciones pero en orden inverso
		for (int i = puntuaciones.length - 1; i >= 0; i--) {
			// A cada valor de las puntuaciones descendentes le asignaremos el valor de las
			// puntuaciones pero en orden inverso
			puntuacionesDescendentes[i] = puntuaciones[puntuaciones.length - 1 - i];
		}

		// Mostramos la tabla de puntuaciones descendientes
		System.out.println("PUNTUACIONES EN ORDEN INVERSO");
		System.out.println(Arrays.toString(puntuacionesDescendentes));

		// Cerramos el Scanner
		sc.close();

	}

}

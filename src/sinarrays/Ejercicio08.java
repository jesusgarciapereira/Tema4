package sinarrays;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Número que le pediremos al usuario
		int num;

		// Creamos nuestra tabla de longitud 100
		int tabla[] = new int[100];

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorrerá la longitud total de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Asigna a cada elemento de la tabla un número aleatorio entre 1 y 10 (ambos
			// inclusive)
			tabla[i] = (int) (1 + Math.random() * 10);
		}
		// Bucle for que recorrerá la longitud total de la tabla
		for (int valor : tabla) {
			// Muestra cada elemento de la tabla
			System.out.print(valor + " ");
		}

		// Salto de línea
		System.out.println();

		// Le pedimos al usuario un número
		System.out.println("Indique un número, enumeraré en qué posiciones del array aparece");
		// Y lo almacenamos
		num = sc.nextInt();

		// Salto de línea
		System.out.println();

		// Bucle for que recorrerá la longitud total de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Si el valor del elemento de la tabla es igual al solicitado por el usuario
			if (tabla[i] == num)
				// Muestra su posición en la tabla
				System.out.print(i + " ");
		}
		// Cerramos el Scanner
		sc.close();
	}

}

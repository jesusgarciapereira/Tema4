package sinarrays;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int num;

		// Creamos una tabla de longitud 10
		int tabla[] = new int[10];

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorrerá la longitud total de la tabla (desde el 0 hasta el
		// valor de la longitud no incluido)
		for (int i = 0; i < tabla.length; i++) {
			// Le pedimos al usuario un número
			System.out.println("Escriba un número entero");
			// Lo almacenamos
			num = sc.nextInt();
			// Y lo asignamos a la tabla en posición indicada
			tabla[i] = num;
		}

		// Mensaje
		System.out.println("He aquí los números introducidos en la tabla (en orden inverso)");

		// Bucle for que recorrerá la longitud total de la tabla pero al revés (desde el
		// valor de la longitud - 1 hasta el 0 ambos inclusive)
		for (int i = tabla.length - 1; i >= 0; i--) {
			// Mostramos cada cada valor de la tabla, separados por un espacio
			System.out.print(tabla[i] + " ");
		}

		// Cerramos el Scanner
		sc.close();

	}

}

package sinarrays;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Declaramos la variable del número que le pediremos al usuario
		double num;

		// Creamos una tabla de longitud 5
		double tabla[] = new double[5];

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Para poder escribir decimales con un punto
		sc.useLocale(Locale.US);

		// Bucle for que recorrerá la longitud total de la tabla (desde el 0 hasta el
		// valor de la longitud no incluido)
		for (int i = 0; i < tabla.length; i++) {
			// Le pedimos al usuario un número
			System.out.println("Escriba un número decimal");
			// Lo almacenamos
			num = sc.nextDouble();
			// Y lo asignamos a la tabla en posición indicada
			tabla[i] = num;
		}

		// Mensaje 
		System.out.println("He aquí los números introducidos en la tabla (en el mismo orden)");
		
		// Bucle for que recorrerá la longitud total de la tabla (desde el 0 hasta el
		// valor de la longitud no incluido)
		for (int i = 0; i < tabla.length; i++) {
			//Mostramos cada cada valor de la tabla, separados por un espacio
			System.out.print(tabla[i] + " ");
		}

		// Cerramos el Scanner
		sc.close();

	}

}

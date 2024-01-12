package sinclasearrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Variable para indicar la temperatura media de cada mes
		int temperaturaMedia;

		// Variables posibles para el nombre del mes en una tabla
		final String MES[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"};

		// Creamos nuestra tabla de longitud 12
		int tabla[] = new int[12];

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorrerá toda la tabla
		for (int i = 0; i < tabla.length; i++) {

			// Le pedimos al usuario un número
			System.out.println("Introduzca la temperatura media de " + MES[i]);
			// Lo almacenamos
			temperaturaMedia = sc.nextInt();
			// Y lo asignamos a la tabla en la posición correspondiente
			tabla[i] = temperaturaMedia;
		}

		// Bucle for que recorrerá toda la tabla
		for (int i = 0; i < tabla.length; i++) {

			// Muestra el mes correspondiente
			System.out.print(MES[i] + "\t");

			// Añade un tabulador más en estos casos
			if (i != 8 && i != 10 && i != 11)
				System.out.print("\t");

			// Mostrará tantos caracteres como valor sea cada elemento de la tabla
			for (int j = 1; j <= tabla[i]; j++) {
				System.out.print("*");
			}
			// Salto de línea
			System.out.println();
		}

		// Cerramos el Scanner
		sc.close();
	}

}

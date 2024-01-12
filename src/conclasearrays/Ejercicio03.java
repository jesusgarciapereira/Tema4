package conclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Variable para indicar si dos tablas son iguales o no
		boolean tablasIguales;
	
		// Creamos dos tablas
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle for para recorrer la primera tabla
		for (int i = 0; i < tabla1.length; i++) {
			// Le pedimos al usuario un número
			System.out.println("Escriba un número");
			// Y lo asignamos a la tabla en la posición correspondiente
			tabla1[i] = sc.nextInt();
		}

		// Bucle for para recorrer la segunda tabla
		for (int i = 0; i < tabla2.length; i++) {
			// Le pedimos al usuario un número
			System.out.println("Escriba un número");
			// Y lo asignamos a la tabla en la posición correspondiente
			tabla2[i] = sc.nextInt();
		}

		// Mostramos el contenido de ambas tablas
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));
		
		// Asignamos el valor de nuestro boolean con el método equals()
		tablasIguales = Arrays.equals(tabla1, tabla2);
		
		// Mostramos el resultado
		System.out.println("Ambas tablas " + (tablasIguales ? "son iguales" : "no son iguales"));
		
		// Cerramos el Scanner
		sc.close();
	}

}

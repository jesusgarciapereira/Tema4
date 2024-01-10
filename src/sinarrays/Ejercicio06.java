package sinarrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int numPedido;

		// Declaramos la variable de tipo String que indica si un número es par o impar
		String parImpar;

		// Creamos nuestra tabla de longitud 10
		int tabla[] = new int[8];

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorrerá toda la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Le pedimos al usuario un número
			System.out.println("Introduzca un número");
			// Lo almacenamos
			numPedido = sc.nextInt();
			// Y lo asignamos a la tabla en la posición correspondiente
			tabla[i] = numPedido;
		}

		// Bucle for que recorrerá toda la tabla
		for (int valor : tabla) {
			// Asignamos al String la palabra concreta según el caso de que sea par o impar
			parImpar = valor % 2 == 0 ? " Par" : " Impar";
			// Mostramos los elementos de la tabla junto con la palabra que proceda
			System.out.println(valor + parImpar);
		}

		// Cerramos el Scanner
		sc.close();
	}

}

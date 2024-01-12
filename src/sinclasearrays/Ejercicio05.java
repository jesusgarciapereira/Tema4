package sinclasearrays;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Declaramos la variable del número que le pediremos al usuario
		double numPedido;

		// Declaramos la variable de la suma de todos los numeros de nuestra tabla
		double sumTabla = 0;

		// Declaramos la variable del número máximo de la tabla
		double maxTabla;

		// Declaramos la variable del número mínimo de la tabla
		double minTabla;

		// Creamos nuestra tabla de longitud 10
		double tabla[] = new double[10];

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Para escribir decimales con un punto
		sc.useLocale(Locale.US);

		// Bucle for que recorrerá toda la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Le pedimos al usuario un número
			System.out.println("Introduzca un número");
			// Lo almacenamos
			numPedido = sc.nextDouble();
			// Y lo asignamos a la tabla en la posición correspondiente
			tabla[i] = numPedido;
		}
		
		// Asignamos al máximo y al mínimo el primer número de la tabla
		maxTabla = tabla[0];
		minTabla = tabla[0];

		// Bucle for que recorrerá toda la tabla
		for (double valor : tabla) {

			// sumTabla será la suma de cada uno de los elementos de la tabla
			sumTabla += valor;

			// Si el número es mayor que el asignado anteriormente se asigna como máximo al
			// siguiente, si no, se conserva el anterior
			maxTabla = valor > maxTabla ? valor : maxTabla;
			// Si el número es menor que el asignado anteriormente se asigna como mínimo al
			// siguiente, si no, se conserva el anterior
			minTabla = valor < minTabla ? valor : minTabla;
		}

		for (double valor : tabla) {
			// Mostramos cada elemento de la tabla
			System.out.print(valor + " ");
		}
		// Salto de línea
		System.out.println();

		// Mostramos los resultados
		System.out.println("Suma de todos los elementos de la tabla: " + sumTabla);
		System.out.println("Número máximo de la tabla: " + maxTabla);
		System.out.println("Número mínimo de la tabla: " + minTabla);

		// Cerramos el Scanner
		sc.close();
	}

}

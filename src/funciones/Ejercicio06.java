package funciones;

import java.util.Arrays;

public class Ejercicio06 {

	// ENTRADA: Una tabla y el número de elementos consecutivos de la tabla que se
	// sumarán
	// SALIDA: Una tabla nueva con los resultados de cada suma realizada
	public static int[] suma(int t[], int numElementos) {
		// Creamos la tabla sumas, cuya longitud será igual a la de la tabla del
		// parámetro menos el número del otro parámetro más 1
		int sumas[] = new int[t.length - numElementos + 1];

		// Bucle for que recorre la tabla sumas
		for (int i = 0; i < sumas.length; i++) {

			// Bucle for que recorre tantos elementos de la tabla como el valor del parámetro
			// indique y siempre empezando desde el índice en el que nos encontremos
			for (int j = i; j < numElementos + i; j++) {
				// Le asignamos a cada elemento de la tabla sumas, la suma de cada valor de la
				// tabla del parámetro
				sumas[i] += t[j];
			}

		}

		// Devuelve la tabla sumas
		return sumas;

	}

	public static void main(String[] args) {

		// Nñumero de elementos consecutivos de la tabla que se sumarán
		int numElementos = 2;

		// Tabla con los resultados de las sumas
		int resultados[];

		// Creamos nuestra tabla (quiero que tenga tamaño 10)
		int aleatorios[] = new int[10];

		// Bucle for que recorrerá toda la tabla
		for (int i = 0; i < aleatorios.length; i++) {
			// Para rellenarla con números aleatorios
			aleatorios[i] = (int) (Math.random() * 10 + 1);
		}

		// Asignamos a la tabla resultados, la tabla que nos devolverá la funcion suma()
		resultados = suma(aleatorios, numElementos);

		System.out.println(Arrays.toString(aleatorios));
		System.out.println();
		System.out.println("Las sumas serán de " + numElementos + " en " + numElementos);
		System.out.println();
		System.out.println(Arrays.toString(resultados));

	}

}

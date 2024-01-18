package funciones;

import java.util.Arrays;

public class Ejercicio05 {

	// ENTRADA: Tabla a consultar y número a buscar dentro de la tabla
	// SALIDA: Tabla que indica todos los índices en donde aparece el valor a
	// buscar en el parámetro
	public static int[] buscarTodos(int t[], int valor) {
		// Declaramos la tabla que devolverá la función
		int posiciones[];
		
		// Creamos la tabla () provisional con las posiciones en donde se encuentra en número
		int posicionesProvisional[] = new int[t.length];

		// Posición en la que asignaremos la posición en la que se encuentra el número
		// encontrado (inicializado en 0)
		int posicionRellenar = 0;

		// Bucle for que recorrerá toda la tabla introducida en el parámetro
		for (int i = 0; i < t.length; i++) {
			// Si el valor de la tabla es igual al valor que buscamos
			if (t[i] == valor) {
				// Asignamos la posicón en la que esté en la tabla de las posiciones
				posicionesProvisional[posicionRellenar] = i;
				// E incrementamos la posición de la tabla posiciones para rellenar en la
				// siguiente posición
				posicionRellenar++;
			}
		}
		// Asignamos sólo los valores rellenados en la tabla provisional a la tabla definitiva
		posiciones = Arrays.copyOf(posicionesProvisional, posicionRellenar);
		
		// Devolverá la tabla con las posiciones
		return posiciones;
	}

	// Función main
	public static void main(String[] args) {
		// Valor que buscaremos en la tabla
		int valor = 10;
		
		// Declaramos la tabla de las posiciones
		int posiciones[];

		// Creamos nuestra tabla (quiero que tenga tamaño 50)
		int aleatorios[] = new int[50];

		// Bucle for que recorrerá toda la tabla
		for (int i = 0; i < aleatorios.length; i++) {
			// Para rellenarla con números aleatorios
			aleatorios[i] = (int) (Math.random() * 15 + 1);
		}
		
		// Mostramos la tabla de aleatorios
		System.out.println(Arrays.toString(aleatorios));
		// Salto de línea
		System.out.println();
		
		// Asignamos los valores a la tabla de las posiciones con el método buscarTodos()
		posiciones = buscarTodos(aleatorios, valor);
		
		// Mostramos el resultado
		System.out.println("El valor " + valor + " se encuentra en las siguientes posiciones");
		// Salto de línea
		System.out.println();
		// Mostramos la tabla de las posiciones
		System.out.println(Arrays.toString(posiciones));
	}

}

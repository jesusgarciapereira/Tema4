package funciones;

import java.util.Arrays;

public class Ejercicio03 {

	// ENTRADA: Longitud de la tabla y número máximo que tendrán los valores de la
	// tabla
	// SALIDA: Tabla creada en esta función
	public static int[] rellenaPares(int longitud, int fin) {
		// Índice de la tabla (inicializada en 0)
		int i = 0;

		// Creamos una tabla con la longitud introducida en el parámetro
		int tabla[] = new int[longitud];

		// Mientras el índice sea menor que la longitud de la tabla
		while (i < tabla.length) {
			// Asignamos a cada elemento un número aleatorio entre 2 y el parámetro
			// introducido
			tabla[i] = (int) (Math.random() * (fin - 1) + 2);
			// Si dicho valor es par
			if (tabla[i] % 2 == 0)
				// Incrementamos el ínice
				i++;
		}
		// Devolverá nuestra tabla creada
		return tabla;
	}

	// Función main
	public static void main(String[] args) {
		// Declaramos una tabla
		int tabla[];
		// Le asignamos uno valores llamando a la función rellenaPares
		tabla = rellenaPares(10,23);
		// Mostramos la tabla
		System.out.println(Arrays.toString(tabla));
		
	}

}

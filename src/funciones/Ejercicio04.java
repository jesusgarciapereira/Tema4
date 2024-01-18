package funciones;

import java.util.Arrays;

public class Ejercicio04 {

	// ENTRADA: Tabla a consultar y número a buscar dentro de la tabla
	// SALIDA: Posición en la que se encuentra el número introducido en el parámetro
	// (si no lo encuentra, devuelve -1)
	public static int buscar(int t[], int clave) {
		// Posición en la que se encuentra el número que buscamos (inicializado en 0)
		int posicionEncontrado = 0;

		// Bucle while para hacer una búsqyeda secuencial en la tabla
		while (posicionEncontrado < t.length && t[posicionEncontrado] != clave)
			// Mientras la posición sea menor que la longitud de la tabla y no encuentre la
			// clave del parámetro, incrementa la posición
			posicionEncontrado++;

		// Si la posición es igual a la longitud de la tabla
		if (posicionEncontrado == t.length)
			// Le asignaremos -1
			posicionEncontrado = -1;

		// Devolverá la posición en la que se encuentra
		return posicionEncontrado;
	}

	// Función main
	public static void main(String[] args) {
		// Número a encontrar en la tabla
		int clave = 7;
		// Posición del número encontrado
		int posicionEncontrado;
		// Creamos nuestra tabla (quiero que tenga tamaño 10)
		int tabla[] = new int[10];

		// Bucle for que recorrerá toda la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Para rellenarla con números aleatorios
			tabla[i] = (int) (Math.random() * 50 + 1);
		}
		
		// Mostramos la tabla
		System.out.println(Arrays.toString(tabla));
		
		// Le asignamos a la posición del número encontrado el valor que nos devuelva la
		// función buscar()
		posicionEncontrado = buscar(tabla, clave);
		
		// Mostramos el resultado según cada caso
		if(posicionEncontrado == -1)
			System.out.println("El número " + clave + " no se encuentra en la tabla");
		else
			System.out.println("El número " + clave + " se encuentra en la posición " + posicionEncontrado);
		

	}

}

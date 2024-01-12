package sinclasearrays;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Creamos nuestra tabla de longitud 10
		int tabla[] = new int[10];

		// Creamos un objeto de tipo Random para generar números aleatorios
		Random r = new Random();

		// Bucle for que recorrerá la longitud total de la tabla (desde el 0 hasta el
		// valor de la longitud no incluido)
		for (int i = 0; i < tabla.length; i++) {
			//Asigna un valor aleatorio entre 1 y 100 a cada elemento de la tabla
			tabla[i] = r.nextInt(1, 101);
			//Y te muestra cada uno, separados por un espacio
			System.out.print(tabla[i] + " ");
		}

	}

}

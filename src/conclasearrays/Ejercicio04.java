package conclasearrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Creamos nuestra tabla
		int tabla[] = new int[30];

		// Bucle for que recorerá la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Asignamos a cada elemento de la tabla un número aleatorio del 0 al 9 (ambos
			// inclusive)
			tabla[i] = (int) (Math.random() * 10);
		}
		
		// Mostramos la tabla creada
		System.out.println("TABLA CREADA");
		System.out.println(Arrays.toString(tabla));
		
		// Ordenamos la tabla con el método sort() 
		Arrays.sort(tabla);
		
		// Mostramos la misma tabla pero ahora ordenada
		System.out.println("TABLA ORDENADA");
		System.out.println(Arrays.toString(tabla));

	}

}

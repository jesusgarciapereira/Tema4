package conclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Número que le pediremos al usuario para consultar que exista en la tabla
		int numExistente;
		
		// Contador de números existentes
		int contExistentes = 0;

		// Creamos la tabla de números aleatorios
		int aleatorios[] = new int[1000];

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle for que recorrerá la longitud de la tabla
		for (int i = 0; i < aleatorios.length; i++) {
			// Asignamos a cada elemento de la tabla un número del 0 al 99
			aleatorios[i] = (int) (Math.random() * 100);
		}
		
		// Mostramos la tabla
		System.out.println(Arrays.toString(aleatorios));
		
		// Le pedimos al usuario un número
		System.out.println("Escriba un número y mostraré si existe en la tabla");
		// Y lo almacenamos en la variabla del número existente
		numExistente = sc.nextInt();
		
		// Bucle for que recorerá toda la tabla
		for (int i = 0; i < aleatorios.length; i++) {
			// Si el valor del elemento coincide con el número introducido por el usuario
			if (aleatorios[i] == numExistente)
				// Incrementa el contador
				contExistentes++;
		}
		
		// Mostramos el resultado según el valor del contador
		if (contExistentes == 0)
			System.out.println("No existe este número en la tabla");
		else
			System.out.println("Existe este número en la tabla, ha aparecido en " + contExistentes + " ocasion(es)");
		
		
	}

}

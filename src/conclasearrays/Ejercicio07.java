package conclasearrays;

import java.util.Arrays;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Número de aciertos
		int aciertos = 0;

		// Tabla con seis números aleatorios
		int apuesta[] = new int[6];

		// Tabla con la combinación ganadora
		int combinacionGanadora[] = {8,13,20,29,41,43};

		// Bucle for que recorerá toda la tabla de nuestra apuesta
		for (int i = 0; i < apuesta.length; i++) {
			// A cada elemento de la tabla se le asigna un número aleatorio entre 1 y 49
			apuesta[i] = (int) (Math.random() * 49 + 1);
			// Bucle for que recorerá sólo los elementos ya asignados
				for (int j = 0; j < i; j++) {
					// Mientras el aleatorio asignado coincida con un elemento de la tabla
					while(apuesta[i] == apuesta [j]) {
						// Le asignamos otro aleatorio
						apuesta[i] = (int) (Math.random() * 49 + 1);	
					}
				}
		}
		
		// Ordenamos la tabla de la combinación ganadora
		Arrays.sort(combinacionGanadora);
		Arrays.sort(apuesta);

		// Bucle for-each que consultará toda la tabla de la combinación ganadora
		for (int valorGanador : combinacionGanadora) {
			// Bucle for-each que consultará toda la tabla de nuestra apuesta
			for (int valorAleatorio : apuesta) {
				// Si un valor de ambos coincide
				if (valorGanador == valorAleatorio)
					// Incrementamos los aciertos
					aciertos++;
			}
		}

		// Mostramos Ambas tablas
		System.out.println("SU APUESTA");
		System.out.println(Arrays.toString(apuesta));
		System.out.println();
		System.out.println("COMBINACIÓN GANADORA");
		System.out.println(Arrays.toString(combinacionGanadora));
		System.out.println();

		// Mostramos el resultado
		System.out.println("Usted ha obtenido " + aciertos + " acierto(s)");

	}

}

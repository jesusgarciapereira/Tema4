package sinclasearrays;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Creamos nuestra tabla de longitud 12
		int num[] = new int[12];

		// Asignamos los siguientes valores en las respectivas posiciones tal y como
		// pide el ejercicio
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// Bucle for que recorre nuestra tabla
		for (int i : num) {
			// Muestra el valor de cada elemento de la tabla
			System.out.print(i + " ");
		}
		
		// Salto de línea
		System.out.println();
		// Mensaje final
		System.out.println("Los valores no asignados serán 0 por defecto");

	}

}

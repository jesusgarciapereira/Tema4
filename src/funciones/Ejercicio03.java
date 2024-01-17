package funciones;

public class Ejercicio03 {

	// ENTRADA: Longitud de la tabla y número máximo que tendrán los valores de la
	// tabla
	// SALIDA: Tabla creada en esta función
	public static int[] rellenaPares(int longitud, int fin) {
		int tabla[] = new int[longitud];
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * (fin - 1) + 2);
		}
		return tabla;

	}

	public static void main(String[] args) {

	}

}

package funciones;

public class Ejercicio01 {

	// ENTRADA: Tabla de tipo enteros
	// SALIDA: Suma de todos los elementos de la tabla
	// Función sumaValoresTabla()
	public static int sumaValoresTabla(int tabla[]) {
		// Resultado de la suma de los elementos de la tabla
		int resultado = 0;
		// Bucle for que recorrerá toda la tabla
		for (int valor : tabla) {
			// Al resultado le incrementamos la suma de todos los valores de la tabla
			resultado += valor;
		}
		// Devolvemos el resultado
		return resultado;

	}

	// Función main()
	public static void main(String[] args) {

		// Resultado de la suma de los elementos de la tabla
		int resultado;
		// Creamos una tabla
		int tabla[] = { 7, 21, 9, 6, 13, 0, 2 };

		// Asignamos al resultado el valor devuelto por la función sumaValoresTabla()
		resultado = sumaValoresTabla(tabla);
		
		// Mostramos el resultado
		System.out.println(resultado);
	}

}

package conclasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Tamaño de la tabla que le pediremos al usuario
		int NTamannioDeTabla;
		// Valor de cada elemento de la tabla que le pediremos al usuario
		int MContenidoDeTabla = 0;
		
		// Tabla que crearemos
		int tabla[];

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario un número para la N
		System.out.println("Introduzca un valor para N (tamaño de la tabla)");
		// Y lo almacenamos
		NTamannioDeTabla = sc.nextInt();

		// Le pedimos al usuario un número para la M
		System.out.println("Introduzca un valor para M (valor de cada elemento de la tabla)");
		// Y lo almacenamos
		MContenidoDeTabla = sc.nextInt();
		
		// Creamos la tabla con el valor introducido por el usuario
		tabla = new int[NTamannioDeTabla];
		
		// Rellenamos los valores por defecto con el valor introducido por el usuario
		Arrays.fill(tabla, MContenidoDeTabla);
		
		// Mostramos la tabla creada
		System.out.println(Arrays.toString(tabla));
		
		// Cerramos el Scanner
		sc.close();
	}

}

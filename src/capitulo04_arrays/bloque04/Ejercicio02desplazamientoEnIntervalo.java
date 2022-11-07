package capitulo04_arrays.bloque04;



import java.util.Scanner;

import metodos.Utils;
import metodos.UtilsArrays;

public class Ejercicio02desplazamientoEnIntervalo {

	public static void main(String[] args) {
		int array[] = UtilsArrays.creaArrayNumerosAzar(10, 0, 15);
		int inicio = 0, fin = 0, aux;
		
		Scanner sc = new Scanner(System.in);
		UtilsArrays.mostrarArray(array);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + ".- " + array[i] + " ");
		}
		inicio = Utils.obtenerEnteroConDescripcion("Introduzca el inicio");
		fin = Utils.obtenerEnteroConDescripcion("Introduzca el fin");
		/*
		 * Con el condicional del principio comprobamos que el inicio introducido sea mas pequeño que el fin y que estos solamente puedan estar entre 0 y 9.
		 * Tras estas comprobaciones con el primer bucle buscamos encontrar el intervalo donde vamos a trabajar que se encuentra entre el número de inicio y el número de fin. 
		 * Con el segundo bucle haremos el desplazamiento de una posición hacia la derecha de los números encontrados dentro del intervalo, dejando los que están fuera fijos y sin cambios.
		 */
		if ( inicio < fin && inicio >= 0 && fin <= 9 ) {
			for (int i = inicio; i <= fin +1; i++) {
				aux = array[fin];
				for (int j = fin ; j > inicio; j--) {
					array[j] = array[j-1];
					}	
					array[inicio] = aux;		
			}
		}		
		UtilsArrays.mostrarArray(array);
	}
}

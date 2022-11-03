package capitulo04_arrays.bloque03;

import metodos.UtilsArrays;

public class Ejercicio04ordenacionPorSeleccion {

	public static void main(String[] args) {
		int array[] = UtilsArrays.creaArrayNumerosAzar(15, 0, 1000);
		int aux, menor;
		UtilsArrays.mostrarArray(array);
		
		/*
		 * Considero que el primero, de la iteracion, es el menor, y luego, voy comprobando, si los siguientes, son menores que ese menor.
		 * en caso de que si, los intercambio.
		 */
		for (int i = 0; i < array.length; i++) {
			menor = array[i] ;			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < menor) {
					aux = array[j];
					array[j] = menor;
					menor = aux;				
				}
			}
			array[i] = menor;
		}		
		UtilsArrays.mostrarArray(array);
	}
}

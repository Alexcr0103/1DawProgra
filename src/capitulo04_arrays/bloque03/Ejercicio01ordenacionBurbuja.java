package capitulo04_arrays.bloque03;

import metodos.UtilsArrays;

public class Ejercicio01ordenacionBurbuja {

	public static void main(String[] args) {
		int array[] = UtilsArrays.creaArrayNumerosAzar(10, 0, 100);
		int aux;
		
		UtilsArrays.mostrarArray(array);
		
		System.out.println();
		
		System.out.println("Array ordenado");
		/*
		 * Ordenación en burbuja.
		 * Para cambiar, son dos bucles, el externo, es para ir avanzando entre los valores
		 * del array, y el anidado es para, que si el valor, es menor que el siguiente,
		 * lo vaya moviendo, para que los menores, se vayan a la parte izquierda del array.
		 * El array lo recorro al revés, para ir metiendo los valores menores, en aux.
		 */
		for (int i = array.length-1; i > -1; i--) {
			for (int j = array.length-1; j > 0; j--) {
				if (array[j] < array[j-1]) {
					aux = array[j];
					array[j] = array[j-1];
					array[j-1] = aux;	
				}
			}	
		}
		
		UtilsArrays.mostrarArray(array);
	}

}

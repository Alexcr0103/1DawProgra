package capitulo04_arrays.bloque04;

import metodos.UtilsArrays;

public class Ejercicio01paresDerechaImparesResto {

	public static void main(String[] args) {
		int array[] = UtilsArrays.creaArrayNumerosAzar(20, 0, 100);
		int arrayAux[] = new int [20]; 
		int contador = 0;
		UtilsArrays.mostrarArray(array);
		
		/*
		 * Con el primer bucle recorremos el array en busca de los números pares, cuando encontramos uno sustitumos en el arrayAuxiliar la posicion a la que pertenezca el contador el valor
		 * que tengamos en el primer array. El segundo bucle funciona de la misma manera pero buscaremos y sustituiremos los valores impares.
		 */
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				arrayAux[contador] = array[i];
				contador++;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				arrayAux[contador] = array[i];
				contador++;
			}
		}
		System.out.println();
		UtilsArrays.mostrarArray(arrayAux);
	}

}

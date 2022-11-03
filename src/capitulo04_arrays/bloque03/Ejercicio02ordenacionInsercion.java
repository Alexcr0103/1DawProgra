package capitulo04_arrays.bloque03;

import metodos.UtilsArrays;

public class Ejercicio02ordenacionInsercion {

	public static void main(String[] args) {
		int array[] = UtilsArrays.creaArrayNumerosAzar(150, 0, 1000);
		int aux = 0, actual, j;
		
		UtilsArrays.mostrarArray(array);
		
		System.out.println("Array");
		
		/*
		 *Con el primer for recorremos de izquierda a derecha el array. Seleccionamos al valor de la primera posicion y lo guardamos en una variable.
		 *Con el segundo bucle buscaremos un número que sea menor que el valor guardado en la variable actual y una vez hecho procederemos a mover
		 *este valor de derecha a izquierda hasta llegar al valor actual de la [i]. Una vez que salgamos del segundo bucle, guardaremos en la posicion de la j
		 *donde nos encontremos el valor de actual.
		 */
		
		for (int i = 1; i < array.length; i++) {
			actual = array[i];
			for ( j = i; j > 0 && array[j - 1] > actual; j--) {
				array[j] = array[j-1];				
			}
			array[j] = actual;
		}
		
		UtilsArrays.mostrarArray(array);
	}

}

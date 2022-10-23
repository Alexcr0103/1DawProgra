package capitulo04_arrays.bloque02;

import java.util.Iterator;

public class Ejercicio02tercerArrayIndiceParImparesIndiceImparPares {

	public static void main(String[] args) {
		int array1[] = new int [15];
		int array2 []  = new int [15];
		int array3 [] = new int [15];
		
		/*
		 * Creamos el primer array y lo inicializamos.
		 */
		System.out.println("Primer array");
		for (int i = 0; i < array1.length; i++) {
			array1 [i] = (int) (Math.random()*100);
			System.out.print(array1[i] + " ");
		}
		System.out.println("\n");
		
		/*
		 * Creamos el segundo array y lo inicializamos.
		 */
		System.out.println("\nSegundo array");
		
		for (int i = 0; i < array2.length; i++) {
			array2 [i] = (int) (Math.random()*100);
			System.out.print(array2[i] + " ");
		}
		
		System.out.println("\n");
		System.out.println("Tercer array");
		/*
		 *  Para el tercer array, lo recorro, y si, el índice, es par, le asigno el valor,
		 *  del array1 o array2 que corresponda.
		 */
		for (int i = 0; i < array3.length; i++) {
			if (i % 2 == 0) {
				array3[i] = array2[i];
			}
			else {array3[i] = array1[i];
			}
			System.out.print(array3[i]+ " ");			
		}
	}
}

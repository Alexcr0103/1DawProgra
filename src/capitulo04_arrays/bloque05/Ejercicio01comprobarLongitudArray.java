package capitulo04_arrays.bloque05;

import metodos.UtilsArrays;

public class Ejercicio01comprobarLongitudArray {

	public static void main(String[] args) {
		
		int longitudArray = (int) Math.round(Math.random()*100); //Primero hacemos que la longitud del array sea al azar entre 0 y 100.
		int array [] = new int [longitudArray]; // Creamos el array dandole la longitud creada antes.
		
		UtilsArrays.inicializaArray(array);
		UtilsArrays.mostrarArray(array);
		
		System.out.println();
		System.out.println("La longitud del array es " + array.length);
		System.out.println();
		System.out.println("El valor de la posición media del array es " + examinarLongitudArray(array));
	}
	
	/**
	 * 
	 * @param array
	 * En el primer if buscaremos si es par y si es así devolveremos el valor -1. En el else indicaremos que si es impar devuelva el número que esta en medio del array.
	 * @return
	 */
	public static int examinarLongitudArray (int array[]) {
		if (array.length % 2 == 0) {
			return -1;
		}else {
			return array[array.length/2 ];
		}	
	}
}

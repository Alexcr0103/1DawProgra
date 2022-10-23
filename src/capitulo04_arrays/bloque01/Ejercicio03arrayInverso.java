package capitulo04_arrays.bloque01;

public class Ejercicio03arrayInverso {

	public static void main(String[] args) {
		int array[] = new int [150];

		System.out.println("Array normal");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*100);
			System.out.print(array[i] + " ");
		}
		
		/*
		 * Recorro el array, de forma decreciente, teniendo en cuenta, que el array
		 * tiene que empezar, en la longitud menos 1, ya que si el array, tiene 150 números
		 * el último número, tiene la posicion 149 y llegará hasta la posición 0 lo cual, el
		 * bucle no se podrá detener en 0 si no en -1.
		 */

		System.out.println("\nArray inverso");
		for (int i = array.length -1 ; i > -1; i--) {
			System.out.print(array[i] + " ");
		}
	}

}

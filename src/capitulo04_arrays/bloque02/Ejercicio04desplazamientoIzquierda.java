package capitulo04_arrays.bloque02;

public class Ejercicio04desplazamientoIzquierda {

	public static void main(String[] args) {
		int array[]= new int[5], aux;
		
		/*
		 * Primer array, para inicializar el primer array.
		 */
		System.out.println("Array");
		for (int i = 0; i < array.length; i++) {
			array[i]= (int) Math.round(Math.random()*100);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		/*
		 * Para desplazar los valores del array, usamos una variable auxiliar,
		 * como movemos a la izquierda, el último valor del array, lo tenemos uqe guardar
		 * en la auxiliar. Y al final, el último valor del array, va a valer, el primero,
		 * es decir el auxiliar.
		 */
		aux = array[0];
		System.out.println("\n");
		System.out.println("\nArray Cambiado");
		for (int i = 0; i < array.length -1; i++) {
			array[i] = array[i+1];
		}
		array[array.length-1] = aux;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}

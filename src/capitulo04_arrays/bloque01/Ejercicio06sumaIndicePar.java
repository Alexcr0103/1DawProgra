package capitulo04_arrays.bloque01;

public class Ejercicio06sumaIndicePar {

	public static void main(String[] args) {
		int array[] = new int [15], sumaIndPar = 0;
		
		for (int i = 0; i < array.length; i++) {
			array [i] = (int) (Math.random()*100);
			System.out.print(array [i] + " ");
		}
		
		/*
		 * En el segundo bucle indicamos que si i (indice) entre 2 es igual a 0 que sume el elemento que contiene ese indice
		 * mas la variable sumIndPar. Al final mostraremos esta ultima variable y asi podremos ver la suma de todos los 
		 * números con índice par.
		 */
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				sumaIndPar = array[i] + sumaIndPar;
			}
		}
		
		System.out.println("\nLa suma de todos los elementos con indice par es " + sumaIndPar);
	}

}

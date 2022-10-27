package capitulo04_arrays.bloque02;

import java.util.Scanner;

public class Ejercicio05desplazamientoIndicadoUsuario {

	public static void main(String[] args) {
		int array[] = new int [5], posiciones, aux;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Array");
		for (int i = 0; i < array.length; i++) {
			array[i]= (int) Math.round(Math.random()*100);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("\nIntroduce el número de posiciones que deseas desplazar");
		posiciones = sc.nextInt();
		
		System.out.println();
		System.out.println("Array cambiado");
		/*
		 * Segundo array, cambiado.
		 * Meto otro bucle for, que se encargue de hacer, el desplazamiento, las veces
		 * que el usuario introduzca. Es necesario, resetear el valor de auxilar, para 
		 * que en cada iteración, el valor de aux, sea el del último valor del array
		 * en cada caso.
		 */
		for (int i = 0; i < posiciones; i++) {
			aux = array[array.length-1];
			
			for (int j = array.length-1; j > 0 ; j--) {
				array[j]=array[j-1];
			}
			array[0] = aux;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}

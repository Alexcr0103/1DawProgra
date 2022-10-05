package capitulo03_bucles.bloque02;

import java.util.Scanner;

public class Ejercicio02mayorMenor {

	public static void main(String[] args) {
		
		/*
		 * Declaramos variables
		 */
		int numPedidos, num, mayor = 0, menor = 0;
		
		Scanner sc = new Scanner (System.in);
		
		/*
		 * Pedimos usuario datos
		 */
		System.out.println("¿Cuantos números quieres introducir?");
		
		numPedidos = sc.nextInt();
		
		/*
		 * Le asigno tanto a mayor como a menor el mismo valor, para los condicionales
		 * El primer if, es para la primera iteración, y el else, para el resto de iteraciones
		 * Si el número que se introduce, en las siguientes iteraciones, es mayor o menor, se irá
		 * sobrescribiendo en las variables, en cada iteración.
		 */
		
		for (int i = 0; i < numPedidos; i++) {
						
			System.out.println("Introduce un número");
			num = sc.nextInt();
			if (i == 0) {
				mayor = num;
				menor = num;
			}
			if (num > mayor) {
				mayor = num;
			}
			if (num < menor) {
				menor = num;
			}
		}
		
		System.out.println("El mayor introducido es " + mayor + " y el menor es " + menor);
	}

}

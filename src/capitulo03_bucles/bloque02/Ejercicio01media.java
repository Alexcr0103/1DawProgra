package capitulo03_bucles.bloque02;

import java.util.Scanner;

public class Ejercicio01media {

	public static void main(String[] args) {
		int numPedidos, num, sumTotal = 0;
		float media;
		
		Scanner sc = new Scanner (System.in);		
		
		System.out.println("¿Cuantos números quieres introducir?");
		
		numPedidos = sc.nextInt();
		/*
		 * Hago el bucle, para que el número de iteraciones, dependa del número introducido.
		 * Uso la variable sumTotal, para la acumulación de la suma de los números.
		 * Luego en la variable media hago la división de la suma total entre los números introducidos.
		 * Hago la cuenta en el "syso" o fuera del bucle, nunca dentro, porque
		 * haría la division en cada iteración.
		 */
		
		for (int i = 0; i < numPedidos; i++) {
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			
			sumTotal = num + sumTotal;
		}
		
		media = sumTotal / (float)numPedidos;
		System.out.println("La media de los números introducidos es " + media);
	}

}

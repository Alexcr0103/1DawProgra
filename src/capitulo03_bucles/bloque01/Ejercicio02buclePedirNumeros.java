package capitulo03_bucles.bloque01;

import java.util.Scanner;

public class Ejercicio02buclePedirNumeros {

	public static void main(String[] args) {
		/*
		 * Declaramos variables
		 */
		int sumaNum = 0, num, numPedidos;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuantos números quieres añadir?");
		
		numPedidos = sc.nextInt();
		
		/*
		 * Creo bucle for, con la restricción de que sea menor que 4, para que, contando el 0, pida 4 números.
		 * Luego, meto un "if", para que solo añada la suma si es mayor que 10.
		 */
		
		for (int i = 0; i < numPedidos; i++ ) {
			
			System.out.println("Introduce un número");
			num = sc.nextInt();
			
			if ( num > 10) {
				sumaNum = num + sumaNum;
			}
		}
		
		/*
		 * Enseñamos el resultado en pantalla
		 */
		System.out.println("La suma de los números introducidos mayores de diez es " + sumaNum);

	}

}

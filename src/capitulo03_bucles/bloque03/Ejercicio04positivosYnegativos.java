package capitulo03_bucles.bloque03;

import java.util.Scanner;

public class Ejercicio04positivosYnegativos {

	public static void main(String[] args) {
		int num = 1, negativo = 0, positivo = 0;
		
		Scanner sc = new Scanner (System.in);
		
		/*
		 * Bucle para que pida números al usuario mientras no introduzca el 0
		 */		
		for (; num != 0 ; ) {
			
			System.out.println("Introduce un número (Introduzca el 0 si quiere terminar el programa");
			
			num = sc.nextInt();
			
			/*
			 * Utilizamos los if para que los contadores se sumen.
			 */
			if (num < 0) {
				negativo++;
			}
			if ( num > 0) {
				positivo++;
			}
		}
		System.out.println("Se han introducido " + positivo + " números positivos y " + negativo + " números negativos");
	}

}

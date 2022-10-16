package capitulo03_bucles.bloque04;

import java.util.Scanner;

public class Ejercicio04binario {

	public static void main(String[] args) {
		int num, i=128;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		/*
		 * Declaro las variables, y en el bucle, la primera iteración, es 128
		 * que es el valor del último bit, el que está mas a la izquierda.
		 * Y, la "i" tiene que dividirse entre 2, para avanzar al siguiente bit,
		 * que está mas a la derecha.
		 */
		while (i >0) {
			if ((num & i)==0) {
				System.out.print("0");
			}
			else {
				System.out.print("1");
			} i/=2;
		}
		/*
		 * En un bucle while, inicializo la variable "i" antes del bucle, y la
		 * progresión de la "i", la hago al final del bucle, para que en la siguiente
		 * iteración, el valor de "i" ya esté modificado.
		 */

	}

}

package capitulo04_arrays.bloque02;

import java.util.Scanner;

public class Ejercicio03mutliplicacionPorUnNumero {

	public static void main(String[] args) {
		int array [] = new int [15], num;
		/*
		 *  Pido el número al usuario para multiplicar posteriormente.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para multiplicar: ");
		num = sc.nextInt();
		
		System.out.println("Array normal");
		/*
		 *  Primer bucle para recorrer el array, y asignarle valores aleatorios.
		 */
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
			System.out.print(array[i] + " ");
		}
		
		/*
		 * Array Multiplicado
		 */
		System.out.println("\n");
		System.out.println("\nArray Multiplicado");
		/*
		 *  Recorro el array, para que multiplique, cada valor, por el número introducido
		 *  por el usuario.
		 */
		for (int i = 0; i < array.length; i++) {
			array [i] = num * array[i];
			System.out.print(array[i] + " ");
		}
	}
}

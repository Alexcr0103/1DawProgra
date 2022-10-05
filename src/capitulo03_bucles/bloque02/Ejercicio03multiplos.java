package capitulo03_bucles.bloque02;

import java.util.Scanner;

public class Ejercicio03multiplos {

	public static void main(String[] args) {
		/*
		 * Declaramos variables.
		 */
		
		int num, limite = 100;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el número del cual quieras sacar los múltiplos");
		
		num = sc.nextInt();
		
		/*
		 * Establezco el límite requerido, y pido el número, del cual se quieran obtener los números.
		 * Creo el bucle for, para que, se vaya ejecutando en la consola los múltiplos, hasta que
		 * la multiplicación del número de iteración, por el factor, sea menor que el límite.
		 */
		
		for (int i = 2; (i * num) < limite; i++) {
			System.out.println("Multiplo de " + num + " = " + (i * num));
		}

	}

}

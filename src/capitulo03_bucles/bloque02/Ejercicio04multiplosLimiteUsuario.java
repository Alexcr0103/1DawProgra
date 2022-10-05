package capitulo03_bucles.bloque02;

import java.util.Scanner;

public class Ejercicio04multiplosLimiteUsuario {

	public static void main(String[] args) {
		/*
		 * Declaramos variables.
		 */
		
		int num, limite = 100;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el número del cual quieras sacar los múltiplos");
		num = sc.nextInt();
		System.out.println("Establece un limite al que quieras llegar");
		limite =sc.nextInt();
		
		/*
		 * Le pido al usuario que establezca el límite, le pido el número, del cual se quieran obtener los números.
		 * Creo el bucle for, para que, se vaya ejecutando en la consola los múltiplos, hasta que
		 * la multiplicación del número de iteración, por el factor, sea menor que el límite.
		 */
		
		for (int i = 1; (i * num) < limite; i++) {
			System.out.println("Multiplo de " + num + " = " + (i * num));
		}

	}

}

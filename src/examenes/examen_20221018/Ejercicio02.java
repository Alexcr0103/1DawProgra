package examenes.examen_20221018;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Declaro variables
		 */
		int num, limiInf, limiSup;
		Scanner sc = new Scanner (System.in);
		
		/*
		 * Le pido al usuario que indique el límite inferior
		 */
		System.out.println("Establezca un límite negativo como límite inferior");
		limiInf = sc.nextInt();
		
		/*
		 * Usamos un bucle para que en caso de que el usuario introduzca un límite inferior erróneo, se lo volvamos a pedir de nuevo hasta que introduzca
		 * un valor correcto.
		 */
		while (limiInf > 0) {
			System.out.println("Introduzca como limite inferior un número negativo");
			limiInf = sc.nextInt();
		}
		
		/*
		 * Le pido al usuario que indique el límite superior
		 */
		System.out.println("Establezca un limite positivo como límite superior");
		limiSup = sc.nextInt();
		
		/*
		 * Usamos un bucle para que en caso de que el usuario introduzca un límite superior erróneo, se lo volvamos a pedir de nuevo hasta que introduzca
		 * un valor correcto.
		 */
		while (limiSup < 0) {
			System.out.println("Introduzca como límite superior un número positivo");
			limiSup = sc.nextInt();
		}
		
		/*
		 * Realizamos un bucle for para obtener 10 números aleatorios comprendidos dentro de los límites establecidos por el usuario y mostramos los resultados
		 */
		for (int i = 0; i < 10; i++) {
			num = (int) (Math.round(Math.random() * (limiSup - limiInf)) + limiInf);
			System.out.print(num + " ");
		}
	}

}

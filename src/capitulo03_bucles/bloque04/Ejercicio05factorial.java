package capitulo03_bucles.bloque04;

import java.util.Scanner;

public class Ejercicio05factorial {

	public static void main(String[] args) {
		int num=0, factorial;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el número para calcular su factorial: ");
		num=sc.nextInt();
		/*
		 * El factorial de un número, es el número, multiplicandose, por los anteriores.
		 * El factorial, tiene que ser de un número positivo, así que, MIENTRAS el número,
		 * sea mayor de 0, factorial, va a ser igual, a sí mismo, por el número, que va decreciendo
		 * de forma simple.
		 */
		factorial=1;
		while (num>0) {
			factorial*=num;
			num--;
		}
		System.out.println("El factorial es: " + factorial);

	}

}

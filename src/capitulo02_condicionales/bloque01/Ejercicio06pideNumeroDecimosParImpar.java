package capitulo02_condicionales.bloque01;

import java.util.Scanner;

public class Ejercicio06pideNumeroDecimosParImpar {

	public static void main(String[] args) {
		
		/*
		 * Declaramos las variables e importamos la clase Scanner.
		 */
		int num1;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		
		num1=sc.nextInt();
		
			if (num1 % 2 ==0) {
			System.out.println("El número " + num1 + " es par");
		} else {
			System.out.println("El número " + num1 + " es impar");
		}

	}

}

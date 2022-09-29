package capitulo02_condicionales.bloque01;

import java.util.Scanner;

public class Ejercicio07pedirNumeroUsarAndIf {

	public static void main(String[] args) {
		
		/*
		 * Declaro la variable entera correspondiente al numero que se le pedirá al usuario.
		 */
		int num;
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		num= sc.nextInt();
		


		if ((num & 1) == 1) {
		//Utilizao la operación "AND" para específicar el último bit de "num".
		//Igualo a 1, ya que si es impar, el último bit, va a ser siempre 1.
			System.out.println("El número " + num + " es impar.");
		}
		else {
		//Si el último bit, no es 1, significa que es 0, y por lo tanto, es un número par.
			System.out.println("El número " + num + " es par.");
		}

	}

}

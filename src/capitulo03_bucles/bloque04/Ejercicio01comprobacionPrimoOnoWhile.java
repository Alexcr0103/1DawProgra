package capitulo03_bucles.bloque04;

import java.util.Scanner;

public class Ejercicio01comprobacionPrimoOnoWhile {

	public static void main(String[] args) {
		int num=3;
		boolean esprimo=true;
		Scanner sc=new Scanner(System.in);
		
		while (2 < num) {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
			if (num % 2 == 0) {
				esprimo=false;			
				System.out.println("El número "+ num + " es compuesto");
				break;
			}
			else if (num % 2 != 0) {
				System.out.println("El número "+ num + " es primo");
				break;
			}
		}

	}

}

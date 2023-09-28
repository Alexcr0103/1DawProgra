package capitulo03_bucles.bloqueRepaso.bloque3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num = 1, mayor = 0, menor = 0;
		
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; num != 0; i++) {
			
			System.out.println("Introduzca un número (Si introduces el 0, el programa acabará)");
			
			num = sc.nextInt();
			
			if (i == 0) {
				mayor = num;
				menor = num;
			}
			
			if (num != 0) {
				
				if (num > mayor) {
					mayor = num;
				}
				
				if (num < menor) {
					menor = num;
				}
			}
			

		}
		
		System.out.println("El número mayor introducido es " + mayor + " y el número menor es " + menor);
	}

}

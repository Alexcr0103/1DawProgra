package capitulo03_bucles.bloque03;

import java.util.Scanner;

public class Ejercicio03tablaMultiplicar {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("Introduzca un número para mostrarle su tabla de multiplicar (Si introduce el 0 el programa acabará");
			num = sc.nextInt();
			
			for (int i = 0; i < 11; i++) {
				if (num != 0) {
					System.out.println(i + " por " + num + " es igual a " + i*num);
				}
			}
			System.out.println("\n");
		}while (num != 0);
		
		System.out.println("\nEl programa ha finalizado");
	}

}

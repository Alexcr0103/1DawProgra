package capitulo03_bucles.bloque03;

import java.util.Scanner;

public class Ejecicio02mayorYmenor {

	public static void main(String[] args) {
		
		int num = 1, mayor = 0, menor = 0;
		
		Scanner sc = new Scanner (System.in);
		
		for (; num != 0;) {
			
			System.out.println("Introduzca un número (Introduzca el 0 para acabar el programa)");
			num = sc.nextInt();
			
			if (menor == 0) {
				menor = num;
			}
			
			if (num > mayor && num != 0) {
				mayor = num;
			}
			
			if ( num < menor && num != 0) {
				menor = num;
			}
		}
		
		System.out.println("El número introducido mayor es " + mayor + " y el menor es " + menor);
	}

}

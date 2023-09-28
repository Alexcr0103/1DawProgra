package capitulo02_condicionales.bloqueRepaso.bloque1;

import java.util.Scanner;

public class Bloque1Ejercicio3 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5, mayor;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca cinco números");
		
		num1 = sc.nextInt();
		
		mayor = num1;
		
		num2 = sc.nextInt();

		if (num2 > mayor) {
			mayor = num2;
		}
		num3 = sc.nextInt();
		
		if (num3 > mayor) {
			mayor = num3;
		}
		num4 = sc.nextInt();
		
		if (num4 > mayor) {
			mayor = num4;
		}
		num5 = sc.nextInt();
		
		if (num5 > mayor) {
			mayor = num5;
		}
		
		System.out.println("El mayor número introducido es " + mayor);
	}

}

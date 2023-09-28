package capitulo02_condicionales.bloqueRepaso.bloque1;

import java.util.Scanner;

public class Bloque1Ejercicio4 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5, menor;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca cinco números");
		
		num1 = sc.nextInt();
		
		menor = num1;
		
		num2 = sc.nextInt();

		if (num2 > menor) {
			menor = num2;
		}
		num3 = sc.nextInt();
		
		if (num3 > menor) {
			menor = num3;
		}
		num4 = sc.nextInt();
		
		if (num4 > menor) {
			menor = num4;
		}
		num5 = sc.nextInt();
		
		if (num5 > menor) {
			menor = num5;
		}
		
		System.out.println("El mayor número introducido es " + menor);
	}

}

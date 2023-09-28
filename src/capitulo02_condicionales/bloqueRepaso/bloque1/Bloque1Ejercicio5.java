package capitulo02_condicionales.bloqueRepaso.bloque1;

import java.util.Scanner;

public class Bloque1Ejercicio5 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5, menor, mayor;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca cinco números");
		
		num1 = sc.nextInt();
		
		menor = num1;
		mayor = num1;
		
		num2 = sc.nextInt();

		if (num2 > mayor) {
			mayor = num2;
		}else {
			if(num2 < menor) {
				menor = num2;
			}
		}
		num3 = sc.nextInt();
		
		if (num3 > mayor) {
			mayor = num3;
		}else {
			if(num3 < menor) {
				menor = num3;
			}
		}
		num4 = sc.nextInt();
		
		if (num4 > mayor) {
			mayor = num4;
		}else {
			if(num4 < menor) {
				menor = num4;
			}
		}
		num5 = sc.nextInt();
		
		if (num5 > mayor) {
			mayor = num5;
		}else {
			if(num5 < menor) {
				menor = num5;
			}
		}
		
		System.out.println("El menor número introducido es " + menor + " mientras que el mayor es " + mayor);

	}

}

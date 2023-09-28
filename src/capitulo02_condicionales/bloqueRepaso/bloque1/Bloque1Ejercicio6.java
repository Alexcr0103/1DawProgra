package capitulo02_condicionales.bloqueRepaso.bloque1;

import java.util.Scanner;

public class Bloque1Ejercicio6 {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número");
		
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El número introducido es par");
		}else {
			System.out.println("El número introducido es impar");
		}
	}

}

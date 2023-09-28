package capitulo02_condicionales.bloqueRepaso.bloque1;

import java.util.Scanner;

public class Bloque1Ejercicio7 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número");
		
		num = sc.nextInt();
		
		if ((num & 1) ==0) {
			System.out.println("El número introducido es par");
		}else {
			System.out.println("El número introducido es impar");
		}
	}

}

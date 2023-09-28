package capitulo02_condicionales.bloqueRepaso.bloque1;

import java.util.Scanner;

public class Bloque1Ejercicio2 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Porfavor introduzca un número");
		
		num1 = sc.nextInt();
		
		System.out.println("Porfavor introduzca un segundo número");
		num2 = sc.nextInt();
		
		if (num1 < num2) {
			System.out.println("El número menor es " + num1);
		} 
		else { 
			System.out.println("El número menor es " + num2);
		}
	}

}

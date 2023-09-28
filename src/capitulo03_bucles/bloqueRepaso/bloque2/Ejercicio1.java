package capitulo03_bucles.bloqueRepaso.bloque2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		double num, media = 0, num2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca la cantidad de números que desea introducir");
		
		num = sc.nextDouble();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Introduzca un número");
			
			num2 = sc.nextDouble();
			
			media = num2 + media;
		}
		
		System.out.println("La media de todos los números introducidos es " + media / num);
	}

}

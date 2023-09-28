package capitulo03_bucles.bloqueRepaso.bloque1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num, sumNum = 0;
		
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println("Introduzca un número");
			
			num = sc.nextInt();
			
			if (num > 10) {
				sumNum = num + sumNum;
			}
		}
		
		System.out.println("La suma de los números introducidos es " + sumNum);
	}

}

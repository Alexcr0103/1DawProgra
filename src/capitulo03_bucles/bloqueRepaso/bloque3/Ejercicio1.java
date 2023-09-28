package capitulo03_bucles.bloqueRepaso.bloque3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num = 1, sumTotal = 0, numTotal = 0;
		
		Scanner sc = new Scanner (System.in);
		
		
		
		for (int i = 0; num != 0; i++) {
			System.out.println("Introduzca un número.(Si quiere que el programa acabe introduzca el 0)");
			
			num = sc.nextInt();
			
			if(num != 0) {
				sumTotal = num + sumTotal;
				numTotal++;
			}
		}
		
		System.out.println("La suma total de los números introducidos es " + sumTotal + " y la media de ellos es " + sumTotal / numTotal);
		
		System.out.println("\nHas salido del programa");
	}

}

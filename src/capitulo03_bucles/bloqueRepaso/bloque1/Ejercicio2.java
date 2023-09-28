package capitulo03_bucles.bloqueRepaso.bloque1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num, sumNum = 0, cantidadNumeros;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cuantos números quieres introducir?");
		
		cantidadNumeros = sc.nextInt();
		
		for (int i = 0; i < cantidadNumeros; i++) {
			
			System.out.println("Introduzca un número");
			
			num = sc.nextInt();
			
			if (num > 10) {
				sumNum = num + sumNum;
			}
		}
		
		System.out.println("La suma de los números introducidos es " + sumNum);

	}

}

package capitulo03_bucles.bloqueRepaso.bloque1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int num, cantidadNumeros, negativos = 0, positivos = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca la cantidad de números que quieres introducir");
		
		cantidadNumeros = sc.nextInt();
		
		for (int i = 0; i < cantidadNumeros; i++) {
			
			System.out.println("Introduzca un número");
			
			num = sc.nextInt();
			
			if(num < 0) {
				negativos++;
			}else {
				if(num > 0) {
					positivos++;
				}
			}
		}
		
		System.out.println("Has introducido " + positivos + " números positivos y " + negativos + " números negativos");
	}

}

package capitulo03_bucles.bloqueRepaso.bloque2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numPedidos, mayor = 0, menor = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca la cantidad de números que quiere introducir");
		
		numPedidos = sc.nextInt();
		
		for (int i = 0; i < numPedidos; i++) {
			int num;
			
			System.out.println("Introduzca un número");
			
			num = sc.nextInt();
			
			if (i == 0) {
				mayor = num;
				menor = num;
			}
			if(num > mayor) {
				mayor = num;
			}
			if(num < menor) {
				menor = num;
			}
		}
		
		System.out.println("De todos los números introducidos, el número mayor es " + mayor + " y el número menor es " + menor);
	}

}

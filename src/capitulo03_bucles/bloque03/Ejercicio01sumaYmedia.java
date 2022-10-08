package capitulo03_bucles.bloque03;

import java.util.Scanner;

public class Ejercicio01sumaYmedia {

	public static void main(String[] args) {
		
		int num = 1, sumaTotal = 0, contador = 0;
		Scanner sc = new Scanner (System.in);
		
		for (; num !=0;) {
			System.out.println("Porfavor introduzca un valor(Introduzca 0 si quiere terminar el programa");
			num = sc.nextInt();
			sumaTotal = num + sumaTotal;
			
			if (num!=0) {
				contador++;
			}
		}
		
		System.out.println("La suma total de todos los números introducidos es " + sumaTotal + " y la media sería " + (sumaTotal / (float) contador));
		System.out.println("\nHas salido del programa");
	}

}

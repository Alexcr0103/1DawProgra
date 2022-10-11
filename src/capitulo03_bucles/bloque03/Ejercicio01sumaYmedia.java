package capitulo03_bucles.bloque03;

import java.util.Scanner;

public class Ejercicio01sumaYmedia {

	public static void main(String[] args) {
		
		int num = 1, sumaTotal = 0, contador = 0;
		Scanner sc = new Scanner (System.in);
		
		/*
		 * Bucle, para que se repita, cuando el número introducido sea diferente de 0
		 * Anido una condición, para que si el número, es diferente a 0, haga el calculo y se acumule.
		 */
		for (; num !=0;) {
			System.out.println("Porfavor introduzca un valor(Introduzca 0 si quiere terminar el programa");
			num = sc.nextInt();
			
			
			if (num!=0) {
				sumaTotal = num + sumaTotal;
				contador++;	
			}
		}
		/*
		 * En el syso hago el calculo de la sumaTotal entre la acumulación obtenida antes. Le hacemos un casting a float para que 
		 * nos aparezcan decimales
		 */
		System.out.println("La suma total de todos los números introducidos es " + sumaTotal + " y la media sería " + (sumaTotal / (float) contador));
		System.out.println("\nHas salido del programa");
	}

}

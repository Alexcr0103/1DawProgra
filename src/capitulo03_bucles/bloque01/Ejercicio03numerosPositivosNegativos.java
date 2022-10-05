package capitulo03_bucles.bloque01;

import java.util.Scanner;

public class Ejercicio03numerosPositivosNegativos {

	public static void main(String[] args) {
		/*
		 * Declaramos variables.
		 */
		int numPedidos, num, numPositivos = 0, numNegativos = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuantos números quieres añadir?");
		
		numPedidos = sc.nextInt();
		
		/*
		 * Hago el bucle, para que el número de iteraciones, dependa del número introducido.
		 * Meto el condicional, para que sume el contador, si es positivo, y si es distinto de 0
		 * ya que el 0, no es negativo, ni positivo.
		 */
		
		for (int i = 0; i < numPedidos; i++) {
			
			System.out.println("Introduce un número");
			
			num = sc.nextInt();
			
			if (num < 0) {	
				numNegativos++;
			}else if (num > 0){
				numPositivos++;
			}
				
		}

		/*
		 * Enseñamos resultados
		 */
		System.out.println("Se han introducido " + numPositivos + " números positivos y " + numNegativos + " números negativos");
	}

}

package capitulo04_arrays.bloque01;

import java.util.Scanner;

public class Ejercicio02limiteInferiorSuperior {

	public static void main(String[] args) {
		
		int arrayAzar[] = new int [150], limiInferior, limiSuperior;
		
		Scanner sc = new Scanner (System.in);
		
		/*
		 * Pido al usuario que establezca los limites tanto inferior como superior.
		 */
		System.out.println("Establezca el límite superior");
		
		limiSuperior = sc.nextInt();
		
		System.out.println("Establezca el límite inferior");
		
		limiInferior = sc.nextInt();
		/*
		 * Realizo un bucle, para que, recorra el array, y le de valores aleatorios, dentro
		 * de los límites especificados. Despues, lo ejecuto en consola.
		 */
		for (int i = 0; i < arrayAzar.length; i++) {
			arrayAzar[i] = (int) Math.round(Math.random() * (limiSuperior - limiInferior) + limiInferior);
		}
		
		for (int i = 0; i < arrayAzar.length; i++) {
			System.out.print(arrayAzar[i] + " ");
		}

	}

}

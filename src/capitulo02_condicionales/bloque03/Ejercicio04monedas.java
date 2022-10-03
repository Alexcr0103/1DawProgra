package capitulo02_condicionales.bloque03;

import java.util.Scanner;

public class Ejercicio04monedas {

	public static void main(String[] args) {
		/*
		 * Declaramos variables.
		 */
		int compra, cambio, pagado, mon100 = 0, mon50 = 0, mon25 = 0, mon5 = 0, mon1 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		
		 /*
		  * Pedimos al usuario que nos indique la cantidad que ha comprado y la cantidad que ha pagado.
		  */
		
		System.out.println("¿Que cantidad has comprado?");
		
		compra = sc.nextInt();
		
		System.out.println("¿Que cantidad has pagado?");
		
		pagado = sc.nextInt();
		
		/*
		 * Calculamos el cambio que tendríamos que devolver.
		 */
		cambio = pagado - compra;
		
		/*
		 *Realizamos los condicionales, si el cambio es mayor que cada tipo de moneda
		 *Dividimos el cambio entre el valor de la moneda, para saber cuantas monedas de ese tipo corresonden.
		 *Y para poder seguir calculando, sobreescribimos el valor de cambio, con el resto
		 *de cada tipo de moneda, para poder seguir la serie.
		 */
		if (cambio >= 100) {
			mon100 = cambio / 100;
			cambio = cambio % 100;
		}
		
		if (cambio >= 50) {
			mon50 = cambio / 50;
			cambio = cambio % 50;
		}
		
		if (cambio >= 25) {
			mon25 = cambio / 25;
			cambio = cambio % 25;
		}
		
		if ( cambio >= 5) {
			mon5 = cambio / 5;
			cambio = cambio % 5;
		}
		
		if ( cambio >= 1) {
			mon1 = cambio / 1;
			cambio = cambio % 1;
		}
		
		System.out.println("El número de monedas de 100 es " +  mon100);
		System.out.println("El número de monedas de 50 es " +  mon50);
		System.out.println("El número de monedas de 25 es " +  mon25);
		System.out.println("El número de monedas de 5 es " +  mon5);
		System.out.println("El número de monedas de 1 es " +  mon1);
		
	}

}

package capitulo04_arrays.bloque05;

import java.util.Iterator;

import metodos.UtilsArrays;

public class Ejercicio03arrayEnteroYdecimal {

	public static void main(String[] args) {
		int arrayEntero[] = UtilsArrays.creaArrayNumerosAzar(20, 0, 100); //En este array creamos la parte entera como llevamos haciendo en diferentes ejercicios.
		float arrayDecimal[] = new float [20];
		float arrayUnido[] = new float [20];
		
		UtilsArrays.mostrarArray(arrayEntero);
		System.out.println();
		System.out.println("Array Decimal");
		iniciarArrayDecimal(arrayDecimal);
		System.out.println();
		System.out.println();
		System.out.println("Array Unido");
		unionArrays(arrayDecimal, arrayEntero, arrayUnido);
		System.out.println();
		System.out.println();
		comprobarDecimales(arrayUnido);

	}

	/**
	 * En este primer metodo iniciaremos un array que comprenda números de 0 a 1, para así poder sacar los decimales.
	 * @param arrayDecimal
	 */
	public static void iniciarArrayDecimal (float arrayDecimal[]) {
		for (int i = 0; i < arrayDecimal.length; i++) {
			arrayDecimal[i] = (float) Math.random();
			System.out.print(arrayDecimal[i] + " ");
		}
	}
	/**
	 * Aqui uniremos el array Entero con el Decimal, para así obtener un tercer array llamado unionArrays
	 * @param arrayDecimal
	 * @param arrayEntero
	 * @param arrayUnido
	 */
	public static void unionArrays (float arrayEntero[], int arrayDecimal[], float arrayUnido[]) {
		for (int i = 0; i < arrayUnido.length; i++) {
			arrayUnido[i] = (arrayEntero[i] + arrayDecimal[i]);
			System.out.print(arrayUnido[i] + " ");
		}
	}
	/**
	 * Una vez obtenido el tercer array lo recorreremos, en el if restaremos el número unido menos el número entero quedándonos así unicamente con la parte decimal pudiendo comprobar 
	 * si el decimal se encuentra entre .00 y .49.
	 * @param arrayUnido
	 */
	public static void comprobarDecimales (float arrayUnido[]) {
		int contadorDecimales = 0;
		for (int i = 0; i < arrayUnido.length; i++) {
			if ((arrayUnido[i] - (int)arrayUnido[i]) < 0.50){
				contadorDecimales++;
			}
		}
		System.out.println("Hay " + contadorDecimales + " decimales que están por debajo de 0.50");
	}

}

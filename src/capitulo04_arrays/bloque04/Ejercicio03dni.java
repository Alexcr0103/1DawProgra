package capitulo04_arrays.bloque04;

import metodos.Utils;

public class Ejercicio03dni {

	public static void main(String[] args) {
		char array[] = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int num, resto;
		
		num = Utils.obtenerEnteroConDescripcion("Introduzca su DNI");
		/*
		 * Calculamos el resto del número introducido entre 23, el resltado lo guardamos en la variable y luego en un syso imprimimos el valor que se encuentra en la posición
		 * equivalente al resto obtenido.
		 */
		resto = num % 23;
		
			System.out.print(array[resto] + " ");
		
	}

}

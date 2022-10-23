package capitulo04_arrays.bloque01;

import java.util.Scanner;

public class Ejercicio04pedirYbuscarValorEnArray {

	public static void main(String[] args) {
		
		int array[] = new int [150], num;
		/*
		 * Uso un boolean, para, de primeras, pensar que se encuentra
		 */
		boolean encontrado = false; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor que quieras ver si se encuentra en el array creado");
		
		num = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*100);
			System.out.print(array[i] + " ");
		}
		/*
		 * Si el número introducido por el usuario, coincide con el valor del array
		 * la variable "encontrado" se mantiene true, y se termina el programa.
		 */
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				System.out.println("\nEl número está en la posición " + (i + 1));
				encontrado = true;
				break;
			}
		}
		/*
		 * Para que el mensaje de que no se ha encontrado, salga al final, lo saco del for
		 * y si encontrado, es false, ejecuto el mensaje.
		 */
		if (!encontrado) System.out.println("\nNo se ha encontrado el número." );
	}

}

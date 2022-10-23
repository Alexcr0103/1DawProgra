package capitulo04_arrays.bloque01;

public class Ejercicio01arraysSumaMediaMenorMayor {

	public static void main(String[] args) {
		
		int arrayAzar[] = new int[150], suma=0, menor=0, mayor=0;
		float media=0;
		/*
		 * Puedo hacer todo en un mismo bucle, pero al ser el primer ejercicio de arrays,
		 * voy a separarlo, para identificar yo, que estoy haciendo en cada momento.
		 */
		
		/*
		 * En el primer bucle, recorro el array yara asignar valores randoms, a cada 
		 * uno de los números del array.
		 */
		for (int i = 0; i < arrayAzar.length; i++) {  
			arrayAzar[i] = (int) (Math.random()*100);
		}
		
		/*
		 * En el segundo bucle, recorro el array para imprimirlo en pantalla.
		 */
		for (int i = 0; i < arrayAzar.length;i++) {
			System.out.print(arrayAzar[i] + " ");
		}
		
		/*
		 * En el tercero, recorro el array para asignarle, a suma, todos los valores del array.
		 * Además, hago la media dentro.
		 */
		for (int i = 0; i < arrayAzar.length; i++) {
			suma = suma + arrayAzar[i];
			media = suma/150f;
		}
		/*
		 * Para el mayor y el menor, asigno, el primer número del array, que está en la 
		 * posición 0, a las variables, menor y mayor. Tiene que estar fuera del bucle, porque 
		 * si no, se resetea dandole el valor del array[0].
		 * Luego, con los condicionales, si los siguientes números dentro del array, son
		 * o menores, que el menor, o mayores que el mayor, se le asigna.
		 */

		mayor = arrayAzar[0];
		menor = arrayAzar[0];
		for (int i =0; i< arrayAzar.length;i++) {
			if (arrayAzar[i] < menor) {
				menor = arrayAzar[i];
			}
			if (arrayAzar[i] > mayor) {
				mayor = arrayAzar[i];
			}
		}
		System.out.println("\nLa suma de los números al azar es: " + suma);
		System.out.println("\nLa media de los números es: " + media);
		System.out.println("\nEl número mayor es " + mayor + " y el número menor es "+ menor);
	}

}

package capitulo04_arrays.bloque01;

public class Ejercicio05sumaParesSumaImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int [150], sumPares = 0, sumImpares = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*100);
			System.out.print(array[i] + " ");
		}
		/*
		 * Hago otro bucle donde vuelva a recorrer el array, dentro del bucle mediante los if averiguaremos cuales son los pares
		 * y cuales los impares, si el numero entre 2 sale 0 es par si no, es impar. Luego estos números se irán sumando en la variable sumPar
		 * o sumImpar y al final mostraremos los resultados en pantalla.
		 */
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sumPares = array[i] + sumPares;
			}
			if (array [i] % 2 !=0) {
				sumImpares = array[i] + sumImpares;
			}
		}
		System.out.print("\n");
		System.out.println("\nLa suma total de todos los números pares sería " + sumPares);
		System.out.println("La suma total de todos los números impares sería " + sumImpares);
	}

}

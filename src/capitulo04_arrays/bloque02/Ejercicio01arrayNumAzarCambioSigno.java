package capitulo04_arrays.bloque02;

public class Ejercicio01arrayNumAzarCambioSigno {

	public static void main(String[] args) {
		int array[] = new int [150];
		
		for (int i = 0; i < array.length; i++) {
			array [i] = (int) (Math.random() * (100 - -100) + -100);
			System.out.print(array [i] + " ");
		}
		System.out.println("\n");
		
		/*
		 * Este segundo bucle lo usaremos para recorrer el array y ver que números son pares y aquellos que lo sean
		 * los multiplicaremos por -1 para asi poder cambiar su signo.
		 */
		for (int i = 0; i < array.length; i++) {
			if (array [i] % 2 == 0) {
				array [i] = array [i] * -1;
			}
			System.out.print(array [i] + " ");
		}
	}

}

package capitulo04_arrays.bloque06;

import metodos.UtilsArrays;

public class Ejercicio01apuestaLoteria {

	public static void main(String[] args) {
		int array[] = new int [7];
		
		iniciarArrayNoRepite(array);
		UtilsArrays.mostrarArray(array);
	}
	
	public static void iniciarArrayNoRepite(int[] loteria) {
		boolean yaExiste;
	
		/*
		 * Usamos un boolean, para ir marcando, si un número existe anteiormente o no.
		 */
		for (int i = 0; i < loteria.length; i++) {
			
			do {
				loteria[i] = (int) Math.round(Math.random()*(49-1) + (1));
				yaExiste = false;
				/*
				 * Cuando inicializamos un valor del array, damos por hecho que no existe, y luego
				 * comprobamos, si existe anteriormente o no.
				 */
				for (int j = i-1; j > -1; j--) {
					if (loteria[j] == loteria[i]) {
						// En caso en que ya exista, anteriormente yaexiste, será true.
						yaExiste = true;
					}
				}
			} while (yaExiste);
		}
	}
}

package capitulo03_bucles.bloque04;


public class Ejercicio03tablasMultiplicar {

	public static void main(String[] args) {
		int numTabla=0, factor=0, i=0;
		/*
		 * Declaramos e inicializamos las variables que vamos a necesitar.
		 * Primero, intento hacer los bucles que for, y luego lo cambio a "Do...while"
		 * Necesitamos dos bucles, el interno, para el calculo de la tabla de un número
		 * El bucle externo, para ir incrementando automaticamente, el número, del cual
		 * calcular la tabla.
		 */
		do {i++;
			numTabla++;
			factor++;
			System.out.println("\nTabla del " + numTabla);
			for (int i1=1; i1 < 11; i1++) {
				System.out.println("Tabla del " + numTabla +" = " +(i1* factor));
			} 
			/*
			 *La restricción del bucle, es <11 para que saque los 10 primeros números de cada tabla
			 */
			
		} while (i<15);
	}

}

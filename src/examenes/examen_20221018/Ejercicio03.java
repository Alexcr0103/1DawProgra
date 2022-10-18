package examenes.examen_20221018;

public class Ejercicio03 {

	public static void main(String[] args) {
		int num, contador = 0;
		
		/*
		 * Utilizamos el bucle for para obtener los números aleatorios, diciendole que el rango se comprenda desde que el contador es 0 hasta que sea 10
		 * para asi asegurarnos de que nos imprime 10 números aunque se repitan.
		 */
		for (int i = 0; contador < 10; i++) {
			num = (int) (Math.random()*100);
			
			/*
			 * Este if lo utilizamos para sacar los números pares comprendidos entre los intervalos señalados, una vez obtenido ese número incrementamos 
			 * en uno el contador
			 */
			if (num % 2 == 0 && (num >= 20 && num <= 30 || num >= 40 && num <= 50)){
				System.out.print(num + " ");
				contador ++;
			}
		}

	}

}

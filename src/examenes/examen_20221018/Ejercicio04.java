package examenes.examen_20221018;

public class Ejercicio04 {

	public static void main(String[] args) {
		int num;
		
		/*
		 * El primer bucle lo usamos para generar los 10 números aleatorios
		 */
		for (int i = 1; i < 10; i++) {
			num = (int) (Math.random()*100);
			System.out.print("\nNúmero aleatorio: " + num + "\n");
			
			/*
			 *El bucle anidado, para que, del número aleatorio que se ha generado,
			 *comprobar, si al dividirse entre cada número, su resto es 0. 
			 *Si el resto, es 0, significa, que es divisor, por lo tanto, lo imprimimos.
			 */
			for (int j = 1; j < ( num / 2) ; j++) {
				if (num % j == 0) {
				System.out.println("Divisor de "+ num + " - " + j);
				}
			}
		}

	}

}

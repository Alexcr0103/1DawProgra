package examenes.examen_20221018;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Declaramos las variables
		 */
		int num, sum5 = 0, contImpar = 0, sumaImpar = 0;
		System.out.println("Números al azar");
		
		/*
		 * Realizamos el bucle for para que nos muestre los 10 números aleatorios. Los números aleatorios los generamos mediante el Math.random.
		 * Una vez generados los números aleatorios mediante el primer if identificaremos los múltiplos de 5, una vez identificados los iremos almacenando y sumando en la variable sum5
		 * En el segundo if identificaremos los números pares, donde tambien obtendremos la suma de estos y mediante el contador contImpar la cantidad de números impares que salen.
		 */
		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random()*100);
			System.out.print(num + " ");
			
			if (num % 5 == 0) {
				sum5 = num + sum5;
			}
			
			if ( num % 2 != 0) {
				sumaImpar = num + sumaImpar;
				contImpar ++;
			}
		}
		/*
		 * Una vez obtenido lo que queremos, mostramos la información en pantalla, en el primer syso mostramos la suma de los múltiplos de 5
		 * En el segundo syso mostramos la media de los números impares calculada dividiendo la suma de todos los números impares entre la cantidad de números impares salida.
		 */
		System.out.println("\nLa suma de los múltiplos de 5 es: " + sum5);
		System.out.println("\nLa media de los números impares es: " + (sumaImpar / contImpar));
	}

}

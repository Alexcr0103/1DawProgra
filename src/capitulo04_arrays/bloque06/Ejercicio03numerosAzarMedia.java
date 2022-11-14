package capitulo04_arrays.bloque06;

public class Ejercicio03numerosAzarMedia {

	public static void main(String[] args) {
		float media, suma = 0, num = 0;
		int contador=0;
		
		/*
		 * Como hay que generar, minimo un número, usamos un "do...while", y hacemos que se repita mientras que sea mayor que 500.5, o menor que 499.5.0
		 */
		do {
			num = (int) Math.round(Math.random()*1000);
			contador++;
			suma = num + suma;
			media = suma/contador;
			
		}while ((media > 500.5) || (media < 499.5));
		
		System.out.println("Se han generado " + contador + " números, con una media de " + media);

	}

}

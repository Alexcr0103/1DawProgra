package examenes.examen_20221018;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int numUsuario, num;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un númro de una única cifra");
		numUsuario = sc.nextInt();
		
		/*
		 * Con el bucle for generamos los 10 números aleatorios
		 * Luego con el if mediante el símbolo del resto conseguimos averiguar que números acaban en el número indicado por el usuario.
		 * Si dividimos uno de los números generados entre 10, nos dará como resto su ultimo número, si esto lo igualamos al número introducido por el usuario, mediante el if 
		 * podremos ver si el número acaba en dicho digito.
		 */
		for (int i = 0; i < 100; i++) {
			num = (int) (Math.random()*100); 
			System.out.print(num + " ");
			System.out.print("\n");
			if ( num % 10 == numUsuario) {
				System.out.println("\n" + num + "\ncontiene la cifra " + numUsuario + "\n");
			}
		}
	}

}

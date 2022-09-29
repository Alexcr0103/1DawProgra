package capitulo02_condicionales.bloque01;

import java.util.Scanner;

public class Ejercicio03pedirCincoVariablesEnseñarMayor {

	public static void main(String[] args) {
		
		/*
		 * Declaramos variables, en este caso 6 enteros, cinco de ellos seran números introducidos por el usuario, uno sera una variable que usaremos para guardar al mayor de estos introducidos
		 * Importamos tambien Scanner
		 */
		
		int num1, num2, num3, num4, num5, mayor;
		
		Scanner sc=new Scanner(System.in);
		
		/*
		 * Pedimos al usuario que introduzca cinco números
		 */
		System.out.println("Introduzca cinco números");
		
		/*
		 * A continuación usaremos el primer número introducido como mayor, a partir de aquí cada número que introduzca el usuario lo compararemos con el mayor actual, si el número es mayor a la 
		 * variable guardada, este lo sustituira y se convertira en el nuevo mayor. Este paso se realizará con los 5 números introducidos por el usuario, mostrando al final, el mayor de todos.
		 */
		num1=sc.nextInt();
		
		mayor=num1;
		
		num2=sc.nextInt();
		
			if (num2>mayor) {
			mayor=num2;
			}
		
		num3=sc.nextInt();
			if(num3>mayor) {
			mayor=num3;
			}
		
		num4=sc.nextInt();
			if(num4>mayor) {
			mayor=num4;
			}
		
		num5=sc.nextInt();
			if(num5>mayor) {
			mayor=num5;
			}
		
		System.out.println("El número mayor de los introducidos es " + mayor);
	}

}

package capitulo02_condicionales.bloque01;

import java.util.Scanner;

public class Ejercicio04pedirCincoVariablesEnseñarMenor {

	public static void main(String[] args) {

		/*
		 * Declaramos variables, en este caso 6 enteros, cinco de ellos seran números introducidos por el usuario, uno sera una variable que usaremos para guardar al menor de estos introducidos
		 * Importamos tambien Scanner
		 */
		
		int num1, num2, num3, num4, num5, menor;
		
		Scanner sc=new Scanner(System.in);
		
		/*
		 * Pedimos al usuario que introduzca cinco números
		 */
		System.out.println("Introduzca cinco números");
		
		/*
		 * A continuación usaremos el primer número introducido como menor, a partir de aquí cada número que introduzca el usuario lo compararemos con el menor actual, si el número es menor a la 
		 * variable guardada, este lo sustituira y se convertira en el nuevo menor. Este paso se realizará con los 5 números introducidos por el usuario, mostrando al final, el menor de todos.
		 */
		num1=sc.nextInt();
		
		menor=num1;
		
		num2=sc.nextInt();
		
			if (num2<menor) {
			menor=num2;
			}
		
		num3=sc.nextInt();
			if(num3<menor) {
			menor=num3;
			}
		
		num4=sc.nextInt();
			if(num4<menor) {
			menor=num4;
			}
		
		num5=sc.nextInt();
			if(num5<menor) {
			menor=num5;
			}
		
		System.out.println("El número menor de los introducidos es " + menor);

	}

}

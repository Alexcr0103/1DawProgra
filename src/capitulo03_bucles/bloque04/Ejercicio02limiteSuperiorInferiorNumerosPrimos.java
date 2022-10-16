package capitulo03_bucles.bloque04;

import java.util.Scanner;

public class Ejercicio02limiteSuperiorInferiorNumerosPrimos {

	public static void main(String[] args) {
		int limInf=0, limSup, num;
		boolean esprimo=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el límite inferior: ");
		limInf=sc.nextInt();
		System.out.println("Introduce el límite superior: ");
		limSup=sc.nextInt();
		num=limInf+1;
		/*
		 * Es necesario, asignar el valor de num, despues de inicializar "limInf", ya que si no,
		 * El  valor, será siempre 1 porque "limInf" es 0.
		 */
		
		/*
		 * El primer bucle, comprobará cada uno de los números del intervalo.
		 */
		do {
			
			int i=2; 
			/*
			 * La variable "i", tiene uqe ser igual a 2, porque todos los números, tienen el 1
			 * como divisor, entonces, hay que comprobar, a partir del divisor 2.
			 */
			
			/*
			 * El segundo bucle, comprobará, si es primo, o compuesto.
			 */
			while (i<(num/2+1)) {
				if (num % i ==0) {
					esprimo=false;
					break;
				}
				/*
				 * Es necesario, incrementar el valor de "i", para comprobar, el siguiente posible divisor.
				 */
				i++; 
			}
			/*
			 * Una vez, hemos obtenido, los divisores, si hay, ya sabemos, si el número que hemos comprobado,
			 * es primo, o compuesto. Utilizamos la variable booleana.
			 */

			if (esprimo==true) System.out.println("El número " + num+ " es primo.");
			else {System.out.println("El número "+ num + " es compuesto.");
				esprimo = true;
			}	
			num++; 
			/*
			 * Incrementamos de forma simple, para que compruebe, el siguiente número dentro del intervalo
			 * entre los límites
			 */
			
			/*
			 * Ya que num, es limInf + 1, no tiene sentido, poner en la condición, que sea mayor que limInf.
			 */
		} while (num < limSup); 

	}

}

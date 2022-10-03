package capitulo02_condicionales.bloque03;

import java.util.Scanner;

public class Ejercicio02calculadoraAvanzada {

	public static void main(String[] args) {
		
		/*
		 * Declaro las variables.
		 */
		int opcion;
		
		Scanner sc = new Scanner (System.in);
		
		/*
		 * Pido al usuario que escoja la opción
		 */
		System.out.println("Elija mediante el número, la operación que desea realizar.");
		System.out.println("\n1.-Raiz\n2.-Potencia\n3.-División");
		
		opcion= sc.nextInt();
		
		/*
		 * Realizo el switch y expongo los diferentes casos.
		 */
		switch (opcion) {
		 
		case 1:
			/*
			 * Hago el calculo de una raiz utilizando math pow. Para ello pasamos la raiz a un número con exponente, donde el radicando
			 * sería el número, y el resultado de dividir 1 entre el indice sería el exponente.
			 */
			double radicando, indice;
			
			System.out.println("Deme un radicando e indíqueme un indice (Introduce los valores en el orden pedido");
			radicando = sc.nextDouble();
			indice = sc.nextDouble();
			
			System.out.println("La raiz de " +  radicando + " es " + (Math.pow(radicando, 1.0 / indice)));
			break;
		case 2: 
			/*
			 * Hago una multiplicación
			 */
			int num1, num2;
			
			System.out.println("\nIntroduzca dos números");
			num1 = sc.nextInt();
			num2 =sc.nextInt();
			
			System.out.println("El resultado es " + num1*num2);
			break;
		case 3:
			/*
			 * Hago una division
			 */
			int num3,num4;
			
			System.out.println("\nIntroduzca un dividendo y un divisor");
			num3 = sc.nextInt();
			num4 = sc.nextInt();
			
			System.out.println("El resultado es " + num3 / num4);
			break;
		}
	}

}

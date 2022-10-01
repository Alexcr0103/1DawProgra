package capitulo02_condicionales.bloque03;

import java.util.Scanner;

public class Ejercicio02calculadoraAvanzada {

	public static void main(String[] args) {
		
		int opcion;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Elija mediante el número, la operación que desea realizar.");
		System.out.println("\n1.-Raiz\n2.-Potencia\n3.-División");
		
		opcion= sc.nextInt();
		
		switch (opcion) {
		case 1:
			double radicando, indice;
			
			System.out.println("Deme un radicando e indíqueme un indice (Introduce los valores en el orden pedido");
			radicando = sc.nextDouble();
			indice = sc.nextDouble();
			
			System.out.println("La raiz de " +  radicando + " es " + (Math.pow(radicando, 1.0 / indice)));
			break;
		case 2: 
			int num1, num2;
			
			System.out.println("\nIntroduzca dos números");
			num1 = sc.nextInt();
			num2 =sc.nextInt();
			
			System.out.println("El resultado es " + num1*num2);
			break;
		case 3:
			int num3,num4;
			
			System.out.println("\nIntroduzca un dividendo y un divisor");
			num3 = sc.nextInt();
			num4 = sc.nextInt();
			
			System.out.println("El resultado es " + num3 / num4);
			break;
		}
	}

}

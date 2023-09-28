package capitulo02_condicionales.bloqueRepaso.bloque3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Elija mediante el número, la operación que desea realizar");
		System.out.println("\n1-Raíz\n2-Potencia\n3-División");
		
		num = sc.nextInt();
		
		switch (num) {
			
			case 1:
				double radicando, indice;
				
				System.out.println("Dame un radicando");
				
				radicando = sc.nextDouble();
				
				System.out.println("Dame un índice");
				
				indice = sc.nextDouble();
				
						
				System.out.println("La raíz de " + radicando + " es " + (Math.pow(radicando, 1.0/indice)));
				
				break;
				
			case 2:
				int num1, num2;
				
				System.out.println("Dame dos números");
				
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				
				System.out.println("El resultado de la potencia es " + num1 * num2);
				
				break;
			
			case 3: 
				double num3, num4;
				
				System.out.println("Dame dos números");
				
				num3 = sc.nextInt();
				num4 = sc.nextInt();
				
				System.out.println("El resultado de la división es " + num3 / num4);
				break;
		}
		
	}

}

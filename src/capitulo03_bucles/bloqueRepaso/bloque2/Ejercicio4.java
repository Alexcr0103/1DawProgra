package capitulo03_bucles.bloqueRepaso.bloque2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num, limite;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca el número del cual quieras saber sus múltiplos");
		
		num = sc.nextInt();
		
		System.out.println("Introduzca el límite de los múltiplos");
		
		limite = sc.nextInt();
		
		for (int i = 0; (i * num) < limite; i++) {
			System.out.println("Múltiplo de " + num + " = " + (i * num));
		}
	}

}

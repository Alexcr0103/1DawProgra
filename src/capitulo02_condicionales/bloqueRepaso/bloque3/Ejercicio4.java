package capitulo02_condicionales.bloqueRepaso.bloque3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int compra, pagado, cambio, mon100 = 0, mon50 = 0, mon25 = 0, mon5 = 0, mon1 = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca el precio de compra");
		
		compra = sc.nextInt();
		
		System.out.println("Introduzca la cantidad abonada");
		
		pagado = sc.nextInt();
		
		cambio = pagado - compra;
		
		if (cambio >= 100) {
			mon100 = cambio / 100;
			cambio = cambio % 100;
		}
		
		if (cambio >= 50) {
			mon50 = cambio / 50;
			cambio = cambio % 50;
		}
		
		if (cambio >= 25) {
			mon25 = cambio / 25;
			cambio = cambio % 25;
		}
		
		if (cambio >= 5) {
			mon5 = cambio / 5;
			cambio = cambio % 5;
		}
		
		if (cambio >= 1) {
			mon1 = cambio / 1;
			cambio = cambio % 1;
		}
		
		System.out.println("El número de monedas de 100 a devolver es de " + mon100);
		System.out.println("El número de monedas de 50 a devolver es de " + mon50);
		System.out.println("El número de monedas de 25 a devolver es de " + mon25);
		System.out.println("El número de monedas de 5 a devolver es de " + mon5);
		System.out.println("El número de monedas de 1 a devolver es de " + mon1);
	}

}

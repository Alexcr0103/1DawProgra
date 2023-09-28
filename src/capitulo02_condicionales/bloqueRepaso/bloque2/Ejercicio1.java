package capitulo02_condicionales.bloqueRepaso.bloque2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num, sumBajo = 0, sumMedio = 0, sumAlto = 0, numNegativo = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			numNegativo = num + numNegativo;
		}else {
			if (num <= 25) {
				sumBajo = num + sumBajo;
			}else {
				if (num <= 250) {
					sumMedio = num + sumMedio;
				}else {
					if(num > 250) {
						sumAlto = num + sumAlto;
					}
				}
			}
		}
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			numNegativo = num + numNegativo;
		}else {
			if (num <= 25) {
				sumBajo = num + sumBajo;
			}else {
				if (num <= 250) {
					sumMedio = num + sumMedio;
				}else {
					if(num > 250) {
						sumAlto = num + sumAlto;
					}
				}
			}
		}
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			numNegativo = num + numNegativo;
		}else {
			if (num <= 25) {
				sumBajo = num + sumBajo;
			}else {
				if (num <= 250) {
					sumMedio = num + sumMedio;
				}else {
					if(num > 250) {
						sumAlto = num + sumAlto;
					}
				}
			}
		}
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			numNegativo = num + numNegativo;
		}else {
			if (num <= 25) {
				sumBajo = num + sumBajo;
			}else {
				if (num <= 250) {
					sumMedio = num + sumMedio;
				}else {
					if(num > 250) {
						sumAlto = num + sumAlto;
					}
				}
			}
		}
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			numNegativo = num + numNegativo;
		}else {
			if (num <= 25) {
				sumBajo = num + sumBajo;
			}else {
				if (num <= 250) {
					sumMedio = num + sumMedio;
				}else {
					if(num > 250) {
						sumAlto = num + sumAlto;
					}
				}
			}
		}
		
		System.out.println("\nEl total de la suma de los números introducidos es" + "\nNúmeros negativos " + "=" + numNegativo + "\nNúmeros bajos" + "=" + sumBajo + "\nNúmeros medios" + "=" 
		+ sumMedio + "\nNúmeros altos" + "=" + sumAlto);
	}

}

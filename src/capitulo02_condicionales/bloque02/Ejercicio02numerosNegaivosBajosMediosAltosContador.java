package capitulo02_condicionales.bloque02;

import java.util.Scanner;

public class Ejercicio02numerosNegaivosBajosMediosAltosContador {

	public static void main(String[] args) {
	
		int num, sumbajo=0, summedio=0, sumalto=0;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Ha introducido un valor erróneo");
			System.exit(0);			
		}else {
			if (num <= 25) {
				sumbajo++;
			}else {
				if(num > 25 & num <=250 ) {
					summedio++;
				}else {
					if (num > 250) {
						sumalto++;
					}
				}
			}
		}
		num = sc.nextInt();
		
		if (num < 0) {
			System.exit(0);
		}else {
			if (num <= 25) {
				sumbajo++;
			}else {
				if(num > 25 & num <=250 ) {
					summedio++;
				}else {
					if (num > 250) {
						sumalto++;
					}
				}
			}
		}
		num = sc.nextInt();
		
		if (num < 0) {
			System.exit(0);
		}else {
			if (num <= 25) {
				sumbajo++;
			}else {
				if(num > 25 & num <=250 ) {
					summedio++;
				}else {
					if (num > 250) {
						sumalto++;
					}
				}
			}
		}
		num = sc.nextInt();
		
		if (num < 0) {
			System.exit(0);
		}else {
			if (num <= 25) {
				sumbajo++;
			}else {
				if(num > 25 & num <=250 ) {
					summedio++;
				}else {
					if (num > 250) {
						sumalto++;
					}
				}
			}
		}
		num = sc.nextInt();
		
		if (num < 0) {
			System.exit(0);
		}else {
			if (num <= 25) {
				sumbajo++;
			}else {
				if(num > 25 & num <=250 ) {
					summedio++;
				}else {
					if (num > 250) {
						sumalto++;
					}
				}
			}
		}
		
		
		System.out.println("La suma de números bajos es " + sumbajo);
		System.out.println("La suma de números medios es " + summedio);
		System.out.println("La suma de números altos es " + sumalto);
	}

}

package capitulo02_condicionales.bloque02;

import java.util.Scanner;

public class Ejercicio01numerosNegativosBajosMediosMayores {

	public static void main(String[] args) {
		
		int num, sumnegativo=0, sumbajo=0, summedio=0, sumalto=0;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			sumnegativo = num;
		}else {
			if (num <= 25) {
				sumbajo = num;
			}else {
				if(num > 25 & num <=250 ) {
					summedio = num;
				}else {
					if (num > 250) {
						sumalto = num;
					}
				}
			}
		}
		num = sc.nextInt();
		
		if (num < 0) {
			sumnegativo = num + sumnegativo;
		}else {
			if (num <= 25) {
				sumbajo = num + sumbajo;
			}else {
				if(num > 25 & num <=250 ) {
					summedio = num + summedio;
				}else {
					if (num > 250) {
						sumalto = num + sumalto;
					}
				}
			}
		}
		num = sc.nextInt();
		
		if (num < 0) {
			sumnegativo = num + sumnegativo;
		}else {
			if (num <= 25) {
				sumbajo = num + sumbajo;
			}else {
				if(num > 25 & num <=250 ) {
					summedio = num + summedio;
				}else {
					if (num > 250) {
						sumalto = num + sumalto;
					}
				}
			}
		}
		num = sc.nextInt();
		
		if (num < 0) {
			sumnegativo = num + sumnegativo;
		}else {
			if (num <= 25) {
				sumbajo = num + sumbajo;
			}else {
				if(num > 25 & num <=250 ) {
					summedio = num + summedio;
				}else {
					if (num > 250) {
						sumalto = num + sumalto;
					}
				}
			}
		}
		num = sc.nextInt();
		
		if (num < 0) {
			sumnegativo = num + sumnegativo;
		}else {
			if (num <= 25) {
				sumbajo = num + sumbajo;
			}else {
				if(num > 25 & num <=250 ) {
					summedio = num + summedio;
				}else {
					if (num > 250) {
						sumalto = num + sumalto;
					}
				}
			}
		}
		
		System.out.println("La suma de números negativos es " + sumnegativo);
		System.out.println("La suma de números bajos es " + sumbajo);
		System.out.println("La suma de números medios es " + summedio);
		System.out.println("La suma de números altos es " + sumalto);
	}

}

package capitulo02_condicionales.bloque02;

import java.util.Scanner;

public class Ejercicio01numerosNegativosBajosMediosMayores {

	public static void main(String[] args) {
		
		/*
		 * Declaramos las variables.
		 */
		
		int num, sumnegativo=0, sumbajo=0, summedio=0, sumalto=0;
		
		/**
		 * Importamos la clase Scanner
		 */
		Scanner sc= new Scanner (System.in);
		
		/*
		 *Le pedimos al usuario que introduzca cinco números.
		 */
		System.out.println("Introduce cinco número");
		
		num = sc.nextInt();
		
		/*
		 * Voy haciendo los condicionales, con cada uno de los números.	
		 * Si el num, es menor que 0 se sumará a "sumanegativos", y si no, el "else"
		 * Anidamos el siguiente "if". Si no es menor que 0, puede seguir siendo
		 * de cualquiera de los otros grupos. Por lo tanto anidamos otro "if" con la segunda
		 * restricción, y así seguimos con todos los números.
		 */

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
		
		/*
		 * Una vez clasificados los números introducidos por el usuario, le mostraremos en pantalla un mensaje con la información obtenida.
		 */
		System.out.println("La suma de números negativos es " + sumnegativo);
		System.out.println("La suma de números bajos es " + sumbajo);
		System.out.println("La suma de números medios es " + summedio);
		System.out.println("La suma de números altos es " + sumalto);
	}

}

package capitulo02_condicionales.bloque02;

import java.util.Scanner;

public class Ejercicio02numerosNegaivosBajosMediosAltosContador {

	public static void main(String[] args) {
		
		/*
		 * Declaramos las variables.
		 */
		int num, sumbajo=0, summedio=0, sumalto=0;
		
		/**
		 * Importamos la clase Scanner
		 */
		Scanner sc= new Scanner (System.in);
		
		/*
		 *Le pedimos al usuario que introduzca cinco números.
		 */
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		/*
		 * En caso de que uno de los números introducidos sea menor que 0 el programa automaticamente se acabará.
		 * En caso de ser mayor que 0, ira pasando restricciones producidas por los if hasta llegar a la adecuada, causando un incremento
		 * (mediante el símbolo ++) en dicha clasificación. De esta manera podremos ver cuantos números de cada clasificación ha introducido
		 */
		if (num < 0) {
			System.out.println("Ha introducido un valor erróneo");
			System.exit(0);			
		}else {
			if (num <= 25) {
				sumbajo++;
			}else {
				if(num <=250 ) {
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
				if( num <=250 ) {
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
				if( num <=250 ) {
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
				if( num <=250 ) {
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
				if( num <=250 ) {
					summedio++;
				}else {
					if (num > 250) {
						sumalto++;
					}
				}
			}
		}
		
		/*
		 * Por último como siempre, le mostramos al usuario la información obtenida.
		 */
		System.out.println("Cantidad de números bajos introducidos " + sumbajo );
		System.out.println("Cantidad de números bajos introducidos " + summedio);
		System.out.println("Cantidad de números bajos introducidos " + sumalto);
	}

}

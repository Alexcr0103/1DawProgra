package capitulo02_condicionales.bloqueRepaso.bloque2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num, contBajo = 0, contMedio = 0, contAlto = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Has introducido un valor no válido");
			System.exit(0);
		}else {
			if (num <= 25) {
				contBajo++;
			}else {
				if (num <= 250) {
					contMedio++;
				}else {
					if(num > 250) {
						contAlto++;
					}
				}
			}
		}
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Has introducido un valor no válido");
			System.exit(0);
		}else {
			if (num <= 25) {
				contBajo++;
			}else {
				if (num <= 250) {
					contMedio++;
				}else {
					if(num > 250) {
						contAlto++;
					}
				}
			}
		}
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Has introducido un valor no válido");
			System.exit(0);
		}else {
			if (num <= 25) {
				contBajo++;
			}else {
				if (num <= 250) {
					contMedio++;
				}else {
					if(num > 250) {
						contAlto++;
					}
				}
			}
		}
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Has introducido un valor no válido");
			System.exit(0);
		}else {
			if (num <= 25) {
				contBajo++;
			}else {
				if (num <= 250) {
					contMedio++;
				}else {
					if(num > 250) {
						contAlto++;
					}
				}
			}
		}
		
		System.out.println("Introduce un número");
		
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Has introducido un valor no válido");
			System.exit(0);
		}else {
			if (num <= 25) {
				contBajo++;
			}else {
				if (num <= 250) {
					contMedio++;
				}else {
					if(num > 250) {
						contAlto++;
					}
				}
			}
		}
		
		System.out.println("\nEl total de números introducidos es" + "\nNúmeros bajos" + "=" + contBajo + "\nNúmeros medios" + "=" 
		+ contMedio + "\nNúmeros altos" + "=" + contAlto);
	}

}

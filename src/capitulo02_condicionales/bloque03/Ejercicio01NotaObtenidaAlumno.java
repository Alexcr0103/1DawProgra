package capitulo02_condicionales.bloque03;

import java.util.Scanner;

public class Ejercicio01NotaObtenidaAlumno {

	public static void main(String[] args) {
		
		/*
		 * Declaramos la variable nota.
		 */
		int nota;
		
		Scanner sc = new Scanner (System.in);
		
		/*
		 * Le pedimos al usuario que introduzca la nota del alumno.
		 */
		System.out.println("Introduzca la nota del alumno");
		nota = sc.nextInt();

		/*
		 * Utilizamos el switch para ver todos los posibles casos.
		 */
		switch (nota) {
			case 0:
			case 1:
			case 2:
				System.out.println("\nMuy deficiente");
			break;			
			case 3:
			case 4:
				System.out.println("\nDeficiente");
			break;			
			case 5:
				System.out.println("\nSuficiente");
			break;			
			case 6:
				System.out.println("\nBien");
			break;			
			case 7:
			case 8:
				System.out.println("\nNotable");
			break;			
			case 9:
			case 10:
				System.out.println("\nSobresaliente");
			break;
		}
	}

}

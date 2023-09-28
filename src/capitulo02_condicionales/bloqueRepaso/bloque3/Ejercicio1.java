package capitulo02_condicionales.bloqueRepaso.bloque3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int nota;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca la nota del alumno");
		nota = sc.nextInt();
		
		switch (nota) {
			case 0:
			case 1:
			case 2:
				
			System.out.println("\nMuy deficiente");
			break;
			
			case 3:
			case 4:
				
			System.out.println("\nInsuficiente");
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

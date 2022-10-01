package capitulo02_condicionales.bloque03;

import java.util.Scanner;

public class Ejercicio04areasSuperficies {

	public static void main(String[] args) {
		int opcion;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Elija mediante el número, la operación que desea realizar.");
		System.out.println("\n1.-Cálculo de la hipotenusa de un triángulo\n2.-Cálculo de la superficie de una circunferencia"
				+ "\n3.-Cálculo del perímetro de una circunferencia\n4.-Cálculo del área de un rectángulo\n5.-Cálculo del área de un triángulo"
				+ "\n0.-Salir de la aplicación");
		
		opcion= sc.nextInt();
		
		switch (opcion) {
			case 0:
				
				System.out.println("\nHa salido del programa");
				System.exit(0);
		
			case 1:
				double num1, num2, cat1, cat2, sumCatetos;
			
				System.out.println("\nIntroduce el valor de los dos catetos");
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				cat1 = Math.pow(num1, 2);
				cat2 = Math.pow(num2, 2);
				sumCatetos = cat1 + cat2;
			
				System.out.println("La hipotenusa es " + Math.sqrt(sumCatetos));
			break;
			
			case 2:
				double radio,radioCuadrado, areaCircunferencia;
			 
				System.out.println("\nIntroduce la longitud del radio");
				radio =sc.nextDouble();
				radioCuadrado = Math.pow(radio, 2);
				areaCircunferencia = Math.PI * radioCuadrado;
			 
				System.out.println("El área de la circunferencia es " + areaCircunferencia);
			 break;
		
			case 3:
				double radio2, diametro;
			
				System.out.println("\nIntroduce la longitud del radio");
				radio2 = sc.nextDouble();
				diametro = radio2 * 2;
			
				System.out.println("El perímetro de la circunferencia es " + Math.PI * diametro);
			break;
			 
			case 4:
				double base, altura;
			
				System.out.println("\nIntroduce la base y la altura respectivamente");
			
				base = sc.nextDouble();
				altura = sc.nextDouble();
			
				System.out.println("El área del rectángulo es " + base * altura);
			break;
			
			case 5:
				double  base1, altura1, baseAltura;
				
				System.out.println("\nIntroduce la base y la altura del tríangulo");
				
				base1 = sc.nextDouble();
				altura1 = sc.nextDouble();
				baseAltura = base1 * altura1;
				
				System.out.println("El área del triángulo es " + baseAltura / 2);
			break;
			
			default: 
				System.out.println("\nOpción incorrecta");
			
		}

	}

}

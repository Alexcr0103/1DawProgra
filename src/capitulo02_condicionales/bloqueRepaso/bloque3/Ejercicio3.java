package capitulo02_condicionales.bloqueRepaso.bloque3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Elija el cálculo que quiere hacer introduciendo su número correspondiente.");
		System.out.println("\n1.Cálculo de la hipotenusa de un triángulo \n2.Cálculo de una superficie de una "
				+ "circunferencia \n3.Cálculo del perímetro de una circunferencia \n4.Cálculo del área de un "
				+ "rectángulo \n5.Cálculo del área de un triángulo \n0.Salir de la aplicación");
		
		num = sc.nextInt();
		
		switch(num) {
			case 1:
				double cateto1, cateto2, num1, num2, sumaCatetos;
				System.out.println("Introduzca el valor del primer cateto");
				
				num1 = sc.nextInt();
				
				System.out.println("Introduzca el valor del segundo cateto");
				
				num2 = sc.nextInt();
				
				cateto1 = Math.pow(num1, 2);
				cateto2 = Math.pow(num2, 2);
				sumaCatetos = cateto1 + cateto2;
				
				System.out.println("La hipotenusa es " + Math.sqrt(sumaCatetos));
				
				break;
			
			case 2:
				double radio, radioCuadrado, areaCircunferencia;
				
				System.out.println("Introduzca el radio");
				
				radio = sc.nextInt();
				radioCuadrado = Math.pow(radio, 2);
				areaCircunferencia = Math.PI * radioCuadrado;
				
				System.out.println("La superficie de la circunferencia es " + areaCircunferencia);
				
				break;
				
			case 3:
				double radio2, diametro, perimetroCircunferencia;
				
				System.out.println("Introduzca el radio de la circunferencia");
				
				radio2 = sc.nextDouble();
				diametro = radio2 * 2;
				perimetroCircunferencia = Math.PI * diametro;
				
				System.out.println("El perimetro de la circunferencia es " + perimetroCircunferencia);
				
				break;
			
			case 4:
				int base, altura;
				
				System.out.println("Introduzca la base");
				
				base = sc.nextInt();
				
				System.out.println("Introduzca la altura");
				
				altura = sc.nextInt();
				
				System.out.println("El área del rectángulo es " + base * altura);
				
				break;
				
			case 5:
				double base2, altura2, areaTriangulo;
				
				System.out.println("Introduzca la base");
				
				base2 = sc.nextDouble();
				
				System.out.println("Introduzca la altura");
				
				altura2 = sc.nextDouble();
				
				areaTriangulo = ((base2 * altura2) / 2);
				
				System.out.println("El área del triángulo es " + areaTriangulo);
				
				break;
				
			case 0: 
				
				System.out.println("Programa Finalizado");
				break;
				
			default:
				System.out.println("Opción incorrecta");
		}
	}

}

package capitulo02_condicionales.bloque03;

import java.util.Scanner;

public class Ejercicio03areasSuperficies {

	public static void main(String[] args) {
		/*
		 * Declaro variables
		 */
		int opcion;
		
		Scanner sc = new Scanner (System.in);
		/*
		 * Pido al usuario que escoja una opción.
		 */
		System.out.println("Elija mediante el número, la operación que desea realizar.");
		System.out.println("\n1.-Cálculo de la hipotenusa de un triángulo\n2.-Cálculo de la superficie de una circunferencia"
				+ "\n3.-Cálculo del perímetro de una circunferencia\n4.-Cálculo del área de un rectángulo\n5.-Cálculo del área de un triángulo"
				+ "\n0.-Salir de la aplicación");
		
		opcion= sc.nextInt();
		/*
		 * Realizo un switch con los diferentes casos.
		 */
		switch (opcion) {
			case 0:
				/*
				 * En este caso lo utilizamos para salir del programa
				 */
				System.out.println("\nHa salido del programa");
				System.exit(0);
		
			case 1:
				/*
				 * Buscamos calcular la hipotenusa de un triángulo rectángulo, donde la hipotenusa al cuadrado, es igual a la suma de los catetos al 
				 * cuadrado. Primero calculamos los catetos al cuadrado y los sumamos. Despues mediante la instrucción math.sqrt realizamos la raiz
				 * cuadrada del resultado obtenido.
				 */
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
				/*
				 * Calcularemos el area de una circunferencia. Para ello pediremos la longitud del radio y la formula que usaremos será
				 * la de PI por el radio al cuadrado. Primero calcularemos el radio al cuadrado y mediante la instrucción math.pi multiplicaremos este
				 * con el resultado obtenido de radio al cuadrado. 
				 */
				double radio,radioCuadrado, areaCircunferencia;
			 
				System.out.println("\nIntroduce la longitud del radio");
				radio = sc.nextDouble();
				radioCuadrado = Math.pow(radio, 2);
				areaCircunferencia = Math.PI * radioCuadrado;
			 
				System.out.println("El área de la circunferencia es " + areaCircunferencia);
			 break;
		
			case 3:
				/*
				 * Calculamos el perímetro de una circunferencia y para ello usaremos la fórmula de 2 por PI por el radio. Empezaremos calculando
				 * 2 por el radi lo que nos daría el diametro, una vez calculado esto multiplicaremos el diámetro por el número PI. Volveremos a usar
				 * la instrucción Math.PI para ello.
				 */
				double radio2, diametro;
			
				System.out.println("\nIntroduce la longitud del radio");
				radio2 = sc.nextDouble();
				diametro = radio2 * 2;
			
				System.out.println("El perímetro de la circunferencia es " + Math.PI * diametro);
			break;
			 
			case 4:
				/*
				 * Calculamos el área de un rectángulo. La operación sería base por la altura.
				 */
				double base, altura;
			
				System.out.println("\nIntroduce la base y la altura respectivamente");
			
				base = sc.nextDouble();
				altura = sc.nextDouble();
			
				System.out.println("El área del rectángulo es " + base * altura);
			break;
			
			case 5:
				/*
				 * Calculamos el área de un rectángulo, donde sería base por altura entre 2. Para ello calcularíamos primero base por la altura y luego
				 * realizariamos la división de este resultado entre dos.
				 */
				double  base1, altura1, baseAltura;
				
				System.out.println("\nIntroduce la base y la altura del tríangulo");
				
				base1 = sc.nextDouble();
				altura1 = sc.nextDouble();
				baseAltura = base1 * altura1;
				
				System.out.println("El área del triángulo es " + baseAltura / 2);
			break;
			
			default: 
				/*
				 * Aquí indicariamos que en caso de no introducir ninguno de los casos expuestos con anterioridad el programa nos indicará que hemos
				 * elegido una opción incorrecta.
				 */
				System.out.println("\nOpción incorrecta");
			
		}

	}

}

package capitulo02_condicionales.bloque01;

import java.util.Scanner;

public class Ejercicio01pedirNumerosEnseñarMayor {

	public static void main(String[] args) {
		
		/*
		 * Declaramos las variables, en este caso serán dos int ya que ambos son números que pediremos al usuario
		 * Importamos tambien la clase Scanner ya que nos hará falta para pedirle al usuario dichos números
		 */
		int num1,num2;
		Scanner sc= new Scanner(System.in);
		
		/*
		 * Le pedimos al usuario que introduzca un número mediante Scanner
		 */
		System.out.println("Introduzca un número");
		
		num1=sc.nextInt();
		
		/*
		 * Pedimos al usuario que introduzca un segundo número
		 */
		System.out.println("Introduzca otro número");
		num2=sc.nextInt();
		
		/*
		 * Una vez tenemos los dos números, lo que haremos sera compararlos, para ver cual de ellos es mayor y así poder indicarselo en pantalla al usuario 
		 * mediante un Syso
		 */
		if(num1>num2) {
			System.out.println("El número mayor es " + num1);
		}else {
			System.out.println("El número mayor es " + num2);
		}
	}

}

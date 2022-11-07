package capitulo04_arrays.bloque02;

import java.util.Scanner;

public class Ejercicio06sentidoDesplazamiento {

	public static void main(String[] args) {
		int array[]= new int[5], aux, posiciones, direccion;
		Scanner sc=new Scanner(System.in);
		
		// Primer array, para inicializar el primer array.
		System.out.println("Array");
		for (int i=0; i < array.length; i++) {
			array[i]= (int) Math.round(Math.random()*100);
		}
		for (int i =0;i<array.length;i++) 	System.out.print(array[i] + " ");
		System.out.println("\nIndique la dirección a mover (0 para izquierda y 1 para derecha):");
		direccion=sc.nextInt();
		System.out.println("\nIntroduce el número de posiciones que quiere desplazar: ");
		posiciones=sc.nextInt();
		
		
		// Para cambiar, meto un if, (tambien podría meter un switch), para que si el usuario
		// quiere desplazar a derecha, el desplazamiento se haga a la derecha, y viceversa.
		
		System.out.println("\nArray Cambiado");
		
		// Desplazamiento a la derecha
		if (direccion == 1) {
			for (int i=0; i<posiciones;i++) {
				aux=array[array.length-1];
				for (int j=array.length-1; j>0;j--) {
					array[j]=array[j-1];
					}	
					array[0] = aux;
			}
			for (int i=0; i<array.length;i++) {
				System.out.print(array[i] + " ");
			}
		}
		
		// Desplazamiento a la izquierda.
		else if (direccion==0) {
			for (int i=0; i<posiciones;i++) {
				aux=array[0];
				for (int j=0; j<array.length-1;j++) {
					array[j]=array[j+1];
					}	
					array[array.length-1] = aux;
		}
			for (int i=0; i<array.length;i++) {
				System.out.print(array[i] + " ");
			}
		}

	}

}

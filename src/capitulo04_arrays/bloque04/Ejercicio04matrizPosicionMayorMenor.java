package capitulo04_arrays.bloque04;

import metodos.Utils;
import metodos.UtilsArrays;

public class Ejercicio04matrizPosicionMayorMenor {

	public static void main(String[] args) {
		
		int matriz[][] = new int[6][12];
		int mayor = 0, menor = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int num;
				do {
					num = Utils.obtenerNumeroAzar(0, 1000);
				} while (valorEstaEnMatriz(num, matriz));
				matriz[i][j] = num;
			}
		}
		UtilsArrays.mostrarMatriz(matriz);
		mayor = matriz[0][0]; 
		menor = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {				
				if (matriz [i][j] > mayor) {
					mayor = matriz[i][j];
				}
				
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("El número mayor de la matriz es " + mayor);
		System.out.println();
		System.out.println("El número menor de la matriz es " + menor);
	}
	
	public static boolean valorEstaEnMatriz (int valor, int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (valor == matriz[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}

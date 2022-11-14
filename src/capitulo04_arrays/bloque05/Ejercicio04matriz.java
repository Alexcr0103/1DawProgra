package capitulo04_arrays.bloque05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio04matriz {

	public static void main(String[] args) {
		int matriz[][]=new int[][] {{1, 0, 4},
									{0, 3, 4},
									{4, 5, 0}};
		

		
		// Método para inicializar con valores la matriz
		inicializarMatriz(matriz);
		// Método para visualizar la matriz.
		System.out.println("Matriz Original");
		visualizarMatriz(matriz);
		
		System.out.println();
		
		// Método para comprobar si la matriz es positiva.
		System.out.println(" La matriz es positiva: " + comprobarMatrizPositiva(matriz));
		
		// Método para comprobar si la matriz es diagonal.
		System.out.println(" La matriz es diagonal: " + comprobarMatrizDiagonal(matriz));
		
		// Método para comprobar si la matriz es triangular superior.
		System.out.println(" La matriz es triangular superior: " + comprobarMatrizTriangularSuperior(matriz));
		
		// Método para comprobar si la matriz es dispersa.
		System.out.println(" La matriz es dispersa: " + comprobarMatrizDispersa(matriz));
		
		// Método para introducir los valores de la matriz en un array.
		
		int array[] = construirArrayConValoresMatriz(matriz);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// Método para comprobar si la matriz es simetrica.
		System.out.println(" \nLa matriz es simétrica: " + comprobarMatrizSimetrica(matriz));
		
		// Método para calcular la matriz opuesta.
		System.out.println(" \nMatriz Opuesta: ");
		
		int opuesta[][]= calcularMatrizOpuesta(matriz);
		visualizarMatriz(opuesta);
		
		// Método para eliminar fila introducida por el usuario.
		//eliminarFila(matriz);
		
		
	}	
	/**
	 * 
	 * @param matriz
	 */
	public static void inicializarMatriz(int[][] matriz) {
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]= (int) Math.round(Math.random() * (200)) + (-100);
			}
		}
	}
	/**
	 * 
	 * @param matriz
	 */
	public static void visualizarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}	
	}
	/**
	 * 
	 */
	public static boolean comprobarMatrizPositiva(int[][] matriz) {
		boolean esMatrizPositiva = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					return !esMatrizPositiva;
				}
			}
		}
		return true;
	}
	
	/**
	 * 
	 */
	public static boolean comprobarMatrizDiagonal(int[][] matriz) {
		boolean esMatrizDiagonal = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <matriz[i].length; j++) {
				if (matriz[i][j] != 0 && i!=j) {
					esMatrizDiagonal=false;						
				}
			}
		}
		return esMatrizDiagonal;
	}
	
	/**
	 * 
	 */
	public static boolean comprobarMatrizTriangularSuperior(int[][] matriz) {
		boolean esMatrizTriangularSuperior = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < i ; j++) {
				if (matriz[i][j] != 0) {
					esMatrizTriangularSuperior=false;
				}
			}
		}
		return esMatrizTriangularSuperior;
	}
	/**
	 * 
	 */
	public static boolean comprobarMatrizDispersa(int[][] matriz) {
		boolean hayCero= false;
		for (int i = 0; i < matriz.length; i++) {
			hayCero=false;
			for (int j = 0; j < matriz[i].length ; j++) {
				if (matriz[i][j] == 0) {
					hayCero=true;
					break;
				}
			}
		}
		if (!hayCero) return false;
		
		for (int i = 0; i < matriz[i].length; i++) {
			boolean hayCeroColumna=false;
			for (int j = 0; j < matriz.length ; j++) {
				if (matriz[i][j] == 0) {
					hayCero=true;
					break;
				}
			}
		}
		return hayCero;
	}
	/**
	 * 
	 */
	public static int[] construirArrayConValoresMatriz(int[][] matriz) {
		int array[]=new int[matriz.length*matriz[0].length];
		int k=0;
		
		System.out.println("Array: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length ; j++) {
				array[k]= matriz[i][j];
				k++;
			}
		}
		return array;
	}
	
	public static boolean comprobarMatrizSimetrica(int[][] matriz) {
		boolean esMatrizSimetrica= true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length ; j++) {
				if (matriz[i][j] != matriz[j][i] && j != i) {
					esMatrizSimetrica=false;
				}
			}
		}
		return esMatrizSimetrica;
	}
	
	public static int[][] calcularMatrizOpuesta(int[][] matriz) {
		int opuesta[][]=new int[matriz.length][matriz[0].length];
		for (int i = 0; i < opuesta.length; i++) {
			for (int j = 0; j < opuesta[i].length ; j++) {
				opuesta[i][j] = -matriz[i][j];
			}
		}
		return opuesta;
	}
	/**
	 * 
	 * @param matriz
	 */
	public static void eliminarFila(int[][] matriz) {
		int matriz2[][]=new int[matriz.length-1][matriz.length];
		
		String str= JOptionPane.showInputDialog("Introduzca un primer número: ");
		int fila =Integer.parseInt(str);
		
		System.out.println("\nMatriz con fila eliminada: ");
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length ; j++) {
				if (fila != i) {
				matriz2[i][j] = matriz[i][j];
				System.out.print(matriz2[i][j] + "\t");
				}
			}
			System.out.println();

		}
	}
}



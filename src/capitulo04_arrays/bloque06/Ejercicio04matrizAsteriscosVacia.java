package capitulo04_arrays.bloque06;

public class Ejercicio04matrizAsteriscosVacia {

	public static void main(String[] args) {
		char matriz[][] = new char[20][10];
		char asterisco = '*';
		
		System.out.println("Matriz Impresa");
		System.out.println();
		mostrarAsteriscos(matriz, asterisco);
		introducirCero(matriz, asterisco);
		visualizarMatriz(matriz, asterisco);

	}
	/**
	 * 
	 * @param matriz
	 * @param asterisco
	 */
	public static void	mostrarAsteriscos(char[][] matriz, char asterisco) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 0 || i == matriz.length - 1) {
					matriz[i][j] = asterisco;
				}
				else {
					if (j == 0 || j == matriz[i].length - 1) {
						matriz[i][j]= asterisco;
					}
					else {
						matriz[i][j] = ' ';
					}
				}
			}
		}
	}		
	/**
	 * 
	 */
	public static void introducirCero(char matriz[][], char asterisco) {
		int posicionFila = (int) Math.round(Math.random()*(matriz.length-2) + 1);
		int posicionColumna=(int) Math.round(Math.random()*(matriz[0].length-2) + 1);
		
		matriz[posicionFila][posicionColumna] = '0';
	}
	/**
	 * 
	 * @param matriz
	 * @param asterisco
	 */
	public static void visualizarMatriz(char[][] matriz, char asterisco) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}

}

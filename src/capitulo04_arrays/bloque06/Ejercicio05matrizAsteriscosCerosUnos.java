package capitulo04_arrays.bloque06;

public class Ejercicio05matrizAsteriscosCerosUnos {

	public static void main(String[] args) {
		char matriz[][] = new char[20][10];
		char asterisco = '*';
		
		System.out.println("Matriz Impresa");
		System.out.println();
		mostrarAsteriscos(matriz, asterisco);
		
		visualizarMatriz(matriz, asterisco);

	}
	/**
	 * 
	 * @param matriz
	 * @param asterisco
	 */
	public static void	mostrarAsteriscos(char matriz[][], char asterisco) {
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				float numero = (float) (Math.round(Math.random()));
				
				if (i == 0 || i == matriz.length-1) {
					matriz[i][j] = asterisco;
				}
				else {
					if (j == 0 || j == matriz[i].length - 1) {
						matriz[i][j]= asterisco;
					}
					else {
						if (numero == 0) {
						matriz[i][j] =  '0';
						}
						else {
							matriz[i][j]= '1';
						}
					}
				}
			}	
		}
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

package capitulo04_arrays.bloque06;

public class Ejercicio02ondasAsteriscos {

	public static void main(String[] args) {
		char asterisco = '*';
		char onda[][] = new char[10][30];
		
		System.out.println("Matriz de Asteriscos");
		System.out.println();
		/*
		 *  Método para introducir los asteriscos.
		 */
		mostrarAsteriscos(onda, asterisco);
		
		/*
		 *  Método para visualizar la matriz
		 */
		visualizarArray(onda);

	}
	/**
	 * 
	 * @param onda
	 * @param asterisco
	 */
	public static void	mostrarAsteriscos(char onda[][], char asterisco) {
		for (int i = 0; i < onda.length; i++) {
			int numAsteriscos = (int) Math.round(Math.random()*30);
			for (int j = 0; j < numAsteriscos; j++) {
				onda[i][j] = asterisco;
			}
			for (int j = numAsteriscos; j < onda[i].length; j++) {
				onda[i][j] = ' ';
			}
		}
	}
	/**
	 * 
	 * @param onda
	 */
	public static void visualizarArray(char onda[][]) {
		for (int i = 0; i < onda.length; i++) {
			for (int j = 0; j < onda[i].length; j++) {
				System.out.print(onda[i][j] + " ");
			}
			System.out.println(" ");
		}	
	}

}

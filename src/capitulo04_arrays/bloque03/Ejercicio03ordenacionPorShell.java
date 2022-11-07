package capitulo04_arrays.bloque03;

public class Ejercicio03ordenacionPorShell {

	public static void main(String[] args) {
		int menor=0, array[]=new int[10], saltos[]=new int [] {6, 4, 3, 2, 1}, aux=0;
		
		for (int i=0; i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*1000);
		}
		
		System.out.println("Array");
		for (int i=0; i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	
		/*
		 * Ordenación Shell
		 */
		System.out.println("\nArray Ordenado");
		for (int i = 0; i < saltos.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j + saltos[i] < array.length) {
					if (array[j] > array[j + saltos[i]]) {
						aux = array[j + saltos[i]];
						array[j + saltos[i]]= array[j];
						array[j]=aux;
					}
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}

	}

}

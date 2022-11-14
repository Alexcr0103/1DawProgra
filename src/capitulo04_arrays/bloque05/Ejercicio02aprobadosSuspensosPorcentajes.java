package capitulo04_arrays.bloque05;

import metodos.UtilsArrays;

public class Ejercicio02aprobadosSuspensosPorcentajes {

	public static void main(String[] args) {
		int array[] = UtilsArrays.creaArrayNumerosAzar(20, 0, 10);
		
		UtilsArrays.mostrarArray(array);
		System.out.println();
		comprobacionAprobadosSuspensos(array);
	}
	/**
	 * En este método utilizamos el for para recorrer el array creado y asi mediante los if comprobar cuales estan suspensos y cuales aprobados. Una vez calculados mediante los syso los mostraremos
	 * en pantalla.
	 * @param array
	 */
	public static void comprobacionAprobadosSuspensos (int array[]) {
		int suspensos = 0, aprobados = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 5)
				suspensos++;
			if (array[i] >= 5)
				aprobados++;
		}
		System.out.println("Hay " + aprobados + " aprobados. Un " + (aprobados * 100) /array.length + "% del total" );
		System.out.println("Hay " + suspensos + " aprobados. Un " + (suspensos * 100) /array.length + "% del total" );
	}

}

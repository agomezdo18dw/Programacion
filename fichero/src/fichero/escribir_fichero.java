package fichero;

import java.io.FileWriter;
import java.util.Scanner;

public class escribir_fichero {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		String[] lineas = new String[10];
		int i; 
		System.out.println("Escribir en un fichero existente");
		for (i = 0; i < 10; i++) {
			System.out.print("Introduce algo (" + i + "/9):	");
			lineas[i] = teclado.nextLine();
		}
		System.out.println();
		System.out.println("...Editando fichero...");
		/** FORMA 1 DE ESCRITURA **/
		FileWriter fichero = null;
		try {

			fichero = new FileWriter("fichero_prueba.txt");

			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				System.out.println("Añadiendo: " + linea);
				fichero.write(linea + "\n");
			}
			System.out.print("El fichero ha sido editado.");
			fichero.close();

		} 
		catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
}

package fichero;

import java.io.FileWriter;

public class escribir_fichero {

	public static void main(String[] args) {
		
		String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };
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

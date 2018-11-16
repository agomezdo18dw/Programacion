package fichero;

import java.io.File;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class leer_fichero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		String x;
		System.out.println("¿Que fichero quieres leer?");
		x = teclado.nextLine();
		System.out.println();
		// Fichero del que queremos leer
		File fichero = new File(x);
		Scanner s = null;
		
		try {
			// Leemos el contenido del fichero
			System.out.println("... Leyendo el contenido del fichero ...");
			s = new Scanner(fichero);
			
			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				System.out.println(linea);      // Imprimimos la linea
			}
			
		} 
		catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} 
		finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			}
			catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}

	}

}

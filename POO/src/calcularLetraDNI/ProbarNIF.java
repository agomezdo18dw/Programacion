package calcularLetraDNI;

import java.util.Scanner;

public class ProbarNIF {

	static Scanner sc = new Scanner(System.in);
	
	/*public static void leer() {
		int DNI;
		System.out.print("Escribe el numero de tu DNI: ");
		DNI = sc.nextInt();
		NIF num1 = new NIF(DNI);
	}*/
	public static void main(String[] args) {
		
		System.out.println("Calcular la letra de tu DNI con el numero");
		System.out.println();
		
		//leer();
		int DNI;
		System.out.print("Escribe el numero de tu DNI: ");
		DNI = sc.nextInt();
		NIF num1 = new NIF(DNI);
		
		muestraDNI(num1);
		
	}
		
	public static void muestraDNI(NIF dni) {
		System.out.println(dni.toString());
	}
}

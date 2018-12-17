package calcularLetraDNI;

import java.util.Scanner;

public class ProbarNIF {

	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		System.out.println("Calcular la letra de tu DNI con el numero");
		System.out.println();
		NIF num1 = new NIF();
		
		num1.leer();
		System.out.print(num1.toString());
	}
	
}

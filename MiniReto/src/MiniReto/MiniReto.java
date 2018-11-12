package MiniReto;

import java.util.Scanner;

public class MiniReto {

	public static int factorial(int numero) {
		int factorial = 1;
		for (int i = numero; i > 0; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}
	public static int sumatorio(int numero) {
		int sumatorio = 0;
		for (int i = numero; i > 0; i--) {
			sumatorio = sumatorio + i;
		}
		return sumatorio;
	}
	public static int primerdigito(int digito) {
		while (digito > 10) {
			digito = digito / 10;
		}
		return digito;
	}
	public static int ultimodigito(int digito) {
		int resultado = 0;
		resultado = digito % 10;
		return resultado;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x;
		System.out.print("Introduce un numero: ");
		x = teclado.nextInt();
		System.out.println("El factorial de " + x + " es: " + factorial(x));
		System.out.println("El sumatorio de " + x + " es: " + sumatorio(x));
		System.out.println("El primer digito de " + x + " es: " + primerdigito(x));
		System.out.println("El factorial de " + x + " es: " + ultimodigito(x));

	}

}

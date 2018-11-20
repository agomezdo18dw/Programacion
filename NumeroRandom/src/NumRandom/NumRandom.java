package NumRandom;

import java.util.Scanner;

public class NumRandom {

	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 100+1);
		int x;
		System.out.println("Encuentra el numero entre en 1 y el 100");
		Scanner teclado = new Scanner(System.in);
		for (int intentos = 0; intentos < 6; intentos++) {
			System.out.print("Escribe un numero (" + (intentos+1) + "/6): ");
			x = teclado.nextInt();
			if (x > num) {
				System.out.println("Te has pasado, prueba con un numero mas bajo.");
			}
			else {
				if (x < num) {
					System.out.println("Te has quedado corto, prueba con un numero mas alto.");
				}
				else {
					if (x == num) {
						System.out.println("Enhorabuena, acertaste el numero.");
						break;
					}
				}
			}
			if (intentos == 5) {
				System.out.println("Se te acabaron los intentos.");
				System.out.println("El numero era " + num);
			}
		}
	}

}

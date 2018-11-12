package menuFor;

import java.util.Scanner;

public class MenuFor {

	public static void main(String[] args) {
		
		int opcion;
		Scanner teclado = new Scanner(System.in);
		for ( ; ; ) {
			System.out.println();
			System.out.println("                           EJERCICIO MENU RETO                           ");
			System.out.println(" ------------------------------------------------------------------------");
			System.out.println("| 1.Leer numero positivo y decidir los dígitos que tiene.                |");
			System.out.println("| 2.Leer un numero positivo y un dígito decidir cuantas veces aparece.   |");
			System.out.println("| 3.Leer un número positivo y hallar su invertido.                       |");
			System.out.println("| 4.Factorial de un número.                                              |");
			System.out.println("| 5.Leer numero y hacer “Triangulo” de asteriscos.                       |");
			System.out.println("| 6.Pasar un numero binario a decimal.                                   |");
			System.out.println("| 7.Leer una frase y decir cuántas vocales tiene.                        |");
			System.out.println("| 8.Multiplicar del 1 al 10.                                             |");
			System.out.println("| 9.Salir.                                                               |");
			System.out.println(" ------------------------------------------------------------------------");
			System.out.print("Elige la opcion: ");
			opcion = teclado.nextInt();
			System.out.println();
			switch (opcion) {
			case 1:  
				long x, numDigitos, cont = 0;
				System.out.println(" ------------------------------------------------------------------");
				System.out.println("| Opcion 1 - Leer un numero positivo y decir los digitos que tiene. |");
				System.out.println(" ------------------------------------------------------------------");
				System.out.print("Introduce un numero positivo: ");
				x = teclado.nextLong();
				if (x <= 0) {
					do {
						System.out.print("El numero introducido es negativo. Introduce un numero positivo: ");
						x = teclado.nextLong();
					}
					while (x <= 0);
				}
				numDigitos = x; 
				while (x != 0) {
					x = x/10;
					cont++;
				}
				System.out.println("El numero " + numDigitos + " tiene " + cont + " digitos.");
				System.out.println();
				;break;
				
			case 2:
				long y, z, contCifras = 0, contVeces = 0;
				System.out.println(" -------------------------------------------------------------------------------");
				System.out.println("| Opcion 2 - Leer un numero positivo y decidir cuantas veces aparece un dígito. |");
				System.out.println(" -------------------------------------------------------------------------------");
				System.out.print("Introduce un numero positivo: ");
				y = teclado.nextLong();
				if (y <= 0) {
					do {
						System.out.print("El numeoro introducido es negativo. Introduce un numero positivo: ");
						y = teclado.nextLong();
					}
					while (y <= 0);
				}
				contCifras = y;
				System.out.print("Introduce el digito que desea buscar: ");
				z = teclado.nextLong();
				while (y != 0) {
					if (y % 10 == z) {
						contVeces++;
					}
					y = y/10;
				}
				System.out.println("El digito " + z + " aparece " + contVeces + " veces en el numero " + contCifras + ".");
				System.out.println();
				;break;
				
			case 3: 
				System.out.println(" -----------------------------------------------------------");
				System.out.println("| Opcion 3 - Leer un número positivo y hallar su invertido. |");
				System.out.println(" -----------------------------------------------------------");
				long num, numAlreves, numAlreves2;
				System.out.print("Introduce un numero positivo: ");
				num = teclado.nextLong();
				if (num <= 0) {
					do {
						System.out.print("El numero introducido es negativo. Introduce un numero positivo: ");
						num = teclado.nextLong();
					}
					while (num <= 0);
				}
				numAlreves2 = num;
				System.out.print("El numero " + numAlreves2 + " alreves es: ");
				while (num != 0) {
					numAlreves = num % 10;
					System.out.print(numAlreves);
					num = num / 10;
				}
				System.out.println();
				System.out.println();
				;break;
				
			case 4: 
				System.out.println(" ------------------------------------");
				System.out.println("| Opcion 4 - Factorial de un número. |");
				System.out.println(" ------------------------------------");
				long numero, factorial = 1;
				System.out.print("Introduce un numero positivo: ");
				numero = teclado.nextLong();
				if (numero <= 0) {
					do {
						System.out.print("El numero introducido es negativo. Introduce un numero positivo: ");
						numero = teclado.nextLong();
					}
					while (numero <= 0);
				}
				for (long i = numero; i > 0; i--) {
					factorial = factorial * i;
				}
				System.out.println("El factorial de " + numero + " es: " + factorial);
				System.out.println();
				;break;
				
			case 5:
				int nTriangulo;
				System.out.println(" ---------------------------------------------------------------");
				System.out.println("| Opcion 5 - Leer un numero y hacer un triangulo de asteriscos. |");
				System.out.println(" ---------------------------------------------------------------");
				System.out.print("Introduce un numero numero positivo: ");
				nTriangulo = teclado.nextInt();
				if (nTriangulo <= 0) {
					do {
						System.out.print("El numero introducido es negativo. Introduce un numero positivo: ");
						nTriangulo = teclado.nextInt();
					}
					while (nTriangulo <= 0);
				}
				System.out.println("El triangulo es:");
				for (int fila = 1; fila <= nTriangulo; fila++) {
					for (int columna = 1; columna <= fila; columna++){
						System.out.print("*");
					}
					System.out.println();
				}
				for (int fila = nTriangulo - 1 ; fila >= 0; fila--) {
					for (int columna = 1; columna <= fila; columna++){
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println();
				;break;
				
			case 6: 
				long binario, binario2, cifra, resultado = 0, exp = 0;
				System.out.println(" -----------------------------------------------");
				System.out.println("| Opcion 6 - Pasar un numero binario a decimal. |");
				System.out.println(" -----------------------------------------------");
				System.out.print("Introduce un numero binario: ");
				binario = teclado.nextLong();
				binario2 = binario;
				do {
					cifra = binario % 10;
					resultado = resultado + cifra* (int)Math.pow(2, exp);
					exp++;
					binario = binario / 10;
				}
				while (binario > 0);
				System.out.println(binario2 + " en decimal equivale a: " + resultado);
				System.out.println();
				;break;
				
			case 7: 
				int contador = 0;
				System.out.println(" ----------------------------------------------------------");
				System.out.println("| Opcion 7 - Leer una frase y decir cuántas vocales tiene. |");
				System.out.println(" ----------------------------------------------------------");
				teclado.nextLine();
				System.out.print("Introduce una frase: ");
				String vocales = teclado.nextLine();
				for (int vocal = 0; vocal < vocales.length(); vocal++) {
					if ((vocales.charAt(vocal) == 'a') || (vocales.charAt(vocal) == 'e') || (vocales.charAt(vocal) == 'i') || (vocales.charAt(vocal) == 'o') || (vocales.charAt(vocal) == 'u')) {
						contador++;
					}
				}
				System.out.println("La frase '" + vocales + "' contiene " + contador + " vocales.");
				System.out.println();
				;break;
				
			case 8: 
				System.out.println(" -------------------------------------");
				System.out.println("| Opcion 8 - Multiplicar del 1 al 10. |");
				System.out.println(" -------------------------------------");
				System.out.println("La tablas tablas de multiplicar desde el 1 hasta el 10 son: ");
				for(int numeroAMult = 1; numeroAMult <= 10; numeroAMult++)
		        {
					System.out.println("La tabla del " + numeroAMult + " es:");
		            for(int numeroMult = 1; numeroMult <= 10; numeroMult++)
		            {
		                System.out.println(numeroAMult + " X " + numeroMult + " = " + numeroAMult*numeroMult);
		            }
		            System.out.println();
		        }
				;break;
				
			case 9: 
				System.out.println(" -------------------");
				System.out.println("| Opcion 9 - Salir. |");
				System.out.println(" -------------------");
				System.out.println("El programa se ha acabado.");
				System.exit(0);
				;break;
				
			default: System.out.println("El numero debe ser entre el 1 y el 9");
				}
		}
	}

}

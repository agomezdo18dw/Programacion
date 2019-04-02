package Calculadora;

import java.util.Scanner;

public class calculadora {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
	    
        do{
            System.out.println("Menú:");
            System.out.println(" 1. Suma");
            System.out.println(" 2. Resta");
            System.out.println(" 3. Multiplicacion" );
            System.out.println(" 4. Division");
            System.out.println(" 5. Salir");
            System.out.print("Introduzca opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine();
          
            switch (opcion){
                case 1:
                	System.out.println();
            		System.out.print("Introduce un numero: ");
            		int xs = sc.nextInt();
            		
            		System.out.print("Introduce otro numero: ");
            		int ys = sc.nextInt();
            		
            		System.out.println("La suma de " + xs + " + " + ys + " = " + suma(xs, ys));
            		System.out.println();
                    break;	          
                case 2:
                	System.out.println();
            		System.out.print("Introduce un numero: ");
            		int xr = sc.nextInt();
            		
            		System.out.print("Introduce otro numero: ");
            		int yr = sc.nextInt();
            		
            		System.out.println("La suma de " + xr + " - " + yr + " = " + resta(xr, yr));
            		System.out.println();
                    break;
                case 3:
                	System.out.println();
                	System.out.print("Introduce un numero: ");
            		int xm = sc.nextInt();
            		
            		System.out.print("Introduce otro numero: ");
            		int ym = sc.nextInt();
            		
            		System.out.println("La suma de " + xm + " - " + ym + " = " + multiplicar(xm, ym));
            		System.out.println();
                    break;
                case 4:
                	System.out.println();
                	System.out.print("Introduce un numero: ");
            		int xd = sc.nextInt();
            		
            		System.out.print("Introduce otro numero: ");
            		int yd = sc.nextInt();
            		
            		System.out.println("La suma de " + xd + " - " + yd + " = " + multiplicar(xd, yd));
            		System.out.println();
                    break;
                case 5:
                	salir();
                    break;
                default:
                    System.out.print("Opción incorrecta. Elija otra: ");
                    System.out.println();

            } 
        }while(opcion != 5);
    }
	
	public static int suma(int x, int y) {
		return(x + y);
	}

	public static int resta(int x, int y) {
		return x - y;
	}
	
	public static int multiplicar(int x, int y) {
		return x * y;
	}
	
	public static int division(int x, int y) {
		return x / y;
	}
	
	public static void salir() {
		System.out.println();
    	System.out.println("El programa se cerro.");
    }
}
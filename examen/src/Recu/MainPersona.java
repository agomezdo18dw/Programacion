/**
 * @author Adrian Gomez Dominguez
 */


package Recu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPersona {

	static Scanner scan = new Scanner(System.in);
    static ArrayList<Persona> Personas = new ArrayList<Persona>();
    
	public static void main(String[] args) {
		
		int opcion;
        do{
            System.out.println("Menú:");
            System.out.println(" 1. Añadir nueva persona.");
            System.out.println(" 2. Mostrar datos de las personas.");
            System.out.println(" 3. Cuantas personas viven en....");
            System.out.println(" 4. Cuantos codigos postales son validos.");
            System.out.println(" 5. Salir");
            System.out.print("Introduzca opción: ");
       
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 1:
                    leerPersonas();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                	System.out.println("¿Que poblacion?");
                	String poblacion = scan.nextLine();
                	if (cuantasPersonasVivenEn(poblacion) == 1) {
                		System.out.println("En " + poblacion + " vive " + cuantasPersonasVivenEn(poblacion) + " persona.");
                		System.out.println();
                	} else {
                		System.out.println("En " + poblacion + " viven " + cuantasPersonasVivenEn(poblacion) + " personas.");
                		System.out.println();
                	}
                    break;
                case 4:
                	if (cuantosCodigosPostalesBuenos() == 0) {
                		System.out.println("No has añadido ningun codigo postal valido.");
                		System.out.println();
                	} else if (cuantosCodigosPostalesBuenos() == 1) {
                		System.out.println("Has añadido " + cuantosCodigosPostalesBuenos() + " codigo postal valido.");
                		System.out.println();
                	} else {
                		System.out.println("Has añadido " + cuantosCodigosPostalesBuenos() + " codigos postales validos.");
                		System.out.println();
                	}
                	break;
                case 5:
                	salir();
                    break;
                default:
                    System.out.println("Opción incorrecta. Elija otra");
                    System.out.println();
            }
        }while(opcion != 5);
	}

	public static void leerPersonas() {
		System.out.println("Introduzca nombre de la persona:");
        String nombre = scan.nextLine();
        System.out.println("Introduzca la direccion de la persona:");
        String direccion = scan.nextLine();
        System.out.println("Introduzca el codigo postal de la persona:");
        int codigoPostal = scan.nextInt();
        scan.nextLine();
        System.out.println("Introduzca la ciudad en la que la persona vive:");
        String ciudad = scan.nextLine();
        System.out.println("Introduzca la edad de la persona:");
        int edad = scan.nextInt();
        scan.nextLine();
        Persona p = new Persona(nombre, direccion, codigoPostal, ciudad, edad);
        Personas.add(p);
        System.out.println("La persona: " + nombre + " se añadio correctamente.");
        System.out.println();
	}
	
	public static void mostrar() {
		int num = 1;
        System.out.println("Personas añadidas:");
        for (Persona product: Personas){
            System.out.println(" " + num + "- " + product.toString());
            num++;
        }
	}
	
	public static int cuantasPersonasVivenEn(String poblacion) {
		int numeroPersonas = 0;
		for (Persona product: Personas) {
			if (product.getCiudad().equalsIgnoreCase(poblacion)) {
				numeroPersonas++;
			}
		}
		return numeroPersonas;
	}
	
	public static int cuantosCodigosPostalesBuenos() {
		int numeroCodPostales = 0;
		for (Persona product: Personas){
			if (product.esCorrectoCodPostal()) {
				numeroCodPostales++;
	        } 
		}
		return numeroCodPostales;
	}
	
	public static void salir() {
    	System.out.println("El programa se cerro.");
    }

}

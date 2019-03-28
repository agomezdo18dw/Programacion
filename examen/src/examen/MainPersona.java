package examen;

import java.util.ArrayList;
import java.util.Iterator;
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
            System.out.println(" 3. Numero de personas.");
            System.out.println(" 4. Cuantas personas viven en....");
            System.out.println(" 5. Cuantas personas son mayores de edad.");
            System.out.println(" 6. Salir");
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
                	System.out.println("Has añadido " + numeroDePersonas() + " personas.");
                	System.out.println();
                    break;
                case 4:
                	System.out.println("¿Que poblacion?");
                	String poblacion = scan.nextLine();
                	cuantasPersonasVivenEn(poblacion);
                    break;
                case 5:
                	System.out.println("Has añadido " + personasMayoresDeEdad(Personas) + " personas que son mayores de edad.");
                	System.out.println();
                	break;
                case 6:
                	salir();
                    break;
                default:
                    System.out.println("Opción incorrecta. Elija otra");
            }
        }while(opcion != 6);
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
        System.out.println("La persona: " + nombre + ", se añadio correctamente.");
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
	
	public static int numeroDePersonas() {
		int num = Personas.size();
		return num;
	}
	
	public static void cuantasPersonasVivenEn(String poblacion) {
		int numeroPersonas = 0;
		for (Persona product: Personas) {
			if (product.getCiudad().equalsIgnoreCase(poblacion)) {
				numeroPersonas++;
			}
		}
		System.out.println("En " + poblacion + " viven " + numeroPersonas + " personas.");
		System.out.println();
	}
	
	public static int personasMayoresDeEdad(ArrayList<Persona>edad) {
		int num = 0;
		for (Persona product: edad){
			if (product.esMayorDeEdad()) {
				num++;
	        } 
		}
		return num;
	}
	
	public static void salir() {
    	System.out.println("El programa se cerro.");
    }

}

package Examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainPersona {
	
	static Scanner scan = new Scanner(System.in);
    static ArrayList<Persona> Persona = new ArrayList<Persona>();
    
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
                	//cuantasPersonasVivenEn(poblacion);
                    break;
                case 5:
                	System.out.println("Has añadido " + personasMayoresDeEdad(Persona) + " personas que son mayores de edad.");
                	break;
                case 6:
                	salir();
                    break;
                default:
                    System.out.println("Opción incorrecta. Elija otra");
                    System.out.println();
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
        System.out.println("Introduzca la ciudad en la que la persona vive:");
        String ciudad = scan.nextLine();
        System.out.println("Introduzca la edad de la persona:");
        int edad = scan.nextInt();
        scan.nextLine();
 
        Persona p = new Persona(nombre, direccion, codigoPostal, ciudad, edad);
        Persona.add(p);
        System.out.println("La persona: " + nombre + ", se añadio correctamente.");
        System.out.println();
	}
	
	public static void mostrar() {
		int num = 1;
        System.out.println("Personas añadidas:");
        for (Persona product: Persona){
            System.out.println(" " + num + "- " + product.toString());
            num++;
        }
	}
	
	public static int numeroDePersonas() {
		int num = Persona.size();
		return num;
	}
	
	//No consigo hacer que cuantasPersonas funcione, al parecer no permite poner un string como argumento
	/*public static int cuantasPersonasVivenEn(poblacion) {
		
	}*/
	
	//No me deja llamar a la funcion esMayorDeEdad() de la clase Persona.
	public static int personasMayoresDeEdad(ArrayList<Persona> p) {
		int num = 1;
		for (Persona product: Persona){
			if (p.esMayorDeEdad()) {
				num++;
	        } 
		}
		return num;
	}
	
	public static void salir() {
    	System.out.println("El programa se cerro.");
    }

}

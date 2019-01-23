package AgendaDeContactos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrián Gómez Domínguez
 */
public class Arraylist {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        ArrayList<Contacto> Contactos = new ArrayList<Contacto>();
        do{
            // Mostrar menú
            System.out.println("Menú:");
            System.out.println(" 1. Añadir nuevo Contacto.");
            System.out.println(" 2. Buscar Contacto.");
            System.out.println(" 3. Eliminar Contacto.");
            System.out.println(" 4. Ver lista de Contactos.");
            System.out.println(" 5. Salir.");
            System.out.print("Introduzca opción: ");
            // Leer opción
            opcion = scan.nextInt();
            scan.nextLine(); // Para que lea el salto el salto de línea
            // Según opción
            switch (opcion){
                case 1:
                    nuevoContacto(Contactos);
                    break;
                case 2:
                    buscarContacto(Contactos);
                    break;
                case 3:
                    eliminarContacto(Contactos);
                    break;
                case 4:
                    imprimeLista(Contactos);
                    break;
                case 5: // Para evitar que entre a default
                	salir();
                    break;
                default:
                    System.out.println("Opción incorrecta. Elija otra");
                    System.out.println();
            } // Fin switch
        }while(opcion != 5);
    } // Fin main
    
    // Método para añadir Contacto a la lista
    public static void nuevoContacto(ArrayList<Contacto> Contactos){
    	if (existeContacto(Contactos) == false) {
    		
    	}
    	// Pedir datos y leerlos
        System.out.println("Introduzca nombre del Contacto:");
        String nombre = scan.nextLine();
        System.out.println("Introduzca telefono del Contacto:");
        int telefono = scan.nextInt();
        scan.nextLine(); // Para que lea el salto el salto de línea
        // Crear objeto Contacto
        Contacto p = new Contacto(nombre, telefono);
        // Añadir el Contacto a la lista
        Contactos.add(p);
        System.out.println("El contacto " + nombre + " se añadio correctamente.");
        System.out.println();
    }// Fin método nuevoContacto
    
    public static existeContacto(ArrayList<Contacto> Contactos){
    	boolean exist;
    	
    	return exist;
        
    }
    
 // Método para imprimir Contacto
    public static void imprimeLista(ArrayList<Contacto> Contactos){
    	int num = 1;
        System.out.println("Contactos: --> ");
        // Este for crea un Objeto de Contacto llamado product que corresponde
        // a cada elemento de la lista según la iteración en la que esté
        for (Contacto product: Contactos){
            // La llamada a toString puede omitirse, es implicita dentro de println
            System.out.println(" " + num + "- " + product.toString());
            num++;
        }
        System.out.println("");
    }
    
    // Método para buscar un Contacto
    public static void buscarContacto(ArrayList<Contacto> Contactos){
        // Pedir datos y leerlos
        System.out.println("Introduzca nombre del Contacto");
        String nombre = scan.nextLine();
        System.out.println("Introduzca telefono del Contacto");
        int telefono = scan.nextInt();
        scan.nextLine(); // Para que lea el salto el salto de línea
        // Crear objeto Contacto
        Contacto p = new Contacto(nombre, telefono);
        // Buscar el Contacto
        int posicion = Contactos.indexOf(p);
        if (posicion >= 0) 
            System.out.println("Está en la posición " + posicion + 1);
        else 
            System.out.println("No está en la lista de Contactos");
        System.out.println();
    }
    
    // Método para eliminar un Contacto
    public static void eliminarContacto(ArrayList<Contacto> Contactos){
        // Pedimos que se introduzca la posición
        System.out.print("Introduzca posición del Contacto a eliminar: ");
        int posicion = scan.nextInt();
        // Antes de borrarlo lo extraemos para mostrarlo
        Contacto p = Contactos.get(posicion - 1);
        // Se muestra
        System.out.println("Se ha eliminado el Contacto: " + p.toString());
        // Se elimina
        Contactos.remove(posicion);
        System.out.println("");
    }
    
    public static void salir() {
    	System.out.println("El programa se cerro.");
    }
}

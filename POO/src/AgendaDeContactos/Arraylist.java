package AgendaDeContactos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adri�n G�mez Dom�nguez
 */
public class Arraylist {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Contacto> Contactos = new ArrayList<Contacto>();
    public static void main(String[] args) {
        int opcion;
        do{
            // Mostrar men�
            System.out.println("Men�:");
            System.out.println(" 1. A�adir nuevo Contacto.");
            System.out.println(" 2. Buscar Contacto.");
            System.out.println(" 3. Eliminar Contacto.");
            System.out.println(" 4. Ver lista de Contactos.");
            System.out.println(" 5. Salir.");
            System.out.print("Introduzca opci�n: ");
            // Leer opci�n
            opcion = scan.nextInt();
            scan.nextLine(); // Para que lea el salto el salto de l�nea
            // Seg�n opci�n
            switch (opcion){
                case 1:
                    nuevoContacto(Contactos);
                    break;
                case 2:
                	System.out.println("Introduzca nombre del Contacto");
                    String nombreBuscar = scan.nextLine();
                    buscarContacto(nombreBuscar);
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
                    System.out.println("Opci�n incorrecta. Elija otra");
                    System.out.println();
            } // Fin switch
        }while(opcion != 5);
    } // Fin main
    
    // M�todo para a�adir Contacto a la lista
    public static void nuevoContacto(ArrayList<Contacto> Contactos){
    	System.out.println("Introduzca nombre del Contacto:");
        String nombre = scan.nextLine();
   
        if (existeContacto(nombre) == true) {
        	System.out.println("El contacto ya existe.");
        	System.out.println();
        } 
        else {
        	// Pedir datos y leerlos
        	System.out.println("Introduzca telefono del Contacto:");
        	int telefono = scan.nextInt();
        	scan.nextLine(); // Para que lea el salto el salto de l�nea
        	// Crear objeto Contacto
        	Contacto p = new Contacto(nombre, telefono);
        	// A�adir el Contacto a la lista
        	Contactos.add(p);
        	System.out.println("El contacto " + nombre + " se a�adio correctamente.");
        	System.out.println();
        	
        }
    }// Fin m�todo nuevoContacto
    	
    public static boolean existeContacto(String nombre){
    	boolean exist = false;
    	 for(int i = 0; i < Contactos.size(); i++){
             if(Contactos.get(i).getNombre().equalsIgnoreCase(nombre))
                 exist = true;
             else 
        		 exist = false;
         } 
    	 
    	return exist;
        
    }
    
 // M�todo para imprimir Contacto
    public static void imprimeLista(ArrayList<Contacto> Contactos){
    	int num = 1;
        System.out.println("Contactos: --> ");
        // Este for crea un Objeto de Contacto llamado product que corresponde
        // a cada elemento de la lista seg�n la iteraci�n en la que est�
        for (Contacto product: Contactos){
            // La llamada a toString puede omitirse, es implicita dentro de println
            System.out.println(" " + num + "- " + product.toString());
            num++;
        }
        System.out.println("");
    }
    
    // M�todo para buscar un Contacto
    public static void buscarContacto(String nombre){
    	for (Contacto mostrarContacto: Contactos) //Recorre el arraylist y cada contacto por cada vuelta el que toque lo guarda en una variable mostrarContacto 
		{
		   if (mostrarContacto.getNombre().equalsIgnoreCase(nombre)) {	//Compara el nombre del objeto en la variable con el nombre que le pasamos y si son iguales los muestra en pantalla
		           System.out.println(mostrarContacto.toString());
		   }	
		}
    	System.out.println();
    }

    
    // M�todo para eliminar un Contacto
    public static void eliminarContacto(ArrayList<Contacto> Contactos){
        // Pedimos que se introduzca la posici�n
        System.out.print("Introduzca posici�n del Contacto a eliminar: ");
        int posicion = scan.nextInt();
        // Antes de borrarlo lo extraemos para mostrarlo
        Contacto p = Contactos.get(posicion - 1);
        // Se muestra
        System.out.println("Se ha eliminado el Contacto: " + p.toString());
        // Se elimina
        Contactos.remove(posicion - 1);
        System.out.println("");
    }
    
    public static void salir() {
    	System.out.println("El programa se cerro.");
    }
}

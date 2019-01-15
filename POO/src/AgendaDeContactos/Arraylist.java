package AgendaDeContactos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UsuarioPC5
 */
public class Arraylist {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        ArrayList<Producto> productos = new ArrayList<Producto>();
        do{
            // Mostrar men�
            System.out.println("Men�:");
            System.out.println(" 1. A�adir nuevo producto");
            System.out.println(" 2. Buscar producto");
            System.out.println(" 3. Eliminar producto");
            System.out.println(" 4. Ver lista de productos");
            System.out.println(" 5. N�mero de productos");
            System.out.println(" 6. Salir");
            System.out.println("Introduzca opci�n");
            // Leer opci�n
            opcion = scan.nextInt();
            scan.nextLine(); // Para que lea el salto el salto de l�nea
            // Seg�n opci�n
            switch (opcion){
                case 1:
                    nuevoProducto(productos);
                    break;
                case 2:
                    buscarProducto(productos);
                    break;
                case 3:
                    eliminarProducto(productos);
                    break;
                case 4:
                    imprimeLista(productos);
                    break;
                case 5:
                    contarProductos(productos);
                    break;
                case 6: // Para evitar que entre a default
                    break;
                default:
                    System.out.println("Opci�n incorrecta. Elija otra");
            } // Fin switch
        }while(opcion != 6);
    } // Fin main
    
    // M�todo para a�adir producto a la lista
    public static void nuevoProducto(ArrayList<Producto> productos){
        // Pedir datos y leerlos
        System.out.println("Introduzca nombre del producto");
        String nombre = scan.nextLine();
        System.out.println("Introduzca precio del producto");
        double precio = scan.nextDouble();
        scan.nextLine(); // Para que lea el salto el salto de l�nea
        // Crear objeto Producto
        Producto p = new Producto(nombre, precio);
        // A�adir el producto a la lista
        productos.add(p);
    }// Fin m�todo nuevoProducto
    
    // M�todo para buscar un producto
    public static void buscarProducto(ArrayList<Producto> productos){
        // Pedir datos y leerlos
        System.out.println("Introduzca nombre del producto");
        String nombre = scan.nextLine();
        System.out.println("Introduzca precio del producto");
        double precio = scan.nextDouble();
        scan.nextLine(); // Para que lea el salto el salto de l�nea
        // Crear objeto Producto
        Producto p = new Producto(nombre, precio);
        // Buscar el producto
        int posicion = productos.indexOf(p);
        if (posicion >= 0)
            System.out.println("Est� en la posici�n " + posicion);
        else
            System.out.println("No est� en la lista de productos");
    }
    
    // M�todo para eliminar un producto
    public static void eliminarProducto(ArrayList<Producto> productos){
        // Pedimos que se introduzca la posici�n
        System.out.println("Introduzca posici�n del producto a eliminar");
        int posicion = scan.nextInt();
        // Antes de borrarlo lo extraemos para mostrarlo
        Producto p = productos.get(posicion);
        // Se muestra
        System.out.println("Se va a eliminar el producto " + p.toString());
        // Se elimina
        productos.remove(posicion);
    }
    
    // M�todo para imprimir Producto
    public static void imprimeLista(ArrayList<Producto> productos){
        System.out.println("PRODUCTOS: --> ");
        // Este for crea un Objeto de Producto llamado product que corresponde
        // a cada elemento de la lista seg�n la iteraci�n en la que est�
        for (Producto product: productos){
            // La llamada a toString puede omitirse, es implicita dentro de println
            System.out.println(" - " + product.toString());
        }
    }
    
    public static void contarProductos(ArrayList<Producto> productos){
        int numProductos = productos.size();
        System.out.println("La lista contiene " + numProductos + " productos");
    }
}

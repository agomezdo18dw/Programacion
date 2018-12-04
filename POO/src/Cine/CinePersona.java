package Cine;

import java.util.ArrayList;
import java.util.Iterator;
 
public class CinePersona{
 
    public static void main(String[] args) {
         
        //Creamos la cola, al crearla ya creamos el numero de personas
        ArrayList<Persona> cola = new ArrayList<>();
         
        generarCola(cola);
         
        //Creamos variables que nos seran �tiles
        double recaudacion;
        double recaudacionTotal=0;
        Persona espectadorActual;
        int edadActual;
        int contadorPersonas=0;
         
        //Creamos el iterator
        Iterator<Persona> it=cola.iterator();
         
         
        //Recorremos la cola
        while(it.hasNext()){
             
            espectadorActual=it.next();
             
            //"Atendemos" al espectador para que pague
            edadActual=espectadorActual.getEdad();
             
            //Comprobamosla edad
            if(edadActual>=5 && edadActual<=10) { 
            	recaudacion=1; 
            } else if(edadActual>=11 && edadActual<=17) {
            	recaudacion=2.5;
            } else {
            	recaudacion=3.5;
            }
            contadorPersonas++;
            recaudacionTotal+=recaudacion;
             
            System.out.println("Una persona de "+edadActual+" a�os se le ha cobrado " +recaudacion+ " euros");
             
        }
         
        //Mostramos el resultado
        System.out.println("La recaudaci�n es de "+recaudacionTotal+" euros y han venido "+contadorPersonas);
         
    }
     
    public static void generarCola(ArrayList<Persona> cola){
             
        int numeroPersonas=generaNumeroAleatorio(1,50);
         
        for(int i=0;i<numeroPersonas;i++){
            cola.add(new Persona(generaNumeroAleatorio(5, 60)));
        } 
    }
     
    /**
     * Genera un numero aleatorio entre dos numeros.
     * Entre el minimo y el maximo incluidos
     * @param minimo N�mero m�nimo
     * @param maximo N�mero m�ximo
     * @return N�mero entre minimo y maximo
     */
    public static int generaNumeroAleatorio(int minimo, int maximo){
         
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    
}

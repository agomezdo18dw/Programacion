package telefonoMovil;

public class Main {

    public static void main(String[] args) {

        //-->FORMA NO.1 PARA DECLARAR UN OBJETO MOVIL
        Movil movil = new Movil("España","HE",2356);
        movil.setNombre("LG");
        movil.setColor("Rojo");
        movil.setSerie("12345");

        //-->FORMA NO.2 PARA DECLARAR UN OBJETO MOVIL
        Movil2 movil2 = new Movil2("MOTOROLA","Azul","36987","EEUU","MG",5897);

        //-->Impresion de objeto movil 1
        System.out.println("Movil 1:");
        System.out.println("-------------------------------------------------");
        System.out.println("Pais: " + movil.getPais() + " - Modelo: "+movil.getTipoModelo()+" - Region: "+ movil.getNoRegion());
        System.out.println("Nombre: " + movil.getNombre() + " - Color: "+movil.getColor()+" - Serie: "+ movil.getNombre());
        System.out.println("-------------------------------------------------");

        //-->Impresion de objeto movil 2
        System.out.println("-------------------------------------------------");
        System.out.println("Pais: " + movil2.getPais() + " - Modelo: " + movil2.getTipoModelo() + " - Region: " + movil2.getNoRegion());
        System.out.println("Nombre: " + movil2.getNombre() + " - Color: " + movil2.getColor() + " - Serie: " + movil2.getNombre());
        System.out.println("-------------------------------------------------");

    }
}

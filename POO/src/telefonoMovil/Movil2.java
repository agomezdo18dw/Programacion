package telefonoMovil;

public class Movil2 extends DetalleMovil {

    private String nombre,color,serie;

    public Movil2(String nombre,String color,String serie,String Pais,String TipoModelo,int NoRegion){
        super(Pais, TipoModelo, NoRegion);
        this.nombre = nombre;
        this.color = color;
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getSerie() {
        return serie;
    }
}

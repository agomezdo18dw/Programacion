package telefonoMovil;

public class Movil extends DetalleMovil{

    private String nombre,color,serie;

    public Movil(String Pais, String TipoModelo, int NoRegion) {
        super(Pais, TipoModelo, NoRegion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerie() {
        return serie;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
}
}
    

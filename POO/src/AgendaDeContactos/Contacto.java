package AgendaDeContactos;

import java.util.Objects;

/**
 *
 * @author UsuarioPC5
 */
public class Contacto {
    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + ". Telefono: " + telefono;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) obj;
        // System.out.println(this.nombre + " -- " + other.nombre);
        if (!other.nombre.equals(this.nombre)) {
            return false;
        }
        if (other.telefono != this.telefono) {
            return false;
        }
        return true;
    }   
}
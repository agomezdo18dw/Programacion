package Examen;

public class Persona {

	String nombre;
	String direccion;
	int codigoPostal;
	String ciudad;
	int edad;
	
	public Persona (String nombre, String direccion, int codigoPostal, String ciudad, int edad){
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.edad = edad;
    }
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean esMayorDeEdad() {
		if (this.edad > 18) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Datos de " + nombre + ": \n" +
			"    Edad: " + edad + "\n" + 
			"    Direccion: " + direccion +  "\n" + 
			"    Codigo postal: " + codigoPostal +  "\n" + 
			"    Ciudad: " + ciudad +  "\n";
	}
   
}


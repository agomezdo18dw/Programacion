package Persona;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	private String descripcion;
	
	public Persona (String n, int e, String d, String desc) {
		nombre = n;
		edad = e;
		dni = d;
		descripcion = desc;
	}
	
	public String d () {
		return dni;
	}
	
	public String desc () {
		return descripcion;
	}
	
	public int num () {
		return edad;
	}
	
	public void setEdad(int edad) {
        this.edad = edad;
    }
	
	public void MostrarDatos () {
		System.out.println("La persona se llama " + nombre + ".");
		System.out.println("La persona tiene " + edad + " años.");
		System.out.println("El DNI de la persona es " + dni + ".");
		System.out.println("La persona es " + descripcion + ".");
		System.out.println();
	}

}

package Persona;

public class PruebaPersona {

	public static void main(String[] args) {

		Persona p1 = new Persona("Carla", 16, "41941283D", "Bajita");
		Persona p2 = new Persona("Andres", 43, "7529942F", "Rubio");
		Persona p3 = new Persona("Paula", 20, "49310294C", "Fea");
		
		System.out.println("La persona 1 tiene: " + p1.num() + " años");
		p2.MostrarDatos();
		System.out.println("El DNI de la persona 3 es: " + p3.d() + ".");
	}

}

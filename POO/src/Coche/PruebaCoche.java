package Coche;

public class PruebaCoche {

	public static void main(String[] args) {

		Coche c1= new Coche("Opel Corsa", "Rojo", 90);
		Coche c2= new Coche("Renault Clio", "Negro", 120);
		
		System.out.println("El coche 1 tiene: " + c1.ObtenerKm() + " Km");
		System.out.println("El coche 2 tiene: " + c2.ObtenerKm() + " Km");
		
		c1.AñadirKm(50);
		
		System.out.println("El coche 1 AHORA tiene: " + c1.ObtenerKm() + " Km");

	}

}

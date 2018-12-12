package clasePersona;

import java.util.*;

public class Ejecutable {

	static Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
		
		String nombre;
		int edad;
		String sexo;
		String DNI;
		double peso;
		double altura;
		
		System.out.println("Introduce los datos de una persona.");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		sc.nextLine();
		System.out.print("Sexo(H/M): ");
		sexo = sc.nextLine();
		System.out.print("DNI: ");
		DNI = sc.nextLine();
		System.out.print("Peso en Kg: ");
		peso = sc.nextDouble();
		System.out.print("Altura en M: ");
		altura = sc.nextDouble();
		System.out.println();
		
		Persona p2 = new Persona(nombre, edad, sexo, DNI, peso, altura);
		
		Persona p1 = new Persona(nombre, edad, sexo, DNI, peso, altura);
		p1.setNombre("Laura");
		p1.setEdad(30);
		p1.setSexo("M");
		p1.setPeso(60);
		p1.setAltura(1.60);
		p1.setDNI("18208222L");
	        
		System.out.println("Persona 1");
		mostrarPersona(p1);
		MuestraMensajePeso(p1);
		MuestraMayorDeEdad(p1);
		
		System.out.println("Persona 2");
		mostrarPersona(p2);
		MuestraMensajePeso(p2);
		MuestraMayorDeEdad(p2);
		
	}
	
	public static void MuestraMensajePeso (Persona p) {
		int IMC = p.calcularIMC();
		switch (IMC) {
			case Persona.PESO_IDEAL:
				System.out.println("La persona esta en su peso ideal");
				break;
			case Persona.INFRAPESO:
				System.out.println("La persona esta por debajo de su peso ideal");
				break;
			case Persona.SOBREPESO:
				System.out.println("La persona esta por encima de su peso ideal");
				break;
		}
	}
	
	public static void MuestraMayorDeEdad(Persona p) { 
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
            System.out.println();
        } else {
            System.out.println("La persona no es mayor de edad");
            System.out.println();
        }
	}
	
	public static void mostrarPersona(Persona p){      
		 System.out.println(p.toString());
	}
}

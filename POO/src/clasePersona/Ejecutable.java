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
		
		Persona p1 = new Persona(nombre, edad, sexo, DNI, peso, altura);
		
		mostrarPersona(p1);
		MuestraMensajePeso(p1);
		MuestraMayorDeEdad(p1);
		
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
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
	
	 public static void mostrarPersona(Persona p){      
		 System.out.println(p.toString());
	 }
}

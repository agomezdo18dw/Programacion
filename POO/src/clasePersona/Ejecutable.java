package clasePersona;

import java.util.*;

public class Ejecutable {

	static ArrayList<Persona> personas = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
	
		leerDatos();
		MuestraMensajePeso();
	}
	
	//Método para leer datos de las personas e introducirlos en el arraylist
	public static void leerDatos() {
		//Declaración de variables para leer los datos de las personas
		String nombre;
		int edad;
		String sexo;
		String DNI;
		double peso;
		double altura;
		Persona aux;
		int i, n;
		//se pide por teclado el número de personas a leer
		do {
			System.out.print("¿Número de personas? ");
			n = sc.nextInt();
		} while (n < 0);
		sc.nextLine(); //limpiar el intro
		for (i = 1; i <= n; i++) {
			System.out.println("Persona: " + i);
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
			sc.nextLine(); //limpiar el intro
			//Se crea un objeto Persona y se asigna su referencia a aux se asignan valores a los atributos del nuevo objeto
			aux = new Persona();
			aux.setNombre(nombre);
			aux.setEdad(edad);
			aux.setSexo(sexo);
			aux.setDNI(DNI);
			aux.setPeso(peso);
			aux.setAltura(altura);
			//se añade el objeto al final del array
			personas.add(aux);
		}
	} //fin método leerDatos()
	
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
}

package clasePersona;

import java.util.ArrayList;
import java.util.Scanner;

import Coches.Coche;

public class Ejecutable {

	static ArrayList<Persona> personas = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
		
		leerDatos();
		

	}
	
	//Método para leer datos de las personas e introducirlos en el arraylist
	public static void leerDatos() {
		//Declaración de variables para leer los datos de las personas
		String nombre;
		int edad;
		String sexo;
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
		for (i = 1; i <=n; i++) {
			System.out.println("Persona: " + i);
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			System.out.print("Edad: ");
			edad = sc.nextInt();
			System.out.print("Sexo(H/M): ");
			sexo = sc.nextLine();
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			sc.nextLine(); //limpiar el intro
			//Se crea un objeto Persona y se asigna su referencia a aux se asignan valores a los atributos del nuevo objeto
			aux = new Persona();
			aux.setNombre(nombre);
			aux.setEdad(edad);
			aux.setSexo(sexo);
			aux.setPeso(peso);
			aux.setAltura(altura);
			//se añade el objeto al final del array
			personas.add(aux);
		}
	} //fin método leerDatos()

}

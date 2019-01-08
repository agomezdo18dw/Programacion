package Password;

import java.util.Scanner;

public class Password {

	private int longitud;
	private String contraseña;
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public boolean esFuerte() {
		
	}
	public static String numeros = "0123456789";
	public static String mayusculas = "ABCDEFGHIJKLMNÑIPQRSTUVWXYZ";
	public static String minusculas = "abcdefghijklmnñopqrstuvwxyz";
	
	public String generarPassword() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Scribe una contraseña que por lo menos tenga 11 caracteres y solo sean mayusculas, minusculas y numeros.");
		String contraseña = sc.nextLine();
		for (int con = 0; con < contraseña.length(); con++)
		for (int num = 0; num < numeros.length(); num++)
		for (int mayus = 0; mayus < mayusculas.length(); mayus++)
		for (int minus = 0; minus < minusculas.length(); minus++)
		if ()
		
	}
	public int longitudPassword(String pass) {
		
	}
}

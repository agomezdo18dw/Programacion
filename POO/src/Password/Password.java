package Password;

import java.util.Scanner;

public class Password {

	private int longitud;
	private String contrase�a;
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public boolean esFuerte() {
		
	}
	public static String numeros = "0123456789";
	public static String mayusculas = "ABCDEFGHIJKLMN�IPQRSTUVWXYZ";
	public static String minusculas = "abcdefghijklmn�opqrstuvwxyz";
	
	public String generarPassword() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Scribe una contrase�a que por lo menos tenga 11 caracteres y solo sean mayusculas, minusculas y numeros.");
		String contrase�a = sc.nextLine();
		for (int con = 0; con < contrase�a.length(); con++)
		for (int num = 0; num < numeros.length(); num++)
		for (int mayus = 0; mayus < mayusculas.length(); mayus++)
		for (int minus = 0; minus < minusculas.length(); minus++)
		if ()
		
	}
	public int longitudPassword(String pass) {
		
	}
}

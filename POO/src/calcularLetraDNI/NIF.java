package calcularLetraDNI;

import java.util.Scanner;

public class NIF {
	
	private int DNI;
	private char letra;
	
	static Scanner sc = new Scanner(System.in);
	
	public NIF() {}
	public NIF(int nDNI) {
		DNI = nDNI;
	}
	public long getDNI() {
		return DNI;
	}
	public void setDNI(int DNI) {
		this.DNI = DNI;
	}
	public void leer() {
		System.out.print("Escribe el numero de tu DNI: ");
		DNI = sc.nextInt();
		calcularDNI(DNI);
	}
	private void calcularDNI(int dni) {
		char[]caracteres= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto = dni%23;
        letra = caracteres[resto];
	}
	@Override
	public String toString() {
		return "La letra del DNI es: " + DNI + "-" + letra;
	}
}

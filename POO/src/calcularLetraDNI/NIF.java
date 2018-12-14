package calcularLetraDNI;

import java.util.Scanner;

public class NIF {
	
	private int DNI;
	
	static Scanner sc = new Scanner(System.in);
	
	public NIF(int nDNI) {
		DNI = nDNI;
	}
	
	public long getDNI() {
		return DNI;
	}
	
	public void setDNI(int DNI) {
		this.DNI = DNI;
	}
	
	public char calcularDNI(int dni) {
		String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        return caracteres.charAt(resto);
	}
	
	@Override
	public String toString() {
		return "La letra del DNI es: " + DNI + "-" + calcularDNI(DNI);
	}
}

package Excepciones;

public class Excepciones {
	
	public static int numerador = 10;
	public static Integer denominador = 0;
	public static float division;
	
	public static void main(String[] args) {
		System.out.println("ANTES DE HACER LA DIVISION");
		try {
			division = numerador / denominador;
		} catch (ArithmeticException ex) {
			division = 0;
			System.out.println("Error: "+ex.getMessage());
		} finally {
			System.out.println("Division: "+ division);
			System.out.println("DESPUES DE HACER LA DIVISION");
		}
	}

}
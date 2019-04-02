package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculadora {
	
	@Test
	public void suma() {
		System.out.println("Verificacion de la suma");
		calculadora s = new calculadora();
		assertTrue(s.suma(2,1) == 3);
	}
	
	@Test
	void resta() {
		System.out.println("Verificacion de la resta");
		calculadora s = new calculadora();
		assertTrue(s.resta(2,1) == 1);
	}
	
	@Test
	void multiplicar() {
		System.out.println("Verificacion de la multiplicacion");
		calculadora s = new calculadora();
		assertTrue(s.multiplicar(3,3) != 5);
	}
	
	@Test
	void division() {
		System.out.println("Verificacion de la division");
		calculadora s = new calculadora();
		assertTrue(s.division(6,2) == 3);
	}
}

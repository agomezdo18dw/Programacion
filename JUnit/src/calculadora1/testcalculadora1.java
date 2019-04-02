package calculadora1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcalculadora1 {

	
	@Test
	void testSuma() {
		calculadora1 c = new calculadora1 (20,10);
		int resultado = c.suma();
		assertEquals (30, resultado);
	}
	
	@Test
	void testResta() {
		calculadora1 c = new calculadora1 (20,10);
		int resultado = c.resta();
		assertEquals (10, resultado);
	}
	
	@Test
	void testMultiplicacion() {
		calculadora1 c = new calculadora1 (20,10);
		int resultado = c.multiplicacion();
		assertEquals (200, resultado);
	}
	
	@Test
	void testDivision() {
		calculadora1 c = new calculadora1 (20,10);
		int resultado = c.division();
		assertEquals (2, resultado);
	}

}

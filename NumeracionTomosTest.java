package numeracionTomos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumeracionTomosTest {

	@Test
	void numeracionDeTomosTestMenorQue10() {
		int n = 1;
		String[] dominio = { "Hola", "Chau" };

		NumeracionTomos prueba = new NumeracionTomos();
		String resultado = prueba.numeracionDeTomos(n , dominio);
		assertEquals("Hola-01", resultado);
	}

	@Test
	void numeracionDeTomosTestMayorQue10() {
		int n = 10;
		String[] dominio = { "Hola", "Chau" };

		NumeracionTomos prueba = new NumeracionTomos();
		String resultado = prueba.numeracionDeTomos(n , dominio);
		assertEquals("Hola-10", resultado);
	}

	@Test
	void numeracionDeTomosTestMayorQue100() {
		int n = 100;
		String[] dominio = { "Hola", "Chau" };

		NumeracionTomos prueba = new NumeracionTomos();
		String resultado = prueba.numeracionDeTomos(n , dominio);
		assertEquals("Chau-01", resultado);
	}

	@Test
	void numeracionDeTomosTest99() {
		int n = 99;
		String[] dominio = { "Hola", "Chau" };

		NumeracionTomos prueba = new NumeracionTomos();
		String resultado = prueba.numeracionDeTomos(n , dominio);
		assertEquals("Hola-99", resultado);
	}

	@Test
	void numeracionDeTomosTest200() {
		int n = 200;
		String[] dominio = { "Hola", "Chau", "moon" };

		NumeracionTomos prueba = new NumeracionTomos();
		String resultado = prueba.numeracionDeTomos(n , dominio);
		assertEquals("moon-02", resultado);
	}

	@Test
	void numeracionDeTomosTestLimite() {
		int n = 1980;
		String[] dominio = {	"A", "B", "C", "D", "E",
								"F", "G", "H", "I", "J",
								"K", "L", "M", "O", "P",
								"Q", "R", "S", "T", "U" };

		NumeracionTomos prueba = new NumeracionTomos();
		String resultado = prueba.numeracionDeTomos(n , dominio);
		assertEquals("U-99", resultado);
	}

}

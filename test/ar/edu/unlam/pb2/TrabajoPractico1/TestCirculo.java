package ar.edu.unlam.pb2.TrabajoPractico1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestCirculo {

	@Test
	public void sePuedenCrearCirculos() {

		Circulo unCirculo;
		unCirculo = new Circulo(8.0);

		assertNotNull(unCirculo);

		Circulo otroCirculo = new Circulo(9.0);
		assertNotNull(unCirculo);

	}

	@Test
	public void elPerimetroDeUnCirculoEsPiPorRadioPorDos() {

		Circulo unCirculo = new Circulo(8.0);

		Double esperado = 50.26;

		Double actual = unCirculo.calcularPerimetro(8.0);

		assertEquals(esperado, actual, 0.01);
	}

	@Test
	public void elAreaDeUnCirculoDebeSerPiPorRadioAlCuadrado() {
		
		Circulo unCirculo = new Circulo(6.0);
		
		Double esperado = 113.09;
		
		Double actual = unCirculo.calcularArea(6.0);
	
		assertEquals(esperado, actual, 0.01);
		
	}
	
	
}

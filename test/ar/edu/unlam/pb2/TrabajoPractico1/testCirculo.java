package ar.edu.unlam.pb2.TrabajoPractico1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class testCirculo {

	@Test
	public void sePuedenCrearCirculos() {

		Circulo unCirculo;
		unCirculo = new Circulo(1.0, 2.0, 2.0);

		assertNotNull(unCirculo);

		Circulo otroCirculo = new Circulo(4.0, 5.0, 5.0);
		assertNotNull(unCirculo);

	}

	@Test
	public void elPerimetroDeUnCirculoEsPiPorRadioPorDos() {

		Circulo unTriangulo = new Circulo(4.0, 2.0, 2.0);

		Double esperado = 8.0;

		Double actual = unTriangulo.calcularPerimetro(4.0, 2.0, 2.0);

		assertEquals(esperado, actual, 0.01);
	}

	@Test
	public void elAreaDeUnCirculoDebeSerPiPorRadioAlCuadrado() {
		
		Circulo unTriangulo = new Circulo(4.0, 2.0, 2.0);
		
		Double esperado = 4.0;
		
		Double actual = unTriangulo.calcularAltura(4.0, 2.0);
	
		assertEquals(esperado, actual);
		
	}
	
	
}

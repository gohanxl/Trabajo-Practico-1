package ar.edu.unlam.pb2.TrabajoPractico1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class testTriangulo {

	
	@Test
	public void sePuedenCrearRectangulos() {

		Triangulo unTriangulo;
		unTriangulo = new Triangulo(1.0, 2.0, 2.0);

		assertNotNull(unTriangulo);

		Triangulo otroTriangulo = new Triangulo(4.0, 5.0, 5.0);
		assertNotNull(unTriangulo);

	}

	@Test
	public void elPermimetroDeUnTrianguloDebeSerLaSumaDeSusLados() {

		Triangulo unTriangulo = new Triangulo(4.0, 2.0, 2.0);

		Double esperado = 8.0;

		Double actual = unTriangulo.calcularPerimetro(4.0, 2.0, 2.0);

		assertEquals(esperado, actual, 0.01);
	}

	@Test
	public void elAreaDeUnTrianguloDebeSerLaBasePorSuAlturaSobreDos() {
		
		Triangulo unTriangulo = new Triangulo(4.0, 2.0, 2.0);
		
		Double esperado = 4.0;
		
		Double actual = unTriangulo.calcularAltura(4.0, 2.0);
	
		assertEquals(esperado, actual);
		
	}
	
}

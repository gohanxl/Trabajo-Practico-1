package ar.edu.unlam.pb2.TrabajoPractico1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TrianguloTest {

	@Test
	public void sePuedenCrearTriangulos() {

		Triangulo unTriangulo;
		unTriangulo = new Triangulo(3.0, 3.0, 3.0);
		assertNotNull(unTriangulo);

		Triangulo otroTriangulo = new Triangulo(4.0, 5.0, 4.0);
		assertNotNull(otroTriangulo);

	}

	@Test

	public void elPerimetroDeUnTrianguloDebeSerLaSumaDeSusLados() {

		Triangulo unTriangulo = new Triangulo(3.0, 3.0, 3.0);
		Double esperado = 9.0; //

		Double actual = unTriangulo.calcularPerimetro(3.0, 3.0, 3.0);

		assertEquals(esperado, actual, 0.01);

	}

	@Test
	public void elAreaDeUnTrianguloDebeSerLaBasePorSuAltura() {
		Triangulo unTriangulo = new Triangulo (4.0, 2.0, 3.0);
		Double esperado = 4.0;
		
		Double actual = unTriangulo.calcularArea(4.0, 2.0);
		
		assertEquals(esperado, actual);
		
	}
	
}
	

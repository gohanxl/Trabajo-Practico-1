package ar.edu.unlam.pb2.TrabajoPractico1;

public class Circulo {

	public Circulo(Double radio) {

	}

	public double calcularPerimetro(Double radio) {

		Double perimetro = 0.0;
		perimetro = (Math.PI * radio * 2);

		return perimetro;
	}

	public double calcularArea(Double radio) {

		Double area = 0.0;
		area = (Math.PI * (radio * radio));

		return area;

	}

}

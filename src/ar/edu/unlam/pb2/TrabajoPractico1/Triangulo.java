package ar.edu.unlam.pb2.TrabajoPractico1;

public class Triangulo {

	public Triangulo(Double lado1, Double lado2, Double lado3) {

	}

	public Double calcularPerimetro(Double lado1, Double lado2, Double lado3) {

		Double perimetro = 0.0;

		perimetro = lado1 + lado2 + lado3;

		return perimetro;
	}

	public Double calcularArea(Double altura, Double base) {

		Double area = 0.0;

		area = (altura * base)/ 2;

		return area;
	}

}

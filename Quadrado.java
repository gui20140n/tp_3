package TP3;

public class Quadrado extends Quadril�teros implements FormaGeometrica{

	private double lado;

public Quadrado(double lado) {
	this.lado = lado;
}

public double perimetro() {
	return 4*lado;
}

public double area() {
	return lado*lado;
}
}
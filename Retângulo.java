package TP3;

public class Retângulo extends Quadriláteros implements FormaGeometrica{

	private double base,altura;

public Retângulo(double base, double altura) {
	this.base = base;
	this.altura = altura;
}

public double perimetro() {
	return 2*base+2*altura;
}

public double area() {
	return base*altura;
}
}

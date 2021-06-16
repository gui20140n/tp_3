package TP3;

public class Ret�ngulo extends Quadril�teros implements FormaGeometrica{

	private double base,altura;

public Ret�ngulo(double base, double altura) {
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

package TP3;

public class C�rculo implements FormaGeometrica {

	private double raio;

public C�rculo(double raio) {
	this.raio = raio;
}

public double perimetro() {
	return 2*Math.PI*raio;
}

public double area() {
	return Math.PI*raio*raio;
}

public double getRaio() {
	return raio;
}

public void setRaio(double raio) {
	this.raio = raio;
}
}
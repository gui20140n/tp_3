package TP3;

public abstract class Quadriláteros {
	private double lado;
	private double base,altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {	
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
}

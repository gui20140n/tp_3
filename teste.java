package TP3;

public class teste {
	public static void main(String[] args) {
		Quadriláteros quadrado = new Quadrado(0);
		Quadriláteros retangulo = new Retângulo(0,0);
		Círculo circulo = new Círculo(0);
		quadrado.setLado(2);
		retangulo.setAltura(3);
		retangulo.setBase(2);
		circulo.setRaio(2);
		System.out.println("Lado do Quadrado: "+quadrado.getLado());
		System.out.println("Base do Retângulo: "+retangulo.getBase());
		System.out.println("Altura do Retângulo: "+retangulo.getAltura());
		System.out.println("Raio do Círculo: "+circulo.getRaio());
	}

}

package TP3;

public class teste {
	public static void main(String[] args) {
		Quadril�teros quadrado = new Quadrado(0);
		Quadril�teros retangulo = new Ret�ngulo(0,0);
		C�rculo circulo = new C�rculo(0);
		quadrado.setLado(2);
		retangulo.setAltura(3);
		retangulo.setBase(2);
		circulo.setRaio(2);
		System.out.println("Lado do Quadrado: "+quadrado.getLado());
		System.out.println("Base do Ret�ngulo: "+retangulo.getBase());
		System.out.println("Altura do Ret�ngulo: "+retangulo.getAltura());
		System.out.println("Raio do C�rculo: "+circulo.getRaio());
	}

}

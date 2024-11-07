package br.com.calculaArea;

public class Triangulo implements AreaCalculavel {

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return (base * altura) / 2;
	}


	
	
	
	
	
}
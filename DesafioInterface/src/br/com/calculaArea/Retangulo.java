package br.com.calculaArea;

public class Retangulo implements AreaCalculavel {
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return base * altura ;
	}
	
	
	

 
}

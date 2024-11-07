package br.com.calculaArea;

public class Circulo implements AreaCalculavel  {

	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return  3.14 *  Math.pow(raio, 2);
	}
	
	
}

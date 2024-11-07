package br.com.veiculos.concessionaria;

public class Caminhao extends Veiculos{
	
	private double capacidadeDeCarga;

	public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
		super(marca, modelo, ano);
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

	@Override
	public void exibirInfor() {
		// TODO Auto-generated method stub
		super.exibirInfor();
		System.out.println("Capacidade de carga (em toneladas): " + capacidadeDeCarga);
	}
	
	
	
	
	
}

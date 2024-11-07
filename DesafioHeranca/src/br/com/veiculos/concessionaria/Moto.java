package br.com.veiculos.concessionaria;

public class Moto extends Veiculos {
	
	private String modelodoGuidao;

	public Moto(String marca, String modelo, int ano, String modelodoGuidao) {
		super(marca, modelo, ano);
		this.modelodoGuidao = modelodoGuidao;
	}
	
	public String modelodoGuidao() {
		return modelodoGuidao;
	}

	@Override
	public void exibirInfor() {
		// TODO Auto-generated method stub
		super.exibirInfor();
		System.out.println("Material do guidao: " + modelodoGuidao);
	}
	
	
	


	
	
	
}
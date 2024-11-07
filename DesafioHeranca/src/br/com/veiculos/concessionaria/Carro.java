package br.com.veiculos.concessionaria;

public class Carro extends Veiculos {
	
	private int quantidadePortas;

	public Carro(String marca, String modelo, int ano, int quantidadePortas) {
		super(marca, modelo, ano);
		this.quantidadePortas = quantidadePortas;
	}

	public int getQuantidadeDePortas() {
        return quantidadePortas;
    }
	
	@Override
	public void exibirInfor() {
		// TODO Auto-generated method stub
		super.exibirInfor();
		System.out.println("Quantidade de portas do carro: " + quantidadePortas);
	}
	
	

}

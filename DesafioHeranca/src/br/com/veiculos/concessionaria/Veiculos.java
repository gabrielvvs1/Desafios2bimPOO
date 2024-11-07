package br.com.veiculos.concessionaria;

public class Veiculos {
	
	private String marca;
	private String modelo;
	private int ano;
	
	public Veiculos(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void exibirInfor() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
	

	
}


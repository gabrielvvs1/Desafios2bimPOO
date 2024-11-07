package br.com.veiculos.concessionaria;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Carro objCarro = new Carro ("Subaru", "WRX", 2011, 4);
	objCarro.exibirInfor();
	
	System.out.println("------------------------------");
	
	Moto objMoto = new Moto ("Ducati", "Pinigale", 2021, "alumínio");
	objMoto.exibirInfor();
	
	System.out.println("------------------------------");
	
	Caminhao objCaminhao = new Caminhao ("Mercedes-Benz ", "Actros 2651" , 2023, 30);
	objCaminhao.exibirInfor();
	
	
	
	}


}

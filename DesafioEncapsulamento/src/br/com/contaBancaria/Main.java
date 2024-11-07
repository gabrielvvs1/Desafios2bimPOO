package br.com.contaBancaria;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		  ContaBancaria objConta = new ContaBancaria(10000.0, "GABRIEL");
	      objConta.depositar(5000.0);
	      objConta.sacar(1000.0);

	        System.out.println("Titular: " + objConta.getTitular());
	        System.out.println("Saldo de R$ " + objConta.getSaldo());
	   

	}

}

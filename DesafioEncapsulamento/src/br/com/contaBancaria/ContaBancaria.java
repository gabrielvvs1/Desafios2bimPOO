package br.com.contaBancaria;

public class ContaBancaria {
	
	private double saldo;
	private String titular;
	 
	public ContaBancaria(double saldo, String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}
	
	
	public void depositar(double valor) {
		if (valor > 0) {
	       saldo += valor;
	  } else {
	    System.out.println("Esse valor do deposito eh invalido!");
	         }
	}

	    
	public void sacar(double valor) {
	     if (valor > 0 && valor <= saldo) {
	        saldo -= valor;
	   } else {
	     System.out.println("Saldo insuficiente");
	          }
	 }

	
	 public double getSaldo() {
	        return saldo;
	 }
	 

	 public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	 public String getTitular() {
	        return titular;
	 }
	
	 
	 
	public void setTitular(String novoTitular) {
	        titular = novoTitular;
	 }

	 
	 


}
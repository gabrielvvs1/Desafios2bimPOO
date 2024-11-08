package br.com.desafio.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
								// NOME, SALARIO POR HORA, HORAS TRABALHAS POR MES
	Gerente gerente = new Gerente("Steve", 90, 150);
	Diretor diretor = new Diretor("Xeila", 230, 110);

	Funcionarios[] funcionarios = {gerente, diretor};

	FolhadePagamento folha = new FolhadePagamento();
	folha.imprimirSalarios(funcionarios);
	}
		    
		

	}



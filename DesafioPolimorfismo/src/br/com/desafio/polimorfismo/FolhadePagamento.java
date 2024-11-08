package br.com.desafio.polimorfismo;

public class FolhadePagamento {

	public void imprimirSalarios(Funcionarios[] funcionarios) {
        for (Funcionarios funcionario : funcionarios) {
            double salario = funcionario.calcularSalario();
            System.out.printf("Nome: %s, Salário: R$%.2f%n", funcionario.getNome(), salario);
        }
    }
}
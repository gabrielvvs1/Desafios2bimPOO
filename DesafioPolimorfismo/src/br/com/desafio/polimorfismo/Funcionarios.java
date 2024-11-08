package br.com.desafio.polimorfismo;

public class Funcionarios {
	
	private String nome;
	private double salarioPorHora;
	private double horasTrabalhadasNoMes;
	
	public Funcionarios(String nome, double salarioPorHora, double horasTrabalhadasNoMes) {
		super();
		this.nome = nome;
		this.salarioPorHora = salarioPorHora;
		this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public double getHorasTrabalhadasNoMes() {
		return horasTrabalhadasNoMes;
	}

	public void setHorasTrabalhadasNoMes(double horasTrabalhadasNoMes) {
		this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
	}

	public double calcularSalario() {
        return horasTrabalhadasNoMes * salarioPorHora;
    }


		
		
		
	
	

}

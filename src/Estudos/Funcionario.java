package Estudos;

public class Funcionario {
	private String nome;
	private String numero;
	private float salario;

	Funcionario(String nome, String numero, float salario) {
		this.nome = nome;
		this.numero = numero;
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSalario(float salario) {
		this.salario = (float)(salario - salario*(0.5));
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public float getSalario() {
		return salario;
	}

}

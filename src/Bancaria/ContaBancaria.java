package Bancaria;

public class ContaBancaria {
	private String nome;
	private double saldo;
	
	public ContaBancaria(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void setSaldo(double saldo) {
		if(saldo > 0.0) {
			this.saldo = saldo;
		}
	}
	public void deposito(double deposito) {
		if(deposito > 0.0) {
			saldo = deposito + saldo;			
		}
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}

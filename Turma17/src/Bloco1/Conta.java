package Bloco1;


public class Conta {
	//EXERCÍCIO DE CLASSES 02/02/2021
	private int numeroConta;
	private String titular;
	private double saldo;
	
	//Construtor
	
	public Conta (int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void minhaConta() {
		
		
		System.out.println("Usuário "+titular + "," + "seu saldo é de: "+ saldo);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}

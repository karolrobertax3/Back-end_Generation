package Bloco1;

public class Fornecedor extends Pessoa {
 private int valorCredito;
 private int valorDivida;
 int obterSaldo;
 
 public Fornecedor(String nome, String endereco, int telefone, String cnpj ) 
 {
	 
	 super(nome,endereco,telefone,cnpj);
 }
 
 public Fornecedor(String nome, String endereco, int telefone, String cnpj,int valorCredito, int valorDivida) {
	 super(nome,endereco,telefone,cnpj);
	 this.valorCredito = valorCredito;
	 this.valorDivida = valorDivida;
 }
 
 public void obterSaldo() {
	 int obterSaldo = valorCredito - valorDivida;
 }

public int getValorCredito() {
	return valorCredito;
}

public void setValorCredito(int valorCredito) {
	this.valorCredito = valorCredito;
}

public int getValorDivida() {
	return valorDivida;
}

public void setValorDivida(int valorDivida) {
	this.valorDivida = valorDivida;
}
 
 
 
 
 
 
 
 
 
 
 
}


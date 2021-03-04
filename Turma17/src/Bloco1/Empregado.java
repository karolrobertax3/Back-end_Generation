package Bloco1;

public class Empregado extends Pessoa {
	int codigoSetor;
	double salarioBase;
	double imposto;
	
	public Empregado(String nome, String endereco,int telefone,String cnpj)
	{
		super(nome,endereco,telefone,cnpj);
	}
	
	public Empregado(String nome, String endereco,int telefone,String cnpj,int codigoSetor, double salarioBase, double imposto)
	{
		super(nome,endereco,telefone,cnpj);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
}

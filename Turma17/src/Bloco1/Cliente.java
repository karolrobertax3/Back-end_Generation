package Bloco1;

public class Cliente {
	//EXERC�CIO DE CLASSES 02/02/2021
	//Declara��o dos atributos da classe
	
	private String nome;
	private String sobrenome;
	private char genero;
	private String cpf;
	private String nascimento;
	private String endereco;
	
	//Cria��o do m�todo especial Construtor
	public Cliente(String nome,String sobrenome,char genero,String cpf,String nascimento,String endereco) 
	{
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.genero = genero;
	this.cpf = cpf;
	this.nascimento = nascimento;
	this.endereco = endereco;
	}
	
	//Declara��o dos demais m�todos da classe 
	public void informacoes() 
	{
		System.out.println("Cliente"+ nome + " " + sobrenome + " " + " do sexo " + " "+ genero +" " + "inscrita no CPF: " + cpf + " nascida em "  + nascimento + "residente no endere�o: " + endereco );
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

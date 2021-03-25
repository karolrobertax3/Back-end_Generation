package br.com.generationGames.minhaLojaDeGames.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	private String sinopse;
	private String classificacao;
	
	@OneToMany(mappedBy = "categoriaDoProduto")
	@JsonIgnoreProperties("categoriaDoProduto")
	private List<Produto> produtos;

	public Categoria() {
		super();
		
	}

	public Categoria(Long id, @NotNull String nome, String sinopse, String classificacao, List<Produto> produtos) {
		super();
		this.id = id;
		this.nome = nome;
		this.sinopse = sinopse;
		this.classificacao = classificacao;
		this.produtos = produtos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
}

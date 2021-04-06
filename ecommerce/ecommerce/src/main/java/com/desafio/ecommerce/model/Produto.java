package com.desafio.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	@NotNull
	private String nome;
	
	private String tituloProduto;
	
	@NotNull
	private Float valor;
	
	private String urlImagem;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Loja loja;

	public Produto() {
		super();
		
	}

	public Produto(Long idProduto, @NotNull String nome, String tituloProduto, @NotNull Float valor, String urlImagem) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.tituloProduto = tituloProduto;
		this.valor = valor;
		this.urlImagem = urlImagem;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTituloProduto() {
		return tituloProduto;
	}

	public void setTituloProduto(String tituloProduto) {
		this.tituloProduto = tituloProduto;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	
	
	
	
	
	
}

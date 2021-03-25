package br.com.generationGames.minhaLojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Float valor;
	
	@Size(max=30)
	private String marca;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	@JsonIgnoreProperties("produtos")
	private Categoria categoriaDoProduto;

	public Produto() {
		super();
		
	}

	public Produto(Long id, @NotNull String nome, @NotNull Float valor, @Size(max = 30) String marca,
			Categoria categoriaDoProduto) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.marca = marca;
		this.categoriaDoProduto = categoriaDoProduto;
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

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Categoria getCategoriaDoProduto() {
		return categoriaDoProduto;
	}

	public void setCategoriaDoProduto(Categoria categoriaDoProduto) {
		this.categoriaDoProduto = categoriaDoProduto;
	}
	
	
	
}

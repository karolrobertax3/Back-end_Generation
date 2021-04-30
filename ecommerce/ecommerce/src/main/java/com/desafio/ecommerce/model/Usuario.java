package com.desafio.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String usuario;
	
	@Size(min = 4)
	@NotNull
	private String senha;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name = "inscricao",
			joinColumns = @JoinColumn(name = "idUsuario"),
			inverseJoinColumns = @JoinColumn(name = "idLoja")
			)
	private List<Produto> minhasCompras = new ArrayList<>();
	
	public Usuario() {
		super();
		
	}

	public Usuario(Long idUsuario, @NotNull String nome, @NotNull String usuario,
			@Size(min = 4) @NotNull String senha) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Produto> getMinhasCompras() {
		return minhasCompras;
	}

	public void setMinhasCompras(List<Produto> minhasCompras) {
		this.minhasCompras = minhasCompras;
	}
	
	
	
	
	
	
}

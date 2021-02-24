package com.minhaLojaDeGames.LojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_Categoria")
public class Categoria {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=20, max=60)
	private String categoria;
	
	@NotNull
	@Size(min=20, max=600)
	private String descricao_categoria;
	
	@ManyToMany
	@JsonIgnoreProperties("Categoria")
	private Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao_categoria() {
		return descricao_categoria;
	}

	public void setDescricao_categoria(String descricao_categoria) {
		this.descricao_categoria = descricao_categoria;
	}
	
	

}

package com.minhaLojaDeGames.LojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_Produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String produto_descricao;
	
	@ManyToMany(mappedBy = "produto", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("produto")
	private List<Categoria> Categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto_descricao() {
		return produto_descricao;
	}

	public void setProduto_descricao(String produto_descricao) {
		this.produto_descricao = produto_descricao;
	}

	public List<Categoria> getCategoria() {
		return Categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		Categoria = categoria;
	}
	
	
}

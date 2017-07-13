package com.algaworks.pedidovenda.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class PesquisaProdutosBean {

	private List<Integer> produtosFiltrados = null;

	public PesquisaProdutosBean() {
		for (int i = 0; i < 50; i++) {
			produtosFiltrados.add(i);
		}
	}

	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}
}

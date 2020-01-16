package com.generation.hello.demo.entities;

public class Carne {
	
	Integer id;
	String tipo;
	Integer qtdEstoque;
	
	
	
	public Carne(Integer id, String tipo, Integer qtdEstoque) {
	
		this.id = id;
		this.tipo = tipo;
		this.qtdEstoque = qtdEstoque;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public Integer getQtdEstoque() {
		return qtdEstoque;
	}



	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}



	@Override
	public String toString() {
		return "Carne [id=" + id + ", tipo=" + tipo + ", qtdEstoque=" + qtdEstoque + "]";
	}
	
	
	
}

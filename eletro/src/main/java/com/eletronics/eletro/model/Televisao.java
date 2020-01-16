package com.eletronics.eletro.model;

public class Televisao extends Eletronico {
	
	String tamanho;

	public Televisao(Integer id, String nome, Double preco, String tamanho) {
		super(id, nome, preco);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Televisao [tamanho=" + tamanho + "]";
	}
	
	
	

}

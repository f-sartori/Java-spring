package com.eletronics.eletro.model;

public class Celular extends Eletronico {
	
	Integer memoria;

	public Celular(Integer id, String nome, Double preco, Integer memoria) {
		super(id, nome, preco);
		this.memoria = memoria;
	}

	public Integer getMemoria() {
		return memoria;
	}

	public void setMemoria(Integer memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "Celular [memoria=" + memoria + "]";
	}
	
	
	
	
}

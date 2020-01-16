package com.eletronics.eletro.model;

public class Computador extends Eletronico {
	

	Integer hd;

	public Computador(Integer id, String nome, Double preco, Integer hd) {
		super(id, nome, preco);
		this.hd = hd;
		
	}

	public Integer getHd() {
		return hd;
	}

	public void setHd(Integer hd) {
		this.hd = hd;
	}

	@Override
	public String toString() {
		return "Computador [hd=" + hd + "]";
	}

	

}

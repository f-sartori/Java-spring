package com.eletronics.eletro.service;

import java.util.ArrayList;
import java.util.List;


import com.eletronics.eletro.model.Eletronico;

public class EletronicoService {
	
	
	List<Eletronico> eletronicos = new ArrayList<Eletronico>();
	
	
	
	
	public void addList(Eletronico eletronico) {
		
		eletronicos.add(eletronico);
	}
	
	public List<Eletronico> getAll(){
		return eletronicos;
	}
	
	

}

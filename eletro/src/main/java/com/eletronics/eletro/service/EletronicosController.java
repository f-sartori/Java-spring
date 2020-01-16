package com.eletronics.eletro.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eletronics.eletro.model.Celular;
import com.eletronics.eletro.model.Computador;
import com.eletronics.eletro.model.Eletronico;
import com.eletronics.eletro.model.Televisao;


@CrossOrigin("*")
@RestController
public class EletronicosController {
	
	@GetMapping("/eletronicos")
	@ResponseBody
	public List<Eletronico> primeiraPagEle() {
		
		EletronicoService service = new EletronicoService();
		
		Computador c1 = new Computador(1, "Computador", 100.0, 50);
		Celular c2 = new Celular(2, "Celular", 500.0, 10);
		Televisao c3 = new Televisao(3, "Televisão", 100.0, "55");
		service.addList(c1);
		service.addList(c2);
		service.addList(c3);
		
		
		return service.getAll();
	}
	
	
	@GetMapping("/eletronicos2")
	@ResponseBody
	public String primeiraPagEle2() {
		
		
		
		return "Teste";
	}


}

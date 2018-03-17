package br.cambury.controle.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.cambury.bean.Carro;
import br.cambury.controle.CarroBCI;
import br.cambury.dao.CarroDaoI;

@Controller
public class CarroBC implements CarroBCI {

	@Autowired
	private CarroDaoI dao;

	@Override
	public void cadastrar() {
		System.out.println("teste cadastro");
		Carro c = new Carro();
		c.setCor("Azul");

		dao.save(c);
		
	}

}

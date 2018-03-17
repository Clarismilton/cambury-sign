package br.cambury.mb;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.cambury.controle.CarroBCI;

@ManagedBean(name = "ControleMB")
public class ControleMB extends SpringBeanAutowiringSupport {

	@Autowired
	private CarroBCI controle;
	
	private String teste;
	
	
	public String getTeste() {
		return teste;
	}


	public void setTeste(String teste) {
		this.teste = teste;
	}


	public void testarAction(){
		controle.cadastrar();
		System.out.println(this.teste);
	}
}

package br.edu.infnet.appOdonto.model.tests;

import br.edu.infnet.appOdonto.model.domain.Cadastro;

public class CadastroTeste {
	
	public static void main(String[] args) {
		
		Cadastro a1 = new Cadastro("Nivaldo", "exemplo@email.com", "8199999999");
		System.out.println("Cadastro: " + a1);		
		
	}

}

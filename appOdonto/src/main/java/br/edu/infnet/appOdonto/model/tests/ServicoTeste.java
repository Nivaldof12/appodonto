package br.edu.infnet.appOdonto.model.tests;

import br.edu.infnet.appOdonto.model.domain.Servico;
import br.edu.infnet.appOdonto.model.domain.Cadastro;

public class ServicoTeste {
	
	public static void main(String[] args) {
		
		Cadastro paciente = new Cadastro("Nivaldo", "Exemplo@email.com", "8199999999");
		
		Servico a1 = new Servico("Paciente ", false);
		a1.setPaciente(paciente);
		System.out.println(a1);
		
		Cadastro paciente2 = new Cadastro("Pedro", "Exemploo@email.com", "81999999999");		
		Servico b1 = new Servico("Paciente ", true);
		b1.setPaciente(paciente2);
		System.out.println(b1);
	}

}

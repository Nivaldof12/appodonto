package br.edu.infnet.appOdonto.model.tests;

import br.edu.infnet.appOdonto.model.domain.Ortodontia;
import br.edu.infnet.appOdonto.model.domain.Endodontia;
import br.edu.infnet.appOdonto.model.domain.Estetica;

public class MarcarConsultaTeste {
	
	public static void main(String[] args) {
		
		Ortodontia a1 = new Ortodontia("Consultorio Leste", "13/12/2022", 300);
		a1.setSalaOrtodontia(12);
		a1.setPlanoOrtodontia(true);		
		System.out.println("Ortodontia: " + a1);
		
		Endodontia b1 = new Endodontia("Consultorio Sul", "14/12/2022", 1000);
		b1.setSalaConsultorio(34);
		b1.setConvenioEndodontia(false);		
		System.out.println("Endodontia: " + b1);
		
		Estetica c1 = new Estetica("Consultorio Norte", "15/12/2022", 5000);
		c1.setSalaEstetica(23);
		c1.setPlanoEstetica(false);
		System.out.println("Estetica: " + c1);
		
	}

}
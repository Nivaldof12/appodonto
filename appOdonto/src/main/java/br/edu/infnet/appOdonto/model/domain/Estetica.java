package br.edu.infnet.appOdonto.model.domain;

import br.edu.infnet.appOdonto.model.exceptions.EsteticaException;

public class Estetica extends MarcarConsulta {
	
	private String procedimentoEstetico;
	private int salaEstetica;
	private boolean planoEstetica;

	public Estetica(String localConsulta, String dataConsulta, float valorConsulta) {
		super(localConsulta, dataConsulta, valorConsulta);
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append("Qual e o procedimento estetico? " + this.procedimentoEstetico);
		sb.append(";");
		sb.append("Qual e o numero da sala que deseja realizar sua consulta?  " + this.salaEstetica);
		sb.append(";");
		sb.append(this.planoEstetica ? "Particular" : "Plano de saude");
		
		return sb.toString();
	}

	@Override
	public float calculaOrcamento() throws EsteticaException {
		if(this.salaEstetica <= 0) {
			throw new EsteticaException ("Número de sala inválido.");
		}
		
		float precodaConsulta = 0;
		
		if (this.planoEstetica) {
			precodaConsulta = (float) 0.15;			
		}
		
		return this.getValorConsulta() + (this.getValorConsulta() * precodaConsulta);
	}

	public boolean isPlanoEstetica() {
		return planoEstetica;
	}

	public void setPlanoEstetica(boolean planoEstetica) {
		this.planoEstetica = planoEstetica;
	}

	public String getProcedimentoEstetico() {
		return procedimentoEstetico;
	}

	public void setProcedimentoEstetico(String procedimentoEstetico){

		this.procedimentoEstetico = procedimentoEstetico;
	}

	public int getSalaEstetica() {
		return salaEstetica;
	}

	public void setSalaEstetica(int salaEstetica) {
		this.salaEstetica = salaEstetica;
	}
}

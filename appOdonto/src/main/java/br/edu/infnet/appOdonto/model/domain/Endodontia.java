package br.edu.infnet.appOdonto.model.domain;

import br.edu.infnet.appOdonto.model.exceptions.EndodontiaException;

public class Endodontia extends MarcarConsulta {
	
	private String modeloCanal;
	private int salaConsultorio;
	private boolean convenioEndodontia;

	public Endodontia(String localConsulta, String dataConsulta, float valorConsulta) {
		super(localConsulta, dataConsulta, valorConsulta);
		
	}
	
	@Override
	public String toString() {		
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append("Qual e o precedimento? " + this.modeloCanal);
		sb.append(";");
		sb.append("Qual a sala que deseja realizar sua consulta? " + this.salaConsultorio);
		sb.append(";");
		sb.append(this.convenioEndodontia ? "Particular" : "Plano de saude");
		
		return sb.toString();
	}

	@Override
	public float calculaOrcamento() throws EndodontiaException {
		if(this.salaConsultorio <= 0) {
			throw new EndodontiaException ("Esse numero de sala não existe.");
		}
		
		float precodaConsulta = 0;
		
		if (this.convenioEndodontia) {
			precodaConsulta = (float) 0.40;			
		}		
		return this.getValorConsulta() + (this.getValorConsulta() * precodaConsulta);
	}

	public int getSalaConsultorio() {
		return salaConsultorio;
	}

	public void setSalaConsultorio(int salaConsultorio) {
		this.salaConsultorio = salaConsultorio;
	}

	public String getModeloCanal() {
		return modeloCanal;
	}

	public void setModeloCanal(String modeloCanal){	
		this.modeloCanal = modeloCanal;
	}

	public boolean isConvenioEndodontia() {
		return convenioEndodontia;
	}

	public void setConvenioEndodontia(boolean convenioEndodontia) {
		this.convenioEndodontia = convenioEndodontia;
	}
}

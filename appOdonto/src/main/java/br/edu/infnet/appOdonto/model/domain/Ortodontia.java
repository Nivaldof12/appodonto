package br.edu.infnet.appOdonto.model.domain;

import br.edu.infnet.appOdonto.model.exceptions.OrtodontiaException;

public class Ortodontia extends MarcarConsulta {
	
	private String modeloAparelho;
	private int salaOrtodontia;
	private boolean planoOrtodontia;	

	public Ortodontia(String localConsulta, String dataConsulta, float valorConsulta) {
		super(localConsulta, dataConsulta, valorConsulta);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append("Qual e o precedimento? " + this.modeloAparelho);
		sb.append(";");
		sb.append("Qual a sala que deseja realizar sua consulta? " + this.salaOrtodontia);
		sb.append(";");
		sb.append(this.planoOrtodontia ? "Particular" : "Plano de saude");
		
		return sb.toString();
	}	
	
	@Override
	public float calculaOrcamento() throws OrtodontiaException {
		
		if (this.modeloAparelho.isBlank()) {
			throw new OrtodontiaException ("Nenhum modelo de avião foi adicionado");
		}
		
		float precodaConsulta = 0;		
		if (this.planoOrtodontia) {
			precodaConsulta = (float) 0.25;			
		}
		
		return this.getValorConsulta() + (this.getValorConsulta() * precodaConsulta);
	}

	public String getModeloAparelho() {
		return modeloAparelho;
	}

	public void setModeloAparelho(String modeloAparelho){
		this.modeloAparelho = modeloAparelho;		
	}

	public int getSalaOrtodontia() {
		return salaOrtodontia;
	}

	public void setSalaOrtodontia(int salaOrtodontia) {
		this.salaOrtodontia = salaOrtodontia;
	}

	public boolean isPlanoOrtodontia() {
		return planoOrtodontia;
	}

	public void setPlanoOrtodontia(boolean planoOrtodontia) {
		this.planoOrtodontia = planoOrtodontia;
	}
}

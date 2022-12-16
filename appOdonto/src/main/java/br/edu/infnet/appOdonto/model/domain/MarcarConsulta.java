package br.edu.infnet.appOdonto.model.domain;

import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.edu.infnet.appOdonto.model.exceptions.OrtodontiaException;
import br.edu.infnet.appOdonto.model.exceptions.EsteticaException;
import br.edu.infnet.appOdonto.model.exceptions.EndodontiaException;

public abstract class MarcarConsulta {
	
	private String localConsulta;
	private LocalDate dataConsulta;
	private float valorConsulta;
	
	DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public MarcarConsulta (String localConsulta, String dataConsulta, float valorConsulta) {
		this.localConsulta = localConsulta;
		this.dataConsulta = LocalDate.parse(dataConsulta, formatoData);
		this.valorConsulta = valorConsulta;
		
	}
	
	public String fazerConsulta() throws OrtodontiaException, EndodontiaException, EsteticaException{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Data da Consulta: " + this.dataConsulta.format(formatoData));
		sb.append(";");
		sb.append("Orçamento da Consulta: " + this.calculaOrcamento());
		sb.append("\r\n");
		
		return sb.toString();
	}
	
	@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Local da Consulta: " + this.localConsulta);
		sb.append(";");
		sb.append("Data da Consulta: " + this.dataConsulta.format(formatoData));
		sb.append(";");
		sb.append("Valor da Consulta: " + this.valorConsulta);
		
		return sb.toString();
	}
	public abstract float calculaOrcamento() throws OrtodontiaException, EndodontiaException, EsteticaException;
	
		public float getValorConsulta() {
		return valorConsulta;
	}

	public String getLocalConsulta() {
		return localConsulta;
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}
}

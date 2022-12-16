package br.edu.infnet.appOdonto.model.domain;

import java.time.LocalDateTime;

public class Servico {
	
	private String comentario;
	private LocalDateTime data;
	private boolean metodo;
	private Cadastro cadastro;
	
	public Servico() {
		data = LocalDateTime.now();
		
	}
	
	public Servico (String comentario, boolean metodo) {
		this();
		this.comentario = comentario;
		this.metodo = metodo;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s;%s", this.comentario, this.data.format(formatoData), this.metodo ? "Comprou pelo App" : "Realizou a compra pelo consultorio", this.cadastro.toString());
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public boolean isMetodo() {
		return metodo;
	}

	public void setMetodo(boolean metodo) {
		this.metodo = metodo;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Cadastro getPaciente() {
		return cadastro;
	}

	public void setPaciente(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
}

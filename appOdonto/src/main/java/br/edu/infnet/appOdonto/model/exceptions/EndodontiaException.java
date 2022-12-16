package br.edu.infnet.appOdonto.model.exceptions;

public class EndodontiaException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public EndodontiaException(String mensagem) {
		super("Erro " + mensagem);
	}

}

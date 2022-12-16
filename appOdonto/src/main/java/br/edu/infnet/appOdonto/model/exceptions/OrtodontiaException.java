package br.edu.infnet.appOdonto.model.exceptions;

public class OrtodontiaException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public OrtodontiaException(String mensagem) {
		super("Erro " + mensagem);
	}

}

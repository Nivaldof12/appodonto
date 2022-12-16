package br.edu.infnet.appOdonto.model.exceptions;

public class EsteticaException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public EsteticaException(String mensagem) {
		super("Erro " + mensagem);
	}

}

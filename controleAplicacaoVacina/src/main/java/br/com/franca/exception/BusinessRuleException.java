package br.com.franca.exception;

@SuppressWarnings("serial")
public class BusinessRuleException extends RuntimeException{

	public BusinessRuleException(String msg) {
		super(msg);
	}

	public BusinessRuleException(String msg, Throwable cause) {
		super(msg, cause);
	}
}

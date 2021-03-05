package br.com.franca.dto.erro;

public class ErroFormularioDTO extends ErroPadraoDTO {
	private String field;

	public ErroFormularioDTO(String field, String message, String error, String path, int status, long timestamp) {
		this.path = path;
		this.status = status;
		this.timestamp = timestamp;
		this.error = error;
		this.message = message;
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}

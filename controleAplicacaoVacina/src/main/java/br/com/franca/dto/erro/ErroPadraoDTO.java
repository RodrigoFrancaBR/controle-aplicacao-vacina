package br.com.franca.dto.erro;

public class ErroPadraoDTO {
	protected String path;
	protected Integer status;
	protected Long timestamp;
	protected String error;
	protected String message;

	public ErroPadraoDTO() {
	}

	public ErroPadraoDTO(String message, String error, String path, Integer status, Long timestamp) {
		this.path = path;
		this.status = status;
		this.timestamp = timestamp;
		this.error = error;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

}

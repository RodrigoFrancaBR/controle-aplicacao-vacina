package br.com.franca.exception;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.franca.dto.erro.ErroFormularioDTO;
import br.com.franca.dto.erro.ErroPadraoDTO;

@RestControllerAdvice
public class ControllerExceptionHandler {

	private MessageSource messageSource;

	public ControllerExceptionHandler(MessageSource messageSource) {
		this.messageSource = messageSource;

	}

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ErroPadraoDTO> handlerConstraintViolation(MethodArgumentNotValidException e,
			HttpServletRequest request) {

		List<ErroPadraoDTO> standardErrorList = new ArrayList<>();

		List<FieldError> fieldErrorList = e.getBindingResult().getFieldErrors();

		fieldErrorList.forEach((fildError) -> {
			
			String message = messageSource.getMessage(fildError, LocaleContextHolder.getLocale());			
			
			ErroFormularioDTO erroFormularioDTO = new ErroFormularioDTO(fildError.getField(), message,
					"Restrição de dados", request.getRequestURI(), HttpStatus.BAD_REQUEST.value(),
					System.currentTimeMillis());

			standardErrorList.add(erroFormularioDTO);

		});

		return standardErrorList;
	}

	@ExceptionHandler(ObjectNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ErroPadraoDTO handlerBusinessRule(ObjectNotFoundException e, HttpServletRequest request) {
		return new ErroPadraoDTO(e.getMessage(), "Recurso não Encontrado", request.getRequestURI(),
				HttpStatus.NOT_FOUND.value(), System.currentTimeMillis());
	}
	
	@ExceptionHandler(BusinessRuleException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ErroPadraoDTO handlerBusinessRule(BusinessRuleException e, HttpServletRequest request) {
		return new ErroPadraoDTO(e.getMessage(), "Erro de Regra de Negócio", request.getRequestURI(),
				HttpStatus.BAD_REQUEST.value(), System.currentTimeMillis());
	}
	
}

package br.com.franca.service.interfaces;

import br.com.franca.domain.Vacina;

public interface VacinaService {

	Vacina findByNome(String nomeDaVacina);

}

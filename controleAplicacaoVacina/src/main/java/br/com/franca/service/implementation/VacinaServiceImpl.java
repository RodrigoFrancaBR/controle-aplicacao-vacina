package br.com.franca.service.implementation;

import org.springframework.stereotype.Service;

import br.com.franca.domain.Vacina;
import br.com.franca.repository.VacinaRepository;
import br.com.franca.service.interfaces.VacinaService;

@Service
public class VacinaServiceImpl implements VacinaService {
	private VacinaRepository vacinaRepository;

	public VacinaServiceImpl(VacinaRepository vacinaRepository) {
		this.vacinaRepository = vacinaRepository;
	}

	public Vacina findByNome(String nome) {
		return this.vacinaRepository.findByNome(nome);
	}
}

package br.com.franca.service.implementation;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.franca.domain.Pessoa;
import br.com.franca.domain.Vacina;
import br.com.franca.domain.Vacinacao;
import br.com.franca.dto.cadastro.VacinacaoDTO;
import br.com.franca.exception.ObjectNotFoundException;
import br.com.franca.repository.VacinacaoRepository;
import br.com.franca.service.interfaces.PessoaService;
import br.com.franca.service.interfaces.VacinaService;
import br.com.franca.service.interfaces.VacinacaoService;

@Service
public class VacinacaoServiceImpl implements VacinacaoService {

	private PessoaService pessoaService;
	private VacinaService vacinaService;
	private VacinacaoRepository vacinacaoRepository;

	public VacinacaoServiceImpl(PessoaService pessoaService, VacinaService vacinaService,
			VacinacaoRepository vacinacaoRepository) {
		this.pessoaService = pessoaService;
		this.vacinaService = vacinaService;
		this.vacinacaoRepository = vacinacaoRepository;
	}

	@Override
	public void vacinar(Long pessoaId, VacinacaoDTO dto) {
		Pessoa pessoa = pessoaService.findById(pessoaId)
				.orElseThrow(() -> new ObjectNotFoundException("Pessoa não encontrada com o id: " + pessoaId));

		Vacina vacina = vacinaService.findByNome(dto.getNomeDaVacina());

		if (vacina == null) {
			throw new ObjectNotFoundException("Vacina não encontrada com o nome: " + dto.getNomeDaVacina());
		}

		Vacinacao vacinacao = new Vacinacao(vacina, pessoa, dto.getDataDeVacinacao());

		try {
			vacinacao = vacinacaoRepository.save(vacinacao);
		} catch (DataIntegrityViolationException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(vacinacao.getId());
	}
}

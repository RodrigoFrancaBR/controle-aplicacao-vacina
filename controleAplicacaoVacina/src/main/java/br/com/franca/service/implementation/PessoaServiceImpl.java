package br.com.franca.service.implementation;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.franca.domain.Pessoa;
import br.com.franca.dto.cadastro.PessoaDTO;
import br.com.franca.repository.PessoaRepository;
import br.com.franca.service.interfaces.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {
	private PessoaRepository pessoaRepository;

	public PessoaServiceImpl(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	@Override
	public void cadastrarPessoa(PessoaDTO dto) {
		Pessoa pessoa = new Pessoa(dto);
		pessoaRepository.save(pessoa);
	}

	@Override
	public Optional<Pessoa> findById(Long id) {
		return pessoaRepository.findById(id);
	}
}

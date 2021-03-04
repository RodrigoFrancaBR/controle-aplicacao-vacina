package br.com.franca.service.interfaces;

import java.util.Optional;

import br.com.franca.domain.Pessoa;
import br.com.franca.dto.cadastro.PessoaDTO;

public interface PessoaService {

	public void cadastrarPessoa(PessoaDTO dto);

	public Optional<Pessoa> findById(Long pessoaId);

}

package br.com.franca.service.interfaces;

import br.com.franca.dto.cadastro.VacinacaoDTO;

public interface VacinacaoService {

	void vacinar(Long pessoaId, VacinacaoDTO dto);
}

package br.com.franca.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.franca.dto.cadastro.PessoaDTO;
import br.com.franca.dto.cadastro.VacinacaoDTO;
import br.com.franca.service.implementation.PessoaServiceImpl;
import br.com.franca.service.interfaces.VacinacaoService;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

	private PessoaServiceImpl pessoaService;
	private VacinacaoService vacinacaoService;

	public PessoaController(PessoaServiceImpl pessoaService, VacinacaoService vacinacaoService) {
		this.pessoaService = pessoaService;
		this.vacinacaoService = vacinacaoService;
	}

	@PostMapping
	public void cadastrarPessoa(@RequestBody PessoaDTO dto) {
		pessoaService.cadastrarPessoa(dto);
	}

	@PostMapping(path = "/{pessoaId}/vacinas")
	public void vacinar(@PathVariable("pessoaId") Long pessoaId, @RequestBody VacinacaoDTO dto) {

		System.out.println(pessoaId);
		System.out.println(dto.getNomeDaVacina());
		System.out.println(dto.getDataDeVacinacao());

		vacinacaoService.vacinar(pessoaId, dto);
	}
}

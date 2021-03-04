package br.com.franca.dto.in;

import java.time.LocalDate;

public class VacinacaoDTO {
	private String nomeDaVacina;
	private LocalDate dataDeVacinacao;

	public String getNomeDaVacina() {
		return nomeDaVacina;
	}

	public void setNomeDaVacina(String nomeDaVacina) {
		this.nomeDaVacina = nomeDaVacina;
	}

	public LocalDate getDataDeVacinacao() {
		return dataDeVacinacao;
	}

	public void setDataDeVacinacao(LocalDate dataDeVacinacao) {
		this.dataDeVacinacao = dataDeVacinacao;
	}
}

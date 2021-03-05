package br.com.franca.dto.cadastro;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class VacinacaoDTO {
	
	@NotNull @NotEmpty @Size(max = 255)
	private String nomeDaVacina;
	
	@NotNull @NotEmpty @Size(max = 255)
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

package br.com.franca.dto.cadastro;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class PessoaDTO {
	
	@NotNull @NotEmpty(message = "Nome não deve ser vazio") @Size(max = 255)	
	private String nome;
	
	@NotNull @NotEmpty(message = "Email não deve ser vazio") @Size(max = 255)
	private String email;
	
	@NotNull @NotEmpty (message = "Cpf não deve ser vazio")@Size(max = 11)
	private String cpf;
	
	@NotNull
	private LocalDate dataNascimento;	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}

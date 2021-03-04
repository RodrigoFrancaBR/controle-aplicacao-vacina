package br.com.franca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.franca.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
}

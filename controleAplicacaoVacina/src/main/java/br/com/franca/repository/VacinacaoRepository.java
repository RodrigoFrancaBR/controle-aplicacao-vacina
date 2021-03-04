package br.com.franca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.franca.domain.Vacinacao;

public interface VacinacaoRepository extends JpaRepository<Vacinacao, Long> {
}

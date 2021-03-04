package br.com.franca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.franca.domain.Vacina;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {

	Vacina findByNome(String nome);

}

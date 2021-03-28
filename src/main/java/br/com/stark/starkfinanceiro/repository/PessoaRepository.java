package br.com.stark.starkfinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stark.starkfinanceiro.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}

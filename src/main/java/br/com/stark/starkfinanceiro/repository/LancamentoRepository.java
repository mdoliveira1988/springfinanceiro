package br.com.stark.starkfinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stark.starkfinanceiro.model.Lancamento;
import br.com.stark.starkfinanceiro.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}

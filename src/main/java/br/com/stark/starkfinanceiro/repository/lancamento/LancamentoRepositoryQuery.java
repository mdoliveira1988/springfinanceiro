package br.com.stark.starkfinanceiro.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.stark.starkfinanceiro.model.Lancamento;
import br.com.stark.starkfinanceiro.projection.ResumoLancamento;
import br.com.stark.starkfinanceiro.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}

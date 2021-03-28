package br.com.stark.starkfinanceiro.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.stark.starkfinanceiro.exception.PessoaInexistenteOuInativaException;
import br.com.stark.starkfinanceiro.model.Lancamento;
import br.com.stark.starkfinanceiro.model.Pessoa;
import br.com.stark.starkfinanceiro.repository.LancamentoRepository;
import br.com.stark.starkfinanceiro.repository.PessoaRepository;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(@Valid Lancamento lancamento) throws PessoaInexistenteOuInativaException {
        Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());

        if (!pessoa.isPresent() || pessoa.get().isInativo()) {
            throw new PessoaInexistenteOuInativaException();
        }

        return lancamentoRepository.save(lancamento);
    }
}

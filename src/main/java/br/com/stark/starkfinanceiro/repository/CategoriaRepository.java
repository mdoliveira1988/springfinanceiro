package br.com.stark.starkfinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stark.starkfinanceiro.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}

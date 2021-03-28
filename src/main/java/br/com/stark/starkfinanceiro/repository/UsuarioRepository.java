package br.com.stark.starkfinanceiro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stark.starkfinanceiro.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);
	
}

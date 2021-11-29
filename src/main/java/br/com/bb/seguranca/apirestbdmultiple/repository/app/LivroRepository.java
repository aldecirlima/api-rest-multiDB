package br.com.bb.seguranca.apirestbdmultiple.repository.app;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bb.seguranca.apirestbdmultiple.model.app.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
}

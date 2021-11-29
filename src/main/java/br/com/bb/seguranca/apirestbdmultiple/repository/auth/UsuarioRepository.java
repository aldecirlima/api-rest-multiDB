package br.com.bb.seguranca.apirestbdmultiple.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bb.seguranca.apirestbdmultiple.model.auth.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}

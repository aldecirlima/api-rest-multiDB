package br.com.bb.seguranca.apirestbdmultiple.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bb.seguranca.apirestbdmultiple.model.app.Livro;
import br.com.bb.seguranca.apirestbdmultiple.model.auth.Usuario;
import br.com.bb.seguranca.apirestbdmultiple.repository.app.LivroRepository;
import br.com.bb.seguranca.apirestbdmultiple.repository.auth.UsuarioRepository;
import br.com.bb.seguranca.apirestbdmultiple.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService {

	@Autowired
	private LivroRepository livroRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Livro> obterLivros() {
		return this.livroRepository.findAll();
	}

	@Override
	public Livro criar(Livro livro) {
		Usuario usuario = this.usuarioRepository
				.findById(livro.getCodigoUsuario())
				.orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado."));
		livro.setNomeUsuario(usuario.getNome());
		return this.livroRepository.save(livro);
	}

}

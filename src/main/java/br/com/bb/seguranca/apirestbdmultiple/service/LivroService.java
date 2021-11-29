package br.com.bb.seguranca.apirestbdmultiple.service;

import java.util.List;

import br.com.bb.seguranca.apirestbdmultiple.model.app.Livro;


public interface LivroService {

	public List<Livro> obterLivros();

	public Livro criar(Livro livro);
}

package br.com.bb.seguranca.apirestbdmultiple.model.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "livro")
public class Livro {

	@Id
	private Long codigo;
	
	private String title;
	
	private String autor;
	
	private String tema;
	
	@Column(name = "nome_usuario")
	private String nomeUsuario;	
	
	@Transient
	private Long codigoUsuario;
}

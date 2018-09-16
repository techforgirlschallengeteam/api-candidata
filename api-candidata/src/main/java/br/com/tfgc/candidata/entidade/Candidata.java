package br.com.tfgc.candidata.entidade;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "perfil")
public class Candidata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "headline", nullable = false)
	private String headline;

	@ElementCollection
	private List<String> tecnologias = new ArrayList<String>();

	@Column(name = "telefone", nullable = false, unique = true)
	private String telefone;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "resumo", nullable = false)
	private String resumo;

	public Candidata() {

	}

	public Candidata(long id, String nome, String headline, List<String> tecnologias, String telefone, String email,
			String resumo) {
		super();
		Id = id;
		this.nome = nome;
		this.headline = headline;
		this.tecnologias = tecnologias;
		this.telefone = telefone;
		this.email = email;
		this.resumo = resumo;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public List<String> getTecnologias() {
		return tecnologias;
	}

	public void setTecnologias(List<String> tecnologias) {
		this.tecnologias = tecnologias;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

}

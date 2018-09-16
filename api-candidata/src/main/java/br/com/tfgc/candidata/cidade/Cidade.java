package br.com.tfgc.candidata.cidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "nome", nullable = true)
	private String nome;

	@Column(name = "estado", nullable = true)
	private String estado;

	public Cidade(String nomeCidade, String nomeEstado) {
		this.nome = nomeCidade;
		this.estado = nomeEstado;
	}

	public Cidade() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeCidade) {
		this.nome = nomeCidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String nomeEstado) {
		this.estado = nomeEstado;
	}
}
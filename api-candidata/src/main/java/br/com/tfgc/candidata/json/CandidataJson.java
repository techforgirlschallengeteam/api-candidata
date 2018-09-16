package br.com.tfgc.candidata.json;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidataJson {

	@Length(max = 100)
	@NotBlank
	private String nome;

	@Length(max = 300)
	@NotBlank
	private String headline;

	@NotBlank
	private List<String> tecnologias = new ArrayList<String>();

	@Length(max = 20)
	@NotBlank
	private String telefone;

	@Length(max = 100)
	@NotBlank
	private String email;

	@Length(max = 500)
	@NotBlank
	private String resumo;

	public CandidataJson() {

	}

	public CandidataJson(@Length(max = 100) @NotBlank String nome, @Length(max = 300) @NotBlank String headline,
			@NotBlank List<String> tecnologias, @Length(max = 20) @NotBlank String telefone,
			@Length(max = 100) @NotBlank String email, @Length(max = 500) @NotBlank String resumo) {
		super();
		this.nome = nome;
		this.headline = headline;
		this.tecnologias = tecnologias;
		this.telefone = telefone;
		this.email = email;
		this.resumo = resumo;
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

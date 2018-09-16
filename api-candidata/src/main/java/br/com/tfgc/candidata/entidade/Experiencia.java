package br.com.tfgc.candidata.entidade;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "experiencia")
public class Experiencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	@Column(name = "cargo", nullable = false)
	private String cargo;

	@Column(name = "descricao", nullable = false)
	private String descricao;

	@Column(name = "data_inicio", nullable = false)
	private LocalDate dataInicio;

	@Column(name = "data_termino", nullable = false)
	private LocalDate dataTermino;

	@Column(name = "empresa", nullable = false)
	private String empresa;

	public Experiencia() {

	}

	public Experiencia(long id, String cargo, String descricao, LocalDate dataInicio, LocalDate dataTermino,
			String empresa) {
		super();
		Id = id;
		this.cargo = cargo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.empresa = empresa;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}

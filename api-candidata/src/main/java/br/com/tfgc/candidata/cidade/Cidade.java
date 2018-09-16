package br.com.tfgc.candidata.cidade;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id")
    private UUID id;

    @Column(name = "cidade")
    private String nomeCidade;

    @Column(name = "estado")
    private String nomeEstado;

    public Cidade(String nomeCidade, String nomeEstado) {
        this.nomeCidade = nomeCidade;
        this.nomeEstado = nomeEstado;
    }

    public Cidade() {
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }
}
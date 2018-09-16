package br.com.tfgc.candidata.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.tfgc.candidata.entidade.Candidata;

@Repository
public interface CandidataDAO extends CrudRepository<Candidata, Long>{

}

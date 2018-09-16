package br.com.tfgc.candidata.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tfgc.candidata.conversor.CandidataConversor;
import br.com.tfgc.candidata.dao.CandidataDAO;
import br.com.tfgc.candidata.json.CandidataJson;

@Service
public class CandidataServico {

	@Autowired
	private CandidataDAO candidataDAO;

	public void save(CandidataJson candidataJson) {
		candidataDAO.save(CandidataConversor.jsonToCandidata(candidataJson));
	}

}

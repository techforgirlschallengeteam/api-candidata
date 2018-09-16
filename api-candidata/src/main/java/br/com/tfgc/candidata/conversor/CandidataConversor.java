package br.com.tfgc.candidata.conversor;

import br.com.tfgc.candidata.entidade.Candidata;
import br.com.tfgc.candidata.json.CandidataJson;

public class CandidataConversor {
	public static Candidata jsonToCandidata(CandidataJson jsonCandidata){
		Candidata candidata = new Candidata();
		candidata.setEmail(jsonCandidata.getEmail());
		candidata.setHeadline(jsonCandidata.getHeadline());
		candidata.setNome(jsonCandidata.getNome());
		candidata.setResumo(jsonCandidata.getResumo());
		candidata.setTecnologias(jsonCandidata.getTecnologias());
		candidata.setTelefone(jsonCandidata.getTelefone());
		return candidata;
	}
}
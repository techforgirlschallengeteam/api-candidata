package br.com.tfgc.candidata.entidade;

public enum Nivel {
	INICIANTE("Iniciante"), INTERMEDIARIO("Intermediário"), AVANCADO("Avançado"), FLUENTE("Fluente");

	private String level;

	private Nivel(String level) {
		this.setLevel(level);
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}

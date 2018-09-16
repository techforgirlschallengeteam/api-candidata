package br.com.tfgc.candidata.entidade;

public enum Idioma {
	INGLES("Inglês"), PORTUGUES("Português"), ESPANHOL("Espanhol"), FRANCES("Francês");

	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	private Idioma(String language) {
		this.language = language;
	}

}

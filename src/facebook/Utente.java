package facebook;

public class Utente {
	
	private String nome;
	private String cognome;
	private int eta;
	
	public Utente(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getEta() {
		return eta;
	}

	
}

package javaOO;

public class Persona {
	
	String nome;
	String cognome;
	int eta;
	char sesso;
	//Costruttore
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	@Override
	public String toString() {
		return "Persona [Nome=" + nome + ", Cognome=" + cognome + ", Et�=" + eta + ", Sesso=" + sesso + "]";
	}
	
	
}

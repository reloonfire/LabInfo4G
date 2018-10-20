package facebook;

public class Amici {
	
	private Utente[] listaAmici = new Utente[100];
	private int indice;

	
	
	public Amici() {
		this.indice = 0;
	}
	
	public Utente searchAmico(String nome_cognome) {
		for (Utente utente : listaAmici) {
			if ((utente.getNome()+ " " + utente.getCognome()).equals(nome_cognome)) {
				return utente;
			}
		}
		return null;
	}

	public void addAmico(Utente utente) {
		if (indice++ < listaAmici.length) {
			listaAmici[indice] = utente;
			indice++;
		}else {
			System.out.println("Hai raggiunto il limite di amici.");
		}
	}

	
}

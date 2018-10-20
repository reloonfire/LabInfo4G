package facebook;

public class Amici {
	
	private Utente[] listaAmici = new Utente[100];
	private int indice;

	
	
	public Amici(Utente[] listaAmici) {
		this.listaAmici = listaAmici;
		this.indice = 0;
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

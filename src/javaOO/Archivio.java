package javaOO;

public class Archivio {

	private int indice = 0;	
	private Persona[] listaPersone;
	
	public Archivio(int indice) {
		this.listaPersone = new Persona[indice];
	}
	
	public boolean aggiungiPersona(Persona p) {
		if(indice < listaPersone.length) {
			listaPersone[indice++] = p;
			return true;
		}
		return false;
	}
	
	/**
	 * Cerca una persona nell'archivio tramite il cognome.
	 * @param cognome
	 * @return
	 */
	public Persona cerca(String cognome) {
		for (Persona p: listaPersone) {
			if (cognome.equals(p.cognome)) {
				return p;
			}
		}
		return null;
	}
}

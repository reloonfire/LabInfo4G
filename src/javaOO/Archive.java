package javaOO;

import javax.swing.JSpinner.ListEditor;

public class Archive {

	private int indice = 0;
	private Persona[] listaPersone;

	public Archive(int dim) {
		this.listaPersone = new Persona[dim];
	}

	public boolean addPerson(Persona p) {
		if (indice < listaPersone.length) {
			listaPersone[indice++] = p;
			return true;
		}
		return false;
	}

	public boolean removePersonBySurname(String cognome) {
		for (int i = 0; i < listaPersone.length; i++) {
			if (cognome.equals(listaPersone[i].cognome)) {
				listaPersone[i] = null;
			}
		}
		return false;
	}

	/**
	 * Cerca una persona nell'archivio tramite il cognome.
	 * 
	 * @param cognome
	 * @return
	 */
	public Persona searchPersonBySurname(String cognome) {
		for (Persona p : listaPersone) {
			if (cognome.equals(p.cognome)) {
				return p;
			}
		}
		return null;
	}
}

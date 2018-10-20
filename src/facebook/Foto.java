package facebook;

public class Foto {
	
	private String titolo;
	private Utente tag;

	public Foto(String titolo) {
		this.titolo = titolo;
		tag = null;
	}
	
	public void tagAmico(Utente tag) {
		if(this.tag == null) {
			this.tag = tag;
		}else {
			System.out.println("Hai già taggato un amico in questa foto.");
		}
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Utente getTag() {
		return tag;
	}
	
	
	
}

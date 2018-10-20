package facebook;

public class Facebook {

	public static void main(String[] args) {
		Utente profilo = new Utente("Lorenzo","Avallone",17);
		System.out.println("Bentornato "+profilo.getNome() + " " + profilo.getCognome() + " \nCosa vuoi fare?");
	}

}

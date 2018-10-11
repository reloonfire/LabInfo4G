package motorino;

public class Main {

	public static void main(String[] args) {
		MotorinoImmatricolato piaggio = new MotorinoImmatricolato("rosso", "Si Piaggio", 30);
		piaggio.setAntifurto(true);
		piaggio.accelera(30);
		System.out.println(piaggio.toString());
		
	}

}

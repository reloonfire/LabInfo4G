package motorino;

import java.util.Random;

public class MotorinoImmatricolato {

	final String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String colore;
	private float velocit�;
	private String tipo;
	private boolean antifurto = false;
	private float maxVelocit�;
	private String targa;

	public MotorinoImmatricolato(String colore, String tipo, float maxVelocit�) {
		this.colore = colore;
		this.tipo = tipo;
		this.maxVelocit� = maxVelocit�;
		targa = setTarga();
	}

	public float getVelocit�() {
		return velocit�;
	}

	public void accelera(float velocit�) {
		if (!antifurto && (this.velocit�+velocit�) <= maxVelocit�) {
			this.velocit� += velocit�;
		}

	}

	public float getMaxVelocit�() {
		return maxVelocit�;
	}

	public void setAntifurto(boolean antifurto) {
		if (velocit� == 0) {
			this.antifurto = antifurto;
		}

	}

	private String setTarga() {
		Random r = new Random();
		String targa = "";

		targa += alfa.charAt(r.nextInt(alfa.length()));
		targa += alfa.charAt(r.nextInt(alfa.length()));

		for (int i = 0; i < 5; i++) {
			targa += r.nextInt(9);
		}
		return targa;
	}

	@Override
	public String toString() {
		return "MotorinoImmatricolato [colore=" + colore + ", velocit�=" + velocit� + ", tipo=" + tipo + ", antifurto="
				+ antifurto + ", maxVelocit�=" + maxVelocit� + ", targa=" + targa + "]";
	}
	

}

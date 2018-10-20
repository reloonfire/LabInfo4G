package facebook;

public class Galleria {
	
	private Foto[] galleria = new Foto[100];
	static int indice = 0;
	
	public void addFoto(Foto foto) {
		if (indice++ < galleria.length) {
			galleria[indice] = foto;
			indice++;
		}else {
			System.out.println("Hai raggiunto il limite di foto.");
		}
	}
}

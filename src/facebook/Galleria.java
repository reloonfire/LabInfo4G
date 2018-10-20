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
	
	public Foto searchPhotoByTag(String tag) {
		for (int i = 0; i < indice; i++) {
			if (galleria[i].getTag().equals(tag)) {
				return galleria[i];
			}
		}
		return null;
	}
}

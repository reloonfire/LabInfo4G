package facebook;

import java.util.ArrayList;
import java.util.List;

public class Galleria {
	
	private List<Foto> galleria = new ArrayList<>();
	//private Foto[] galleria = new Foto[100];
	static int indice = 0;
	
	public void addFoto(Foto foto) {
			galleria.add(foto);
			indice++;
	}
	
	public Foto searchPhotoByTag(String tag) {
		for (int i = 0; i < galleria.size(); i++) {
			if (galleria.get(i).getTag().equals(tag)) {
				return galleria.get(i);
			}
		}
		return null;
	}
}
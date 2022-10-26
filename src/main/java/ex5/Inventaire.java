package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Inventaire.
 */
public class Inventaire {

	private List<Caisse> caisses;

	/**
	 * Instantiates a new Inventaire.
	 */
	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 0, 5));
		caisses.add(new Caisse("Moyens objets", 5, 20));
		caisses.add(new Caisse("Grands objets", 21, 0));
	}

	/**
	 * Add item.
	 *
	 * @param item the item
	 */
	public void addItem(Item item) {

		for(Caisse caisse : caisses){
			caisse.accepterItem(item);
		}
	}

	/**
	 * Taille de l'inventaire, sauf l'ensemble de chaque caisse.
	 *
	 * @return the int
	 */
	public int taille() {
		
		int size = 0;

		for(Caisse caisse : caisses){
			size += caisse.getItems().size();
		}
		return size;
	}
}

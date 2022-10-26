package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Caisse.
 */
public class Caisse {

	private String nom;
	private List<Item> items;
	private int min;
	private int max;

	/**
	 * Constructeur
	 *
	 * @param nom the nom
	 */
	public Caisse(String nom, int min, int max) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
		this.min = min;
		this.max = max;
	}

	/**
	 * Accepter.
	 *
	 * @param item the item
	 */
	public void accepterItem(Item item){

		if (item.getPoids() >= this.getMin() && item.getPoids() < this.getMax()) {
			items.add(item);
		}

		else if (item.getPoids() >= this.getMin()) {
			items.add(item);
		}
	}

	/**
	 * Getter pour l'attribut nom
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut items
	 *
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * Setter pour l'attribut items
	 *
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}


	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}

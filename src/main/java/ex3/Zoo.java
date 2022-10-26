package ex3;

import java.util.List;
import java.util.Map;

/**
 * The type Zoo.
 */
public class Zoo {

	private String nom;
	private Map<String, Animal> animaux;

	/**
	 * Instantiates a new Zoo.
	 *
	 * @param nom the nom
	 */
	public Zoo(String nom){
		this.nom = nom;
	}

	/**
	 * Add animal.
	 *
	 * @param nom          the nom
	 * @param type         the type
	 * @param comportement the comportement
	 */
	public void addAnimal(String nom, String type, String comportement){
		animaux.put(nom, new Animal(nom, type, comportement));
	}

	/**
	 * Afficher liste animaux.
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animaux.values()) {
			System.out.println(animal.getNom()+" "+animal.getType()+" "+animal.getComportement());
		}
	}

	/**
	 * Taille int.
	 *
	 * @return the number of animals in zoo
	 */
	public int taille() {
		return animaux.size();
	}


	/**
	 * Gets nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets nom.
	 *
	 * @param nom the nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}

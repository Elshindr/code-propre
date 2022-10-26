package ex1;

import java.util.Date;

/**
 * The type Entreprise.
 */
public class Entreprise {
	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;

	/**
	 * The constant CAPITAL_MAX.
	 */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Afficher statut.
	 */
	public void afficherStatut(){
	}


	/**
	 * Gets siret.
	 *
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Sets siret.
	 *
	 * @param siret the siret
	 */
	public void setSiret(int siret) {
		this.siret = siret;
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

	/**
	 * Gets adresse.
	 *
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Sets adresse.
	 *
	 * @param adresse the adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Gets date creation.
	 *
	 * @return the date creation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Sets date creation.
	 *
	 * @param dateCreation the date creation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}

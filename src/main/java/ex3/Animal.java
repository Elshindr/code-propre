package ex3;

import java.util.List;

/**
 * The type Animal.
 */
public class Animal {
    private String type;
    private String nom;
    private String comportement;

    /**
     * Instantiates a new Animal.
     *
     * @param type        the type
     * @param nom         the nom
     * @param comportement the comportement
     */
    public Animal(String type, String nom, String comportement) {
        this.type = type;
        this.nom = nom;
        this.comportement = comportement;
    }

    /**
     * Gets types.
     *
     * @return the types
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the types
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets noms.
     *
     * @return the noms
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
     * Gets comportement.
     *
     * @return the comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Sets comportement.
     *
     * @param comportement the comportement
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}

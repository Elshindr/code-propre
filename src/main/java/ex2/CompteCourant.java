package ex2;

public class CompteCourant extends CompteBancaire{
    /** decouvert : un découvert est autorisé seulement pour les comptes courants */
    private double decouvert;

    /**
     * @param type
     * @param solde
     * @param decouvert
     */
    public CompteCourant(String type, double solde, double decouvert) {
        super(type, solde);
        this.decouvert = decouvert;
    }

    /** Ajoute un montant au solde
     * @param montant
     */
    public void debiterMontant(double montant){
        if (this.solde - montant > decouvert){
            this.solde = solde - montant;
        }
    }

    public double getDecouvert() {
        return decouvert;
    }


    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}

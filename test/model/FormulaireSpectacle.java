package model;

public class FormulaireSpectacle extends Formulaire {
    private static int numeroPlace;
	private int numeroZone;

    public FormulaireSpectacle(int jour, int mois, int numeroZone, int numeroChaise) {
        super(jour, mois, numeroPlace);
        this.numeroZone = numeroZone;
    }

    public int getNumeroZone() {
        return numeroZone;
    }

    @Override
    public String toString() {
        return "Le " + jour + "/" + mois + "\nPlace de spectacle " + IdentificationEntite +
               " dans la zone " + numeroZone + ".";
    }
}
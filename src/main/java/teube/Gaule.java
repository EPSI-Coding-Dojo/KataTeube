package teube;

/**
 * Created by eptwalabha on 20/11/2014.
 */
public enum Gaule {
    Dur(4), Normal(3), DemiMolle(2), Repos(1);

    private final int facteur;
    private Gaule(int facteur) {
        this.facteur = facteur;
    }

    public int calculerTailleTronc(int tailleTroncDeBase) {
        return facteur * tailleTroncDeBase;
    }
}

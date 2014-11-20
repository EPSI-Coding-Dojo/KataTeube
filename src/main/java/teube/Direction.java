package teube;

/**
 * Created by eptwalabha on 20/11/2014.
 */
public enum Direction {
    Droite("8", "=", "D"), Bas("OO\n", "||\n", "\\/"), Gauche("C", "=", "8"), Haut("/\\\n", "||\n", "OO");
    private final String motifDebut;
    private final String motifFin;
    private final String motifMilieu;

    Direction(String motifDebut, String motifMilieu, String motifFin) {
        this.motifDebut = motifDebut;
        this.motifMilieu = motifMilieu;
        this.motifFin = motifFin;
    }

    public String getMotifDebut() {
        return motifDebut;
    }

    public String getMotifFin() {
        return motifFin;
    }

    public String getMotifMilieu() {
        return motifMilieu;
    }
}

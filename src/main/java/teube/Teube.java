package teube;

/**
 * Created by eptwalabha on 20/11/2014.
 */
public class Teube {

    final int tailleTronc;
    private Gaule gaule = Gaule.Repos;
    private Direction direction = Direction.Droite;

    public Teube() {
        this(1);
    }

    public Teube(int taille) {
        tailleTronc = taille;
    }

    @Override
    public String toString(){
        String tronc = retournerTronc();
        String motifDebut = direction.getMotifDebut();
        String motifFin = direction.getMotifFin();
        return motifDebut + tronc + motifFin;
    }

    private String retournerTronc() {
        String tronc = "";
        int tailleReelleDuTronc = gaule.calculerTailleTronc(tailleTronc);
        for (int i = 0; i < tailleReelleDuTronc; ++i) {
            tronc += direction.getMotifMilieu();
        }
        return tronc;
    }

    public void aLaGaule() {
        aLaGaule(Gaule.Normal);
    }

    public void aLaGaule(Gaule facteur) {
        gaule = facteur;
    }

    public void oriente(Direction direction) {
        this.direction = direction;
    }
}

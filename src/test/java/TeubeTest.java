import org.junit.Before;
import org.junit.Test;
import teube.Direction;
import teube.Gaule;
import teube.Teube;

import static org.junit.Assert.assertEquals;
import static teube.Gaule.*;

/**
 * Created by codingdojo Epsi on 20/11/2014.
 */
public class TeubeTest {


    private Teube teube;

    @Before
    public void setUp() {
        teube = new Teube();
    }

    @Test
    public void peutMeCreerUnePetiteTeube() {
        assertEquals("8=D", teube.toString());
    }

    @Test
    public void peutMeCreerUneTeubeAvecUneTailleSpecifique(){
        teube = new Teube(5);
        assertEquals("8=====D", teube.toString());
    }

    @Test
    public void peutBander() {
        teube.aLaGaule();
        assertEquals("8===D", teube.toString());
    }

    @Test
    public void peutBanderDur() {
        teube.aLaGaule(Dur);
        assertEquals("8====D", teube.toString());
    }

    @Test
      public void peutOrienterSaTeubeADroite() {
        teube.oriente(Direction.Gauche);
        assertEquals("C=8", teube.toString());
    }

    @Test
    public void peutOrienterSaTeubeEnBas() {
        teube.oriente(Direction.Bas);
        String teubeEnBas = "" +
                        "OO\n" +
                        "||\n" +
                       "\\/";
        assertEquals(teubeEnBas, teube.toString());
    }
}

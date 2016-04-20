
package ohtu.intjoukkosovellus;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntJoukkoKaksiparametrisellaKonstruktorillaTest extends IntJoukkoTest {
    
    @Before
    public void setUp() {
        joukko = new IntJoukko(4, 2);
        joukko.lisaa(10);
        joukko.lisaa(3);
    }

    @Test (expected=IndexOutOfBoundsException.class)
    public void heittaaVirheenNegatiivisellaKasvatuskoolla() {
        IntJoukko testiJoukko = new IntJoukko(1, -2);
    }

    @Test (expected=IndexOutOfBoundsException.class)
    public void heittaaVirheenNegatiivisellaKaspasiteetilla() {
        IntJoukko testiJoukko = new IntJoukko(-1, 2);
    }
}

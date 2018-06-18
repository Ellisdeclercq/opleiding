import com.ellisdeclercq.breuken.Breuk;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreukTest {

    @Test
    public void breukOptellen() {
        Breuk a = new Breuk(1, 5);
        Breuk b = new Breuk(3, 4);

        Breuk c = a.plus(b);


        assertEquals(c.getTeller(), 19);
        assertEquals(c.getNoemer(), 20);

    }


    @Test
    public void breukOptellen2() {
        Breuk c = new Breuk(5, 10);
        Breuk d = new Breuk(8, 5);

        Breuk e = c.plus(d);

        assertEquals(e.getTeller(), 105);
        assertEquals(e.getNoemer(), 50);

    }

    @Test
    public void breukAftrekken() {
        Breuk a = new Breuk(1, 2);
        Breuk b = new Breuk(3, 4);

        Breuk c = a.min(b);

        assertEquals(c.getTeller(), -2);
        assertEquals(c.getNoemer(), 8);

    }

    @Test
    public void breukAftrekken2() {
        Breuk a = new Breuk(3, 4);
        Breuk b = new Breuk(1, 2);

        Breuk c = a.min(b);

        assertEquals(c.getTeller(), 2);
        assertEquals(c.getNoemer(), 8);

    }


    @Test
    public void breukVermenigvuldigen() {
        Breuk a = new Breuk (3, 8);
        Breuk b = new Breuk (4, 9);

        Breuk c = a.maal(b);

        assertEquals(c.getTeller(), 12);
        assertEquals(c.getNoemer(), 72);
    }

    @Test
    public void breukOmkeren () {
        Breuk a = new Breuk (5, 8);

        Breuk b = a.omkering();

        assertEquals(b.getTeller(), 8);
        assertEquals(b.getNoemer(), 5);
    }

    @Test
    public void breukDelen () {
        Breuk a = new Breuk (1, 4);
        Breuk b = new Breuk (1,8);

        Breuk c = a.deel(b);

        assertEquals(c.getTeller(),8);
        assertEquals(c.getNoemer(), 4);

    }




}


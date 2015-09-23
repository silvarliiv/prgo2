import org.junit.*;
import static org.junit.Assert.*;

public class IsikukoodiTest {

    private Isikukood isik_1 = new Isikukood("39405062736");
    private Isikukood isik_2 = new Isikukood("50007162343");
    private Isikukood isik_3 = new Isikukood("19310050034");

    private Isikukood isik_4 = new Isikukood("60504010037");
    private Isikukood isik_5 = new Isikukood("29912310238");
    private Isikukood isik_6 = new Isikukood("47605030299");

    @Test
    public void oigekiriTest() {
        assertEquals(true, isik_1.oigekiri());
        assertEquals(true, isik_2.oigekiri());
        assertEquals(true, isik_3.oigekiri());

        assertEquals(true, isik_4.oigekiri());
        assertEquals(true, isik_5.oigekiri());
        assertEquals(true, isik_6.oigekiri());
    }

    @Test
    public void suguTest() {
        assertEquals("mees", isik_1.sugu());
        assertEquals("mees", isik_2.sugu());
        assertEquals("mees", isik_3.sugu());

        assertEquals("naine", isik_4.sugu());
        assertEquals("naine", isik_5.sugu());
        assertEquals("naine", isik_6.sugu());
    }

    @Test 
    public void synniaastaTest() {
        assertEquals(1994, isik_1.synniaasta());
        assertEquals(2000, isik_2.synniaasta());
        assertEquals(1893, isik_3.synniaasta());

        assertEquals(2005, isik_4.synniaasta());
        assertEquals(1899, isik_5.synniaasta());
        assertEquals(1976, isik_6.synniaasta());
    }

    @Test
    public void kontrollsummaTest() {
        assertEquals(6, isik_1.kontrollsumma());
        assertEquals(3, isik_2.kontrollsumma());
        assertEquals(4, isik_3.kontrollsumma());

        assertEquals(7, isik_4.kontrollsumma());
        assertEquals(8, isik_5.kontrollsumma());
        assertEquals(9, isik_6.kontrollsumma());
    }
}
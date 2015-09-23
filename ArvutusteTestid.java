import org.junit.*;
import static org.junit.Assert.*;
public class ArvutusteTestid{
	@Test
    public void pikkus(){
		assertEquals(5.0, Arvutused.pikkus(3, 4), 0.01);
		assertEquals(0.0, Arvutused.pikkus(0, 0), 0.01);
		assertEquals(5.0, Arvutused.pikkus(3,-4), 0.01);
	}	
	
	@Test
	public void punktideKauguseTest(){
		assertEquals(1.41, Arvutused.punktideVahelineKaugus(2, 1, 1, 2), 0.01);
		assertEquals(5, Arvutused.punktideVahelineKaugus(1, 5, 4, 1), 0.01);
	}
}

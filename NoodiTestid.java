import org.junit.*;
import static org.junit.Assert.*;
public class NoodiTestid{
	@Test
	public void loomine(){
		Noot n1=new Noot("A");
	}
	@Test
	public void korgus(){
		Noot n1=new Noot("A");
		assertEquals(69, n1.kysiKorgus());
		//Lisage C kõrgusega 60
	}
}
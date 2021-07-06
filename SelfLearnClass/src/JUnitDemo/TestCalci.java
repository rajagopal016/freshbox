package JUnitDemo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalci {

	Calci c = new Calci();
	@Test
	public void testAdd() {
		assertEquals(4, c.add(1, 2));
		
	}
	

}

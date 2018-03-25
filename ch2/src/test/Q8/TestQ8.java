package test.Q8;
import ch2.Q8;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestQ8 {

	@Test
	void testMain() {
		//fail("Not yet implemented");
		assertEquals(true,Q8.inRect(10, 10, 150, 150));
		assertEquals(true,Q8.inRect(10, 150, 150, 250));
		assertEquals(true,Q8.inRect(150, 10, 250, 150));
		assertEquals(true,Q8.inRect(150, 150, 250, 250));
		assertEquals(true,Q8.inRect(130, 130, 160, 160));
		assertEquals(true,Q8.inRect(10, 10, 250, 250));
		assertEquals(true,Q8.inRect(10, 130, 250, 160));
		assertEquals(true,Q8.inRect(130, 10, 160, 250));
		assertEquals(true,Q8.inRect(100, 10, 200, 100));
		assertEquals(true,Q8.inRect(100, 200, 200, 300));
		assertEquals(true,Q8.inRect(10, 100, 100, 200));
		assertEquals(true,Q8.inRect(200, 100, 300, 200));
	
		/*
		assertEquals(false,Q8.inRect(10, 10, 150, 150));
		assertEquals(false,Q8.inRect(10, 10, 150, 150));
		assertEquals(false,Q8.inRect(10, 10, 150, 150));
		assertEquals(false,Q8.inRect(10, 10, 150, 150));
		assertEquals(false,Q8.inRect(10, 10, 150, 150));
		assertEquals(false,Q8.inRect(10, 10, 150, 150));
		assertEquals(false,Q8.inRect(10, 10, 150, 150));
		assertEquals(false,Q8.inRect(10, 10, 150, 150));
		*/
	}

}

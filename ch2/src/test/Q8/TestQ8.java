package test.Q8;
import ch2.Q8;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestQ8 {

	@Test
	void testMain() {
		//fail("Not yet implemented");

		assertEquals(true,Q8.inRect( 10,  10, 150, 150));
		assertEquals(true,Q8.inRect( 10, 150, 150, 250));
		assertEquals(true,Q8.inRect(150,  10, 250, 150));
		assertEquals(true,Q8.inRect(150, 150, 250, 250));
		System.out.print("모서리에서 충돌하는 경우 정상동작\n");
		assertEquals(true,Q8.inRect(130, 130, 160, 160));
		assertEquals(true,Q8.inRect( 10,  10, 250, 250));
		System.out.print("완전포함 충돌하는 경우 정상동작\n");
		assertEquals(true,Q8.inRect( 10, 130, 250, 160));
		assertEquals(true,Q8.inRect(130,  10, 160, 250));
		System.out.print("십자가 모양으로 충돌하는 경우 정상동작\n");
		assertEquals(true,Q8.inRect(100,  10, 200, 100));
		assertEquals(true,Q8.inRect(100, 200, 200, 300));
		assertEquals(true,Q8.inRect( 10, 100, 100, 200));
		assertEquals(true,Q8.inRect(200, 100, 300, 200));
		System.out.print("한 변이 곂쳐 충돌하는 경우 정상동작\n\n");
	
		
		assertEquals(false,Q8.inRect(100, 250, 200, 300));
		assertEquals(false,Q8.inRect( 50, 250, 200, 300));
		assertEquals(false,Q8.inRect(150, 250, 200, 300));
		System.out.print("사각형이 아래쪽에 있을 때 정상동작\n");
		assertEquals(false,Q8.inRect(250, 100, 300, 200));
		assertEquals(false,Q8.inRect(250,  50, 300, 200));
		assertEquals(false,Q8.inRect(250, 150, 300, 200));
		System.out.print("사각형이 오른쪽에 있을 때 정상동작\n");
		assertEquals(false,Q8.inRect(100,  10, 200,  30));
		assertEquals(false,Q8.inRect(100,  10, 150,  30));
		assertEquals(false,Q8.inRect(100,  10, 250,  30));
		System.out.print("사각형이 위에 있을 때 정상동작\n");
		assertEquals(false,Q8.inRect( 10, 100,  30, 200));
		assertEquals(false,Q8.inRect( 10, 100,  30, 150));
		assertEquals(false,Q8.inRect( 10, 100,  30, 250));
		System.out.print("사각형이 왼쪽에 있을 때 정상동작\n");
		assertEquals(false,Q8.inRect( 10,  10,  30,  30));
		assertEquals(false,Q8.inRect(250, 250, 300, 300));
		System.out.print("그 외 충돌하지 않는 경우 정상동작\n");

	}

}

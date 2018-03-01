package travis;

import static org.junit.Assert.*;

import org.junit.Test;

public class testHello {

	@Test
	public void test() {
		assertEquals(9, hello.sq(3));
	}

}

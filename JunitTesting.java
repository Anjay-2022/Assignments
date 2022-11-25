package day20;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class JunitTesting {
	@Test
	public void happyCase() {
		User obj = new User();
		assertTrue("HAPPY", obj.checkFirstName("Anjay"));
		assertTrue("HAPPY", obj.checklastName("Singh"));
		assertTrue("HAPPY", obj.checkemail("anjay2013@gmail.com"));
		assertTrue("HAPPY", obj.checkpassword("Anjay@12"));
		assertTrue("HAPPY", obj.checkmobileno("+91 7053211617"));

	}

	@Test
	public void sadCase() {
		User obj = new User();
		assertTrue("HAPPY", obj.checkFirstName("anjay"));
		assertTrue("HAPPY", obj.checklastName("de"));
		assertTrue("HAPPY", obj.checkemail("anjay2013@gmail.com1"));
		assertTrue("HAPPY", obj.checkpassword("An@12"));
		assertTrue("HAPPY", obj.checkmobileno("+91 -7053211617"));
	}
}

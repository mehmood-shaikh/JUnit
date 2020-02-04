import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   TestJunitMessage.class,
   TestJunitMessage2.class
})
public class TestSuiteMessage {
	@Test
	public void test(){
		System.out.println("Inside test suite message");
		assertEquals(11,10);
	}
}

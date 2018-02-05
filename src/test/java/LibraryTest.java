import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
	@Test public void testSomeLibraryMethod() {
		Library classUnderTest = new Library();
		assertEquals(89, classUnderTest.fib(10));
	}
}

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;
import Andycow0.Lib.Girl;

public class ClothesTest {

	@Test
	public void test() {
		Girl target = new Girl();

		String actual = target.GetGender();

		Assert.assertEquals("Female", actual);
		// fail("Not yet implemented");
	}

}

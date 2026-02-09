package package1;

import org.testng.Assert;
import org.testng.annotations.Test;	
public class RunTest{
	@Test
	public void testPass() {
		Assert.assertEquals(App.display(55),"Pass");
	}
	
	@Test
	public void testFail() {
		Assert.assertEquals(App.display(35), "Fail");
	}
	
	@Test
	public void testInvalid() {
		Assert.assertEquals(App.display(-5), "invalid");
	}
}

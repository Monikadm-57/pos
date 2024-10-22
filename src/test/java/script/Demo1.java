package script;

import org.testng.annotations.Test;

import generic.BaseTest;

public class Demo1 extends BaseTest{

	@Test
	public void testA()
	{

		String title = driver.getTitle();
		test.info(title);
	}
}

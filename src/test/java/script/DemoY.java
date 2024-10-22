package script;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoY {

	@AfterMethod
	public void am(ITestResult testResult)
	{
		int status = testResult.getStatus();
		System.out.println("am:"+status);
	}
	
	@Test
	public void createUser()
	{
		System.out.println("createUser");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("deleteUser");
		Assert.fail();
	}
}

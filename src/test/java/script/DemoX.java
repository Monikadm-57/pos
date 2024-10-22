package script;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoX {

	@BeforeMethod
	public void bm(Method method)
	{
		String name = method.getName();
		
		System.out.println("bm:"+name);
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
	}
}

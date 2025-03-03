package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String getTimeStamp()
	{
		LocalDateTime n = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd_MM_YYYY_hh_mm_ss");
		String timeStamp = n.format(format);
		return timeStamp;
	}
	public static void takeScreenshot(WebDriver driver,String path)
	{
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File dstFile=new File(path);
		try 
		{
			FileUtils.copyFile(srcFile, dstFile);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public static String getProperty(String file,String key)
	{
		String value="";
		Properties p=new Properties();
		
		try 
		{
			p.load(new FileInputStream(file));
			value = p.getProperty(key);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return value;
	}
}

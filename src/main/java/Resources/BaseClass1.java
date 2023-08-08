package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
	
	public WebDriver driver;
	public Properties prop;
	
	public void driverInitilize() throws IOException
	{
		//this will read the properties file.
		FileInputStream fis=new FileInputStream("D:\\EDUCATION   FILES\\AkashJavaProject\\Indeedinspiring\\src\\main\\java\\Resources\\data.properties");
		
		
		//access the properties file 
		prop=new Properties();
		prop.load(fis);
		
		
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
				//fire fox driver 
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
				//Edge driver
		}
		else
		{
			System.out.println("please make sure the correct browser");
		}
		
	}
	
	
		@BeforeMethod
		public void OpenUrl1() throws IOException
		{
			driverInitilize();
			String urlname=prop.getProperty("urllink");
			driver.get(urlname);
		
		}
		
		
		/*@AfterMethod
		public void closeUrl()
		{
			driver.quit();
		}*/
	
	

}

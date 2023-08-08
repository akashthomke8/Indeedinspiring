package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Portal 
	{
		
		public WebDriver driver;
		
		private By Portal=By.xpath("//a[contains(text(),'Portal')]");
		private By Email=By.xpath("//input[@id=\"id_email\"]");
		private By AsseLOgin=By.xpath("//h3[contains(text(),'Login')]");
		private By OTP=By.xpath("//button[contains(text(),'SEND OTP')]");
		private By RecivOTP=By.xpath("//input[@type=\"text\"]");
		private By AsseOTP=By.xpath("//label[contains(text(),\"Otp\")]");
		private By Submitotp=By.xpath("//button[contains(text(),'SUBMIT')]");
		
		//private By Assert=By.xpath("")
		

		public  Portal(WebDriver driver2)
		{
			this.driver=driver2;
		}
		
		
		public WebElement ClickPortal()
		{
			return driver.findElement(Portal);
		}
		public WebElement Sendemail()
		{
			return driver.findElement(Email);
		}
		public WebElement AsseLogin()
		{
			return driver.findElement(AsseLOgin);
		}
		public WebElement ClickOTP()
		{
			return driver.findElement(OTP);
		}
		public WebElement Enterotp()
		{
			return driver.findElement(RecivOTP);
		}
		public WebElement AsseOTp()
		{
			return driver.findElement(AsseOTP);
		}
		public WebElement ClickSubmit()
		{
			return driver.findElement(Submitotp);
		}
	
	}

		package PageObjectModule;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		
				public class MouseHover1 
				{
			
						public WebDriver driver;
				
						private By HiAkash=By.xpath("//span[contains(text(),'Hi Akash!')]");
						
						public MouseHover1 (WebDriver driver2)
						{
							this.driver=driver2;
						}
						
						public WebElement PerformAkash()
						{
							return driver.findElement(HiAkash);
						}
						
				}

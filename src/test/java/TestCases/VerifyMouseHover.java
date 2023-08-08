		package TestCases;
		import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModule.MouseHover1;
		import Resources.BaseClass1;
		
		
		@Test
		public class VerifyMouseHover extends BaseClass1
		{
			public void moushover()
			{
				MouseHover1 obj=new MouseHover1(driver);
			
				
				Actions a=new Actions(driver);
				a.moveToElement(obj.PerformAkash()).perform();
				
				
				
			}
		}

		
package TestCases;

import org.testng.annotations.Test;

import PageObjectModule.Portal;
import Resources.BaseClass1;

import Resources.CommonMethods1;
import Resources.Constants1;

		public class VerifyPortal extends BaseClass1
		{
			@Test
			public void portal() throws InterruptedException
			{
				Portal obj=new Portal(driver);
				
				Thread.sleep(2000);
				obj.ClickPortal().click();
				Thread.sleep(2000);
				
				obj.Sendemail().sendKeys(Constants1.Email);
				CommonMethods1.HandleAsseration(obj.AsseLogin().getText(), "Login", "Error Massage is not matching");
				obj.ClickOTP().click();
				CommonMethods1.HandleAsseration(obj.AsseOTp().getText(), "OTP", "MASSAGE IS NOT MATCHING");
				obj.Enterotp().sendKeys(Constants1.OTP);
				obj.ClickSubmit().click();
			}
			
		
		}

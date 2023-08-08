		package Resources;

import org.testng.asserts.SoftAssert;

public class CommonMethods1 
		{
				public static void HandleAsseration(String Actual, String Expected, String Massage)
				{
					SoftAssert A=new SoftAssert();
					String ac=Actual;
					String Exp=Expected;
					A.assertEquals(ac, Exp, Massage);
					A.assertAll();
							
				}
				
				
		}

package driverScript;

import genericLibrary.Base;





import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageFactory.Login_Page;


public class Login extends Base{
	
	
	Logger loginLog = Logger.getLogger(Login.class);
	
	/*@Test(dataProvider="commondp",dataProviderClass = dataProvider.dataprovider_common.class)
	public void invalidLogin(Map<String,String> hm) throws Exception{
		String tcid = hm.get("ID");
		String order = hm.get("Order");
		startTest = eReports.startTest(tcid + "_" + order);	
		
		Login_Page LP = new Login_Page(driver);
		Click(LP.lnkLogin);
		LP.EnterData(hm);
		
		
	}*/
	
	@Test
	public static void flipkart()
	{
		System.out.println("WC");
		
		
	}

}

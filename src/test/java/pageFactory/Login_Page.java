package pageFactory;

import java.util.Map;

import genericLibrary.CommonActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends CommonActions{
	
	
	@FindBy(xpath="html/body/div[1]/div/header/div[1]/div[1]/div/ul/li[9]/a")
	public WebElement lnkLogin;
	
	@FindBy(xpath="//input[@value='' and @type='text']")
	public WebElement txtUserid;
	
	@FindBy(xpath="//input[@value='' and @type='password']")
	public WebElement txtPswd;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement btn;
	
	
	public Login_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void EnterData(Map<String,String> hm)
	{
		
		entervalue(txtUserid, hm.get("Username"));
		entervalue(txtPswd, hm.get("Password"));
		Click(btn);
		
		
	}
     
}



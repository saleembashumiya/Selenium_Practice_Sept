package dataProvider;

import java.text.SimpleDateFormat;
import java.util.Date;

import genericLibrary.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing extends Base{
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver-v0.12.0-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.google.com");
		
		System.out.println(System.getProperty("user.dir"));
		
		Date date = new Date();
		SimpleDateFormat sformat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
		String string = sformat.format(date);
		System.out.println(string);
		
	}

}

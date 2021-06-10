package com.logfourj.practices;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeWork3 {
	public static Logger log=Logger.getLogger("Output for third HomeWork");
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	static void LaunchBrowser()
	{
		try
		{
			log.info("The Execution of third HomeWork Starts Here!!!!!");
			System.setProperty("webdriver.gecko.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
			log.info("navigate Completed!!!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider="getLoginCredentials")
	public void login(String username,String password)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
			Thread.sleep(2000);
			log.info("Login successfully!!!!!");
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void CreateCustomer() {
		try {
			oBrowser.findElement(By.xpath("//*[@class='content tasks']")).click();
			oBrowser.findElement(By.xpath("//*[@class='downIcon']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@class='item createNewCustomer ellipsis']")).click();
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Customer1");
			log.info("customer name");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("Customer discription");
			log.info("discription  given Successfully");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();
			log.info("User Created Successfully");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void DeleteCustomer()
	{
		try {
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@class='editButton available']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@class='action']")).click();
			oBrowser.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
			oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);		
			Thread.sleep(1000);
			log.info("Customer Deleted Successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=6)
	static void logout() {
		try {
			Thread.sleep(1000);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			log.info("Logot successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void closeApplication()
	{
		
		try
		{
			Thread.sleep(1000);
			oBrowser.close();
			log.info("close application successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@DataProvider
	public Object[][] getLoginCredentials()
	{
		return new Object[][]  {{"admin","manager"}};
	}
}




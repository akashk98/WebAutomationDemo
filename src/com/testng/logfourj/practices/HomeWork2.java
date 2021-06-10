package com.logfourj.practices;

import org.apache.log4j.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeWork2 {
	public static Logger log=Logger.getLogger("Output for second HomeWork");
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			log.info("The Execution of second HomeWork Starts Here!!!!!");
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			log.info("Browser Lauched successfully");
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			log.info("navigated successfully");
			Thread.sleep(2000);
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
			oBrowser.findElement(By.id("username")).sendKeys(username);
			log.info("username entered");
			oBrowser.findElement(By.name("pwd")).sendKeys(password);
			log.info("Password entered");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			log.info("login button clicked successfull");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	public void flyWindowMinimize()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			log.info("fly Window Minimized");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=5)
	public void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[@class='content users']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("createUserDiv")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='firstName']")).sendKeys("jhone");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='lastName']")).sendKeys("a");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='email']")).sendKeys("john@gmail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='password']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			log.info("user created successfull");
			Thread.sleep(500);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	public void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[@class='userNameSpan']")).click();
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='firstName']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='firstName']")).sendKeys("smitt");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='lastName']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='lastName']")).sendKeys("b");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//input[@name='email']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='email']")).sendKeys("smitt@gmail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='username']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='password']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='password']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).clear();
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//span[@class='buttonTitle']")).click();
			log.info("user modified successfull");
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test (priority=7)
	public void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[@class='userNameSpan']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			log.info("user delted successfull");
		}
		catch(Exception e)
		{
			
		}
	}
	
	@Test(priority=8)
	public void logOut()
	{
		try
		{
			
			oBrowser.findElement(By.linkText("Logout")).click();
			log.info("logout successfull");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=9)
	public void closeApplication()
	{
		try
		{
			oBrowser.close();
			log.info("application closed successfull");
			log.info("The Execution of second HomeWork ends Here!!!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] getLoginCredentials()
	{
		return new Object[][]  {{"admin","manager"}}; //{"admin","manager"},{"admin","manager"}};
	}

}

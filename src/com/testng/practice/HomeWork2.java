package com.testng.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeWork2 {
	public static WebDriver oBrowser=null;
	@Test(priority=1)
		static void LaunchBrowser()
		{
			try
			{
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
				oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
				oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys(password);
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=4)
		static void CreateUser() {
			try {
				oBrowser.findElement(By.xpath("//*[@class='content users']")).click();
				oBrowser.findElement(By.xpath("//*[@class='buttonText']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Akash");
				oBrowser.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Kalkura");
				oBrowser.findElement(By.xpath("//*[@name='email']")).sendKeys("akash@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys("akash");
				oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("akash");
				oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("akash");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=5)
		static void ModifyUser() {
			try {
				oBrowser.findElement(By.xpath("//span[contains(text(),'lkura')]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@name='firstName']")).clear();
				oBrowser.findElement(By.xpath("//*[@name='lastName']")).clear();
				oBrowser.findElement(By.xpath("//*[@name='email']")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='username']")).clear();
				oBrowser.findElement(By.xpath("//*[@name='password']")).clear();
				oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).clear();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Sanath");
				oBrowser.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Kumar");
				oBrowser.findElement(By.xpath("//*[@name='email']")).sendKeys("sanath@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys("sanath");
				oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("sanath");
				oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("sanath");
				oBrowser.findElement(By.xpath("//*[@class='buttonTitle']")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=6)
		static void DeleteUser() {
			try {
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//span[contains(text(),'Sanath')]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@class='deleteContainer']")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);

				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=7)
		static void logout() {
			try {
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	@Test(priority=8)
		static void closeApplication()
		{
			try
			{

				oBrowser.close();
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



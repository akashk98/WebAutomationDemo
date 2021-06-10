package com.cssselector.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http:\\facebook.com");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("#email")).sendKeys("9535202272");
			oBrowser.findElement(By.cssSelector("#pass")).sendKeys("Mudradi");
			oBrowser.findElement(By.cssSelector("._6ltg")).click();
			Thread.sleep(20000);
			Alert oAlert=oBrowser.switchTo().alert();
			
			String content=oAlert.getText();
			System.out.println(content);
			
			oAlert.dismiss();
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("ijkhr0an pnx7fd3z sgqwj88q hzruof5a pmk7jnqg rnx8an3s fcg2cn6m")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}

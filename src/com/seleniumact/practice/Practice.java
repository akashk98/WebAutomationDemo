package com.seleniumact.practice;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Practice {
 
		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			logout();
			closeApplication();
		}
		
		static void launchBrowser()
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
		
		static void navigate()
		{
			try
			{
				oBrowser.get("http://www.sgtestinginstitute.com/login.php");
				WebDriverWait wait=new WebDriverWait(oBrowser, 30);
				wait.until(ExpectedConditions.attributeToBe(By.id("username"), "id", "username"));
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
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
		
		static void login()
		{
			try
			{
				oBrowser.findElement(By.id("email")).sendKeys("akalkoor1234@gmail.com");
				oBrowser.findElement(By.id("password")).sendKeys("Akalkoor1234@");
				oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/form/div/button")).click();
				WebDriverWait wait=new WebDriverWait(oBrowser, 60);
				wait.until(ExpectedConditions.textToBe(By.xpath("//btn btn-lg btn-login userlogin btn-block"), "Enter Time-Track"));
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void minimizeFlyOutWindow()
		{
			try
			{
				WebDriverWait wait=new WebDriverWait(oBrowser, 60);
				wait.until(ExpectedConditions.elementToBeClickable(By.id("gettingStartedShortcutsPanelId")));
				oBrowser.findElement(By.xpath("gettingStartedShortcutsPanelId")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				WebDriverWait wait=new WebDriverWait(oBrowser, 30);
				wait.until(ExpectedConditions.attributeToBe(By.id("username"), "id", "username"));
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void createUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("demo");
				oBrowser.findElement(By.name("lastName")).sendKeys("User1");
				oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}





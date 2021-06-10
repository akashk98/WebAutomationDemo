package com.logfourj.practices;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeWork9 {
	public static Logger log=Logger.getLogger("Output for seventh HomeWork");
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	static void launchBrowser()
	{
		try
		{
			log.info("execution of nineth program start here!!!");
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			log.info("Browser Maximized Successfully!!!");
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
			log.info("Browser navigated Successfully!!!");
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
			log.info("Username Entered SuccessFully");
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
			log.info("Password Entered SuccessFully");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
			Thread.sleep(2000);
			log.info("Login SuccessFully");
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
			log.info("PopUpWindow closed SuccessFully");
			log.info("admin login  Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void User1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("User1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			log.info("User 1 Created Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void User2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User2");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo2");
			oBrowser.findElement(By.name("email")).sendKeys("User2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("User2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			log.info("User 2 Created Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void User3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo3");
			oBrowser.findElement(By.name("email")).sendKeys("User3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("User3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User3");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			log.info("User 3 Created Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			log.info("Admin logot Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	static void User1Loging()
	{
		try
		{

			oBrowser.findElement(By.id("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("User1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			log.info("User 1 login Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	static void User1logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			log.info("User 1 logot Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	static void User2Loging()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("User2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			log.info("User 2 login Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	static void User2Logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			log.info("User 2 logout Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	static void User3Loging()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			oBrowser.findElement(By.name("pwd")).sendKeys("User3");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			log.info("User 3 login Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	static void User3Logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			log.info("User 3 logot Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=15)
	static void Admin1login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			log.info("Admin Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=16)
	static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			log.info("User 1 deleted Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=17)
	static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			log.info("User 2 deleted Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=18)
	static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			log.info("User 3 deleted Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=19)
	static void Adminlogout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			log.info("Admin logot Successfully!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=20)
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
			log.info("Application Closed Successfully!!!");
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



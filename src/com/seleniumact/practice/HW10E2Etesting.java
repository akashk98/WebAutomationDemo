package com.seleniumact.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW10E2Etesting {
	/*LaunchBrowser--> navigate -->
	 *  login as admin --> create user1 -->
	 *   logout --> login as user1 --> 
	 *   create user2 --> logout --> 
	 *   login as user2 --> create user3 --> 
	 *   logout-->
	 *    login as admin --> 
	 *  modify user1 --> logout --> 
	 *  login as user1 --> modify user2 -->logout -->
	 *   login as user2 -->  modify user3 --> logout -->
	 *    login as user2 --> delete user3 -->logout
	 *    --> login as user1 --> delete user2 --> logout --> 
	 *       
	 *       login as admin --> delete user1 --> 
	 *       logout --> close application
	 *       
	 */
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		Adminlogin();
		minimizeFlyOutWindow();
		User1();
		logout();
		User1Loging();
		User2();
		User1logout();
		User2Loging();
		User3();
		User2Logout();
		Admin1login();
		ModifyUser1();
		Admin1logout();
		User1LogingAgain();
		ModifyUser2();
		User1logoutAgain();
		User2LogingAgain();
		ModifyUser3();
		User2LogoutAgain();
		User2LogingAgainAgain();
		deleteUser3();
		User2LogoutAgainAgain();
		User1LogingAgainAgain();
		deleteUser2();
		User1logoutAgainAgain();
		Admin1loginAgain();
		deleteUser1();
		Admin1logoutAgainAgain();
		closeApplication();
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
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Adminlogin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User1logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User2Logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Admin1login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void ModifyUser1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("username")).clear();
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo1");
			oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("password")).sendKeys("demo1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("demo1");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Admin1logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User1LogingAgain()
	{
		try
		{

			oBrowser.findElement(By.id("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("pwd")).sendKeys("demo1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void ModifyUser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("username")).clear();
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo2");
			oBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("password")).sendKeys("demo2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("demo2");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User1logoutAgain()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User2LogingAgain()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("pwd")).sendKeys("demo2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void ModifyUser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("username")).clear();
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo3");
			oBrowser.findElement(By.name("email")).sendKeys("demo3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo3");
			oBrowser.findElement(By.name("password")).sendKeys("demo3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("demo3");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User2LogoutAgain()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User2LogingAgainAgain()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("pwd")).sendKeys("demo2");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User2LogoutAgainAgain()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User1LogingAgainAgain()
	{
		try
		{

			oBrowser.findElement(By.id("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("pwd")).sendKeys("demo1");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User1logoutAgainAgain()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Admin1loginAgain()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Admin1logoutAgainAgain()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
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
}


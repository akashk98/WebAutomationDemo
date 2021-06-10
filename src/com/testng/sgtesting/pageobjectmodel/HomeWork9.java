package com.sgtesting.pageobjectmodel;
import org.openqa.selenium.Alert;
/*LaunchBrowser--> navigate --> login as admin--> Create 3 users those are a) user1 b) user2 c)user3 --> Logout -->
 *   login as user1 --> Logout --> login as user2 --> logout -->
 *   login as user3 --> logout --> 
 * login as admin --> delete a) user1 b) user2 c)user3 --> logout --> close application
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork9 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		Login();
		FlyOutWindow();
		CreateUser1() ;
		CreateUser2();
		CreateUser3();
		logout();
		User1Login();
		User1logout();
		 User2Login();
		 User2logout();
		 User3Login();
		 User3logout();
		 Login2();
		 deleteUser1();
		 deleteUser2() ;
		 deleteUser3() ;
		 AdminLogot();
		 closeApplication();

	}
	static void LaunchBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			oBrowser.manage().window().maximize();
			oPage=new ActiTimePages(oBrowser);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void navigate() {
		try {
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void Login() {
		try {
			oPage.Username().sendKeys("admin");
			oPage.Password().sendKeys("manager");
			oPage.Login().click();
			Thread.sleep(4000);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void FlyOutWindow() {
		try {
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void CreateUser1() {
		try {
			oPage.UserButton().click();
			oPage.AddUser().click();
			oPage.Firstname().sendKeys("user1");
			oPage.Lastname().sendKeys("User1");
			oPage.Email().sendKeys("user1@gmail.com");
			Thread.sleep(1000);
			oPage.UserName().sendKeys("user1");
			oPage.PassWord().sendKeys("user1");
			oPage.ConfirmPassWord().sendKeys("user1");
			Thread.sleep(1000);
			oPage.CreateUser().click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void CreateUser2() {
		try {
			oPage.UserButton().click();
			oPage.AddUser().click();
			oPage.Firstname().sendKeys("user2");
			oPage.Lastname().sendKeys("User2");
			oPage.Email().sendKeys("user2@gmail.com");
			Thread.sleep(1000);
			oPage.UserName().sendKeys("user2");
			oPage.PassWord().sendKeys("user2");
			oPage.ConfirmPassWord().sendKeys("user2");
			Thread.sleep(1000);
			oPage.CreateUser().click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();

		}

	}
	static void CreateUser3() {
		try {
			oPage.UserButton().click();
			oPage.AddUser().click();
			oPage.Firstname().sendKeys("user3");
			oPage.Lastname().sendKeys("User3");
			oPage.Email().sendKeys("user3@gmail.com");
			Thread.sleep(1000);
			oPage.UserName().sendKeys("user3");
			oPage.PassWord().sendKeys("user3");
			oPage.ConfirmPassWord().sendKeys("user3");
			Thread.sleep(1000);
			oPage.CreateUser().click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();

		}

	}
	static void logout()
	{
		try
		{
			Thread.sleep(1000);
			oPage.LogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User1Login() {
		try {
			oPage.Username().sendKeys("user1");
			oPage.Password().sendKeys("user1");
			oPage.Login().click();
			
			Thread.sleep(4000);
			oPage.LoginVideo().click();
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void User1logout()
	{
		try
		{
			
			Thread.sleep(1000);
			oPage.LogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User2Login() {
		try {
			oPage.Username().sendKeys("user2");
			oPage.Password().sendKeys("user2");
			oPage.Login().click();
			Thread.sleep(4000);
			oPage.LoginVideo().click();
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void User2logout()
	{
		try
		{
			Thread.sleep(1000);
			oPage.LogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void User3Login() {
		try {
			oPage.Username().sendKeys("user3");
			oPage.Password().sendKeys("user3");
			oPage.Login().click();
			Thread.sleep(4000);
			oPage.LoginVideo().click();
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void User3logout()
	{
		try
		{
			Thread.sleep(1000);
			oPage.LogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Login2() {
		try {
			oPage.Username().sendKeys("admin");
			oPage.Password().sendKeys("manager");
			oPage.Login().click();
			Thread.sleep(4000);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void deleteUser1() {
		try {
			oPage.UserButton().click();
			oPage.User1Press().click();
			Thread.sleep(1000);
			oPage.DeleteModifyUser().click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void deleteUser2() {
		try {
			oPage.User2delete().click();
			Thread.sleep(1000);
			oPage.DeleteModifyUser().click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void deleteUser3() {
		try {
			oPage.User3delete().click();
			Thread.sleep(1000);
			oPage.DeleteModifyUser().click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void AdminLogot()
	{
		try
		{
			Thread.sleep(1000);
			oPage.LogoutLink().click();
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





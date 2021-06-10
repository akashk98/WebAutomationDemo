package com.sgtesting.pageobjectmodel;
import org.openqa.selenium.Alert;

/*LaunchBrowser--> navigate --> login as admin --> create user1 --> logout --> 

 * login as user1 --> create user2 --> logout --> 
 * login as user2 --> create user3 --> logout-->
 * login as admin --> modify user1 --> logout -->
 *  login as user1 --> modify user2 --> logout -->
 login as user2 --> modify user3 --> logout -->
  login as user2 --> delete user3 --> logout --> 
  *  login as user1 --> delete user2 --> logout --> 
   login as admin --> delete user1 --> logout --> close application
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork10 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		Login();
		FlyOutWindow();
		CreateUser1() ;
		Adminlogout();
		User1Login() ;
		//FlyOutWindow1();
		CreateUser2();
		User1logout();
		User2Login();
		 CreateUser3();
		 User2logout();
		 Login();
		 ModifyUser1() ;
		 Adminlogout();
		ModifiedUser1Login();
		 ModifyUser2() ;
		 User1logout();
		 ModifiedUser2Login();
		 ModifyUser3() ;
		 User2logout();
		 ModifiedUser2Login();
		 deleteUser3();
		 User1logout();
		 ModifiedUser1Login();
		 deleteUser2() ;
		 User1logout();
		 Login();
		 deleteUser3Last();
		 Adminlogout();
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
	static void Adminlogout()
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
		static void CreateUser2() {
			try {
				Thread.sleep(1000);
				oPage.saveButton().click();
				Thread.sleep(1000);
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
		static void CreateUser3() {
			try {
				Thread.sleep(1000);
				oPage.saveButton().click();
				Thread.sleep(1000);
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
		static void ModifyUser1() {
			try {
				oPage.UserButton().click();
				Thread.sleep(1000);
				oPage.User1Press().click();
				oPage.Firstname().clear();
				oPage.Lastname().clear();
				oPage.Email().clear();
				oPage.UserName().clear();
				oPage.PassWord().clear();
				oPage.ConfirmPassWord().clear();
				Thread.sleep(1000);
				oPage.Firstname().sendKeys("Sanath");
				oPage.Lastname().sendKeys("Kumar");
				oPage.Email().sendKeys("sanath@gmail.com");
				oPage.UserName().sendKeys("Sanath");
				oPage.PassWord().sendKeys("Sanath");
				oPage.ConfirmPassWord().sendKeys("Sanath");
				oPage.SaveChanges().click();
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();

			}
		}
		static void ModifiedUser1Login() {
			try {
				oPage.Username().sendKeys("Sanath");
				oPage.Password().sendKeys("Sanath");
				oPage.Login().click();

				Thread.sleep(4000);
				oPage.LoginVideo().click();
			}catch(Exception e) {
				e.printStackTrace();

			}
		}
		static void ModifyUser2() {
			try {
				Thread.sleep(1000);
				oPage.saveButton().click();
				Thread.sleep(1000);
				oPage.UserButton().click();
				Thread.sleep(1000);
				oPage.user2Button().click();
				oPage.Firstname().clear();
				oPage.Lastname().clear();
				oPage.Email().clear();
				oPage.UserName().clear();
				oPage.PassWord().clear();
				oPage.ConfirmPassWord().clear();
				Thread.sleep(1000);
				oPage.Firstname().sendKeys("Akash");
				oPage.Lastname().sendKeys("Kalkoor");
				oPage.Email().sendKeys("Akash@gmail.com");
				oPage.UserName().sendKeys("Akash");
				oPage.PassWord().sendKeys("Akash");
				oPage.ConfirmPassWord().sendKeys("Akash");
				oPage.SaveChanges().click();
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();

			}
		}
		static void ModifiedUser2Login() {
			try {
				oPage.Username().sendKeys("Akash");
				oPage.Password().sendKeys("Akash");
				oPage.Login().click();

				Thread.sleep(4000);
				oPage.LoginVideo().click();
			}catch(Exception e) {
				e.printStackTrace();

			}
		}
		static void ModifyUser3() {
			try {
				Thread.sleep(1000);
				oPage.saveButton().click();
				Thread.sleep(1000);
				oPage.UserButton().click();
				Thread.sleep(1000);
				oPage.user3Button().click();
				oPage.Firstname().clear();
				oPage.Lastname().clear();
				oPage.Email().clear();
				oPage.UserName().clear();
				oPage.PassWord().clear();
				oPage.ConfirmPassWord().clear();
				Thread.sleep(1000);
				oPage.Firstname().sendKeys("Anish");
				oPage.Lastname().sendKeys("Kumar");
				oPage.Email().sendKeys("Anish@gmail.com");
				oPage.UserName().sendKeys("Anish");
				oPage.PassWord().sendKeys("Anish");
				oPage.ConfirmPassWord().sendKeys("Anish");
				oPage.SaveChanges().click();
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();

			}
		}
		static void deleteUser3() {
			try {
				Thread.sleep(1000);
				oPage.saveButton().click();
				Thread.sleep(1000);
				oPage.UserButton().click();
				Thread.sleep(1000);
				oPage. user3ButtonSelect().click();
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
				Thread.sleep(1000);
				oPage.saveButton().click();
				Thread.sleep(1000);
				oPage.UserButton().click();
				Thread.sleep(1000);
				oPage.user2ButtonSelect().click();
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
		static void deleteUser3Last() {
			try {
				Thread.sleep(1000);
				oPage.saveButton().click();
				Thread.sleep(1000);
				oPage.UserButton().click();
				Thread.sleep(1000);
				oPage.user1ButtonSelect().click();
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
		
		
	

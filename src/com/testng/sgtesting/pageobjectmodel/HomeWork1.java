package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*lanchBrowser --> navigate --> login --> createUser --> deleteUser --> logout --> closeApplication*/
public class HomeWork1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		Login();
		FlyOutWindow();
		CreateUser();
		deleteUser();
		logout();
		closeApplication();
	}
	static void LaunchBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver", "G:\\\\ExampleAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\geckodriver.exe");
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
	static void CreateUser() {
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
	static void deleteUser() {
		try {
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
	static void logout()
	{
		try
		{	
			Thread.sleep(1000);
			oPage.LogoutLink().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}

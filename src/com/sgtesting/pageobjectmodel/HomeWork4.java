package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*lanchBrowser --> navigate --> login --> 
 * createCustomer -->modifyCustomer --> 
 * deleteCustomer --> logout --> closeApplication*/
public class HomeWork4 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		Login();
		FlyOutWindow();
		createcustomer();
		Modifycustomer() ;
		deletecustomer();
		logout();
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
	static void createcustomer() {
		try {
			oPage.TaskButton().click();
			oPage.AdnewCustorProject().click();
			oPage.AddCustomerButton().click();
			oPage.CustomerName1().sendKeys("Sanath");
			oPage.CustomerName1Disc().sendKeys("Web Development");
			Thread.sleep(1000);
			oPage.CustSubmit().click();
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void Modifycustomer() {
		try {
			oPage.CustAbvPress().click();
			Thread.sleep(1000);
			oPage.CustSettingButton().click();
			Thread.sleep(1000);
			oPage.PressName().click();
			oPage.CLearCustomer().clear();
			oPage.CLearCustomer().sendKeys("sanath kumar");
			Thread.sleep(1000);
			oPage.DiscSelect().click();
			oPage.DiscClear().clear();
			Thread.sleep(1000);
			oPage.DiscClear().sendKeys("java development");
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}	
	static void deletecustomer() {
		try {
			Thread.sleep(1000);
			oPage.settingPicture().click();
			Thread.sleep(1000);
			oPage.settingPicture().click();
			Thread.sleep(1000);
			oPage.ActionButtonCust().click();
			Thread.sleep(1000);
			oPage.DeleteCustButtonAfteraction().click();
			Thread.sleep(1000);
			oPage.DeleteParmanently().click();
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



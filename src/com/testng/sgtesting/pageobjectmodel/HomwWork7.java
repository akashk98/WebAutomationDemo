package com.sgtesting.pageobjectmodel;
/*.lanchBrowser --> navigate --> 
 * login --> createCustomer --> 
 * createProject --> createTasks -->
 *  deleteTasks --> logout --> closeApplication
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomwWork7 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		Login();
		FlyOutWindow();
		createcustomer();
		createProject();
		createAndDeleteTask();
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
	static void createProject() {
		try {
			oPage.AdnewCustorProject().click();
			Thread.sleep(1000);
			oPage.CreateProject().click();
			Thread.sleep(1000);
			oPage.ProjectName().sendKeys("Projrct 1");	
			Thread.sleep(1000);
			oPage.ProjectDiscription().sendKeys("about project");
			Thread.sleep(1000);
			oPage.SubmitProject().click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void createAndDeleteTask() {
		try {
			Thread.sleep(1000);
			oPage.AddTak().click();
			oPage.CreateTak().click();
			Thread.sleep(1000);
			oPage.Taskname().sendKeys("FirstProject");
			Thread.sleep(1000);
			oPage.TaskSubmit().click();
			Thread.sleep(1000);
			//
			oPage.SelectTask().click();
			Thread.sleep(1000);
			oPage.TaskDelete().click();
			Thread.sleep(1000);
			oPage.TaskDeleteConfirm().click();
		}catch(Exception e) {
			e.printStackTrace();

		}
	}
	static void deleteProject() {
		try {
		oPage.project1click().click();
		Thread.sleep(1000);
		oPage.projectSettingbutton().click();;
		Thread.sleep(1000);
		oPage.ProjectDelete().click();
		Thread.sleep(1000);
		oPage.DeleteAsking().click();
		Thread.sleep(1000);
		oPage.ProjectDeleteParmanently().click();
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


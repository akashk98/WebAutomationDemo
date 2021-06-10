package com.xpath.practice;
import org.openqa.selenium.By;
/*lanchBrowser --> navigate --> login --> createCustomer -->
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork5 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		login();
		CreateCustomer();
		CreateProject() ;
		DeleteProject() ;
		DeleteCustomer();
		logout();
		closeApplication();
	}
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
	static void login()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[starts-with(text(),'Log')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void CreateCustomer() {
		try {
			oBrowser.findElement(By.xpath("//*[@class='content tasks']")).click();
			oBrowser.findElement(By.xpath("//*[@class='downIcon']")).click();
			//oBrowser.findElement(By.xpath("//div[contains(text(),'Add')]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@class='item createNewCustomer ellipsis']")).click();
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Customer1");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("Customer discription");

			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void CreateProject() {
		try {
			oBrowser.findElement(By.xpath("//*[@class='plusIcon']")).click();
			oBrowser.findElement(By.xpath("//*[@class='item createNewProject ellipsis']")).click();
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).click();
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys("Project 1");		
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']")).click();		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void DeleteProject() {
		try {
			oBrowser.findElement(By.xpath("//div[contains(text(),'Project 1')]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);		
			oBrowser.findElement(By.xpath("//span[contains(text(),'Delete permanently')]")).click();
			oBrowser.findElement(By.xpath("//*[@class='projectPanel_deleteConfirm_submitTitle']")).click();		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void DeleteCustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@class='editButton available']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@class='action']")).click();
			oBrowser.findElement(By.xpath("//div[contains(text(),'Delete')]")).click();
			oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout() {
		try {
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}






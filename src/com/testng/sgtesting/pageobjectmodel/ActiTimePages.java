package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePages {
	public ActiTimePages(WebDriver oBrowser) {

		PageFactory.initElements(oBrowser,this);

	}
	private WebElement username;

	public  WebElement Username() {
		return username;
	}

	private WebElement pwd;

	public WebElement Password() {
		return pwd;
	}

	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement oLogout;

	public WebElement Login() {
		return oLogout;
	}
	private WebElement gettingStartedShortcutsPanelId;

	public WebElement getFlyOutWindow() {
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement UserOption;

	public WebElement UserButton() {
		return  UserOption;
	}
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adUser;

	public WebElement AddUser() {
		return adUser;
	}
	private WebElement userDataLightBox_firstNameField;

	public WebElement Firstname() {
		return	userDataLightBox_firstNameField;
	}
	private WebElement userDataLightBox_lastNameField;

	public WebElement Lastname() {
		return	userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;

	public WebElement Email() {
		return	userDataLightBox_emailField;
	}

	private WebElement userDataLightBox_usernameField;

	public WebElement UserName() {
		return	userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;

	public WebElement PassWord() {
		return	userDataLightBox_passwordField;
	}

	private WebElement userDataLightBox_passwordCopyField;

	public WebElement ConfirmPassWord() {
		return	userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement createuser;

	public WebElement CreateUser() {
		return	createuser;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement user1;

	public WebElement User1Press() {
		return	user1;

	}

	private WebElement userDataLightBox_deleteBtn;

	public WebElement deleteButtonPress() {
		return userDataLightBox_deleteBtn;

	}
	@FindBy(linkText="Logout")
	private WebElement oLnkLogout;
	public WebElement LogoutLink()
	{
		return oLnkLogout;

	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement savechanges;

	public WebElement SaveChanges() {
		return savechanges;
	}
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement modifieduserselection;

	public WebElement ModifyUserSelection() {
		return modifieduserselection;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement deletemodifyuser;

	public WebElement DeleteModifyUser() {
		return deletemodifyuser;
	}

	@FindBy(xpath="/html/body/div[4]/table/tbody/tr/td[3]/a/div[2]")
	private WebElement taskbutton;

	public WebElement TaskButton() {
		return taskbutton;
	}
	@FindBy(xpath="/html/body/div[12]/div[1]/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addcust;

	public WebElement AdnewCustorProject() {
		return addcust;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement addcustomer;

	public WebElement AddCustomerButton() {
		return addcustomer;
	}
	private WebElement customerLightBox_nameField;

	public WebElement CustomerName1() {
		return customerLightBox_nameField;

	}
	private WebElement customerLightBox_descriptionField;

	public WebElement CustomerName1Disc() {
		return customerLightBox_descriptionField;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]")
	private WebElement customersubmit;

	public WebElement CustSubmit() {
		return customersubmit;
	}


	@FindBy(xpath="/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement settingpicture;

	public WebElement settingPicture() {
		return settingpicture;
	}

	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement actionbutton;

	public WebElement ActionButtonCust() {
		return actionbutton;
	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[4]/div/div[3]/div")
	private WebElement deleteCustAfterAction;

	public WebElement DeleteCustButtonAfteraction() {
		return deleteCustAfterAction;
	}
	@FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")
	private WebElement deletePermanently;

	public WebElement DeleteParmanently() {
		return deletePermanently;
	}
	@FindBy(linkText="Logout")
	private WebElement oLnkLogout1;
	public WebElement getLogoutLink()
	{
		return oLnkLogout;

	}
	@FindBy(xpath="/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")
	private WebElement CustomerAbovePress;

	public WebElement CustAbvPress() {
		return CustomerAbovePress;

	}
	@FindBy(xpath="/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement CustSetting;

	public WebElement CustSettingButton() {
		return CustSetting;

	}

	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement ClickName;

	public WebElement PressName() {
		return ClickName;

	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[1]/div[3]/div/div[2]")
	private WebElement customerNamefield;

	public WebElement ClearCustName() {
		return customerNamefield;

	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement ClearCust;

	public WebElement CLearCustomer() {
		return ClearCust;

	}

	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement DiscriptionSelect;

	public WebElement DiscSelect() {
		return DiscriptionSelect;

	}

	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement DiscCLEAR;

	public WebElement DiscClear() {
		return DiscCLEAR;

	}
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement createproj;

	public WebElement CreateProject() {
		return createproj;

	}
	private WebElement projectPopup_projectNameField;

	public WebElement ProjectName() {
		return projectPopup_projectNameField;
	}

	private WebElement projectPopup_projectDescriptionField;

	public WebElement ProjectDiscription() {
		return projectPopup_projectDescriptionField;
	}

	@FindBy(xpath="/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")
	private WebElement submitproj;

	public WebElement SubmitProject() {
		return submitproj;

	}
	@FindBy(xpath="/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")
	private WebElement Project1click;

	public WebElement project1click() {
		return Project1click;

	}
	@FindBy(xpath="/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement Projectsettingbtn;

	public WebElement projectSettingbutton() {
		return  Projectsettingbtn;

	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement projectdelete;

	public WebElement ProjectDelete() {
		return  projectdelete;

	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[4]/div[4]/div/div[3]/div")
	private WebElement DeleteAsking;

	public WebElement DeleteAsking() {
		return  DeleteAsking;

	}
	private WebElement projectPanel_deleteConfirm_submitTitle;

	public WebElement ProjectDeleteParmanently() {
		return projectPanel_deleteConfirm_submitTitle;

	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement ModifyProjname;

	public WebElement ModifyProjName() {
		return  ModifyProjname;

	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement ModifyProjnameclic;

	public WebElement ModifyProjNameClick() {
		return  ModifyProjnameclic;
	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement Projrctdisc;

	public WebElement ProjectDiscriptionclick() {
		return   Projrctdisc;
	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement projdiscClear;

	public WebElement ProjectDiscriptionclear() {
		return   projdiscClear;
	}

	@FindBy(xpath="/html/body/div[12]/div[2]/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement addtask;

	public WebElement AddTak() {
		return  addtask ;
	}

	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createtask;

	public WebElement CreateTak() {
		return  createtask ;
	}
	@FindBy(xpath="/html/body/div[8]/div/div/div[1]/div[3]/table/tbody/tr[1]/td[1]/input")
	private WebElement firsttask;

	public WebElement Taskname() {
		return firsttask ;
	}

	private WebElement createTasksPopup_commitBtn;

	public WebElement TaskSubmit() {
		return createTasksPopup_commitBtn;

	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")
	private WebElement selectTask;

	public WebElement SelectTask() {
		return selectTask;

	}
	@FindBy(xpath="/html/body/div[12]/div[2]/div[1]/div[3]/div/div/div[4]")
	private WebElement Taskdelete;

	public WebElement TaskDelete() {
		return Taskdelete;
	}
	@FindBy(xpath="//*[@id=\"deleteTaskPopup_deleteConfirm_submitBtn\"]")
	private WebElement TaskdeleteConfirm;

	public WebElement TaskDeleteConfirm() {
		return TaskdeleteConfirm;
	}
	@FindBy(xpath="/html/body/div[3]/div[3]/div/span[1]")
	private WebElement loginviseo;

	public WebElement LoginVideo() {
		return loginviseo;
	}

	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement User2Delete;

	public WebElement User2delete() {
		return User2Delete;
	}

	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement User3Delete;

	public WebElement User3delete() {
		return User2Delete;
	}

	@FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement UserButton1;

	public WebElement User1Button() {
		return UserButton1;
	}
	@FindBy(xpath="//*[@id=\"SubmitTTButton\"]")
	private WebElement save;;

	public WebElement saveButton() {
		return save;
	}
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement UserButton2;

	public WebElement user2Button() {
		return UserButton2;
	}

	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement UserButton3;

	public WebElement user3Button() {
		return UserButton3;
	}

	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement UserButton3Select;

	public WebElement user3ButtonSelect() {
		return UserButton3Select;
	}

	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
	private WebElement UserButton2Select;

	public WebElement user2ButtonSelect() {
		return UserButton2Select;
	}

	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
	private WebElement UserButton1select;

	public WebElement user1ButtonSelect() {
		return UserButton1select;

	}
}